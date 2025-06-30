package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Model.LoginRequest;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BlackListServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserAuthenticate {
    private final NguoiDungServiceImpl nguoiDungServicel;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final BlackListServiceImpl blackListService;

    public UserAuthenticate(NguoiDungServiceImpl nguoiDungServicel, JwtService jwtService,
                            AuthenticationManager authenticationManager, BlackListServiceImpl blackListService) {
        this.nguoiDungServicel = nguoiDungServicel;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
        this.blackListService = blackListService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> dangNhap(@RequestBody LoginRequest loginRequest) {
        try {
            Authentication authenticate = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getEmail(),
                            loginRequest.getMatKhau()));

            UserDetails userDetails = (UserDetails) authenticate.getPrincipal();
            final String token = jwtService.generateToken(userDetails.getUsername());

            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.AUTH_LOGIN_SUCCESS, token));
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(ServiceResponse.error(NotificationCode.AUTH_LOGIN_FAIL));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<?> dangXuat(HttpServletRequest httpRequest) {
        try {
            String tokenHeader = httpRequest.getHeader("Authorization");
            if (tokenHeader != null && tokenHeader.startsWith("Bearer ")) {
                String token = tokenHeader.replace("Bearer ", "");
                long millisLeft = jwtService.getExpired(token) - System.currentTimeMillis();
                if (millisLeft > 0) {
                    blackListService.save(token, millisLeft);
                }
            }
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.AUTH_LOGOUT_SUCCESS));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> dangKi(@RequestBody NguoiDungDTO nguoiDungDTO) {
        try {
            ServiceResponse<?> response = nguoiDungServicel.checkAccountRegister(nguoiDungDTO);
            if (!response.isSuccess()) {
                return ResponseEntity.badRequest().body(ServiceResponse.error(NotificationCode.USER_EMAIL_EXISTS));
            }
            nguoiDungServicel.sendCodeConfirm(nguoiDungDTO);
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(ServiceResponse.error(NotificationCode.USER_REGISTER_FAIL));
        }
    }

    @PostMapping("/confirm_OTP")
    public ResponseEntity<?> confirmOTP(@RequestParam String otp) {
        try {
            int result = nguoiDungServicel.save(otp);

            return switch (result) {
                case 1 -> ResponseEntity.ok(ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS));
                case -1 -> ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(ServiceResponse.error(NotificationCode.OTP_INVALID));
                case -2 -> ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(ServiceResponse.error(NotificationCode.OTP_EXPIRED));
                case 0 -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(ServiceResponse.error(NotificationCode.USER_REGISTER_FAIL));
                default -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
            };
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
        }
    }
}