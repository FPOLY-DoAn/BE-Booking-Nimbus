package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Model.LoginRequest;
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
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;

import java.util.concurrent.TimeUnit;

import static com.BE_FPoly_DoAn.DOAN.Response.NotificationCode.OTP_EXPIRED;

@RestController
@RequestMapping("/auth")
public class UserAuthenticate {
    private final NguoiDungServiceImpl nguoiDungServicel;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final BlackListServiceImpl blackListService;

    public UserAuthenticate(NguoiDungServiceImpl nguoiDungServicel, JwtService jwtService, AuthenticationManager authenticationManager, BlackListServiceImpl blackListService) {
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
            return ResponseEntity.ok(ServiceResponse.success("200", "Đăng nhập thành công", token));
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ServiceResponse.error("401", "Email hoặc mật khẩu không đúng")
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ServiceResponse.error("500", "Lỗi hệ thống khi đăng nhập")
            );
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

            return ResponseEntity.ok().body("Đăng xuất thành công!");
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ServiceResponse.error("500", "Lỗi hệ thống khi đăng xuất"));
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> dangKi(@RequestBody NguoiDungDTO NguoiDungDTO) {
        try {
            ServiceResponse<?> response = nguoiDungServicel.checkAccountRegister(NguoiDungDTO);
            if (!response.isSuccess()) {
                return ResponseEntity.badRequest().body(ServiceResponse.error("500", "Tài khoản đã tồn tại hoặc thông tin không hợp lệ"));
            }
            nguoiDungServicel.sendCodeConfirm(NguoiDungDTO);
            return ResponseEntity.ok(ServiceResponse.success("200","Mã xác nhận đã được gửi đến email của bạn"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ServiceResponse.error("500","Đăng ký thất bại: " + e.getMessage()));
        }
    }

    @PostMapping("/confirm_OTP")
    public ResponseEntity<?> confirmOTP(@RequestParam(required = true) String otp) {
        try {
            int result = nguoiDungServicel.save(otp);

            return switch (result) {
                case 1 -> ResponseEntity.ok(ServiceResponse.success("200", "Bạn đã đăng kí thành công"));
                case -1 -> ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(ServiceResponse.error("OTP_001", "OTP không tồn tại"));
                case -2 -> ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(ServiceResponse.error("OTP_002", "Mã OTP đã hết hạn"));
                case 0 -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(ServiceResponse.error("500", "Đã có lỗi xảy ra khi xử lý đăng ký"));
                default -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(ServiceResponse.error("500", "Lỗi không xác định"));
            };
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error("500", "Xác nhận OTP thất bại: " + e.getMessage()));
        }
    }

}