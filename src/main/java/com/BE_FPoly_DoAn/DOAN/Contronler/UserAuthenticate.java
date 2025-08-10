package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan.BenhNhanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Model.LoginRequest;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BenhNhanServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BlackListServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@Tag(name = "Quản lý tài khoản" , description = "Đăng nhập, Đăng kí, Đăng xuất, Quên mật khẩu")
public class UserAuthenticate {
    private final NguoiDungServiceImpl nguoiDungServicel;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final BlackListServiceImpl blackListService;
    private final BenhNhanServiceImpl benhNhanService;

    public UserAuthenticate(NguoiDungServiceImpl nguoiDungServicel, JwtService jwtService,
                            AuthenticationManager authenticationManager, BlackListServiceImpl blackListService, BenhNhanServiceImpl benhNhanService) {
        this.nguoiDungServicel = nguoiDungServicel;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
        this.blackListService = blackListService;
        this.benhNhanService = benhNhanService;
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
    public ResponseEntity<?> dangKi(@Valid @RequestBody NguoiDungDTO nguoiDungDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors().stream()
                    .map(err -> {
                        try {
                            NotificationCode code = NotificationCode.valueOf(err.getDefaultMessage());
                            return err.getField() + ": " + code.message();
                        } catch (IllegalArgumentException ex) {
                            return err.getField() + ": " + err.getDefaultMessage();
                        }
                    }).toList();
            return ResponseEntity.badRequest().body(
                    ServiceResponse.error(NotificationCode.VALIDATION_FAILED, errors)
            );
        }

        try {
            ServiceResponse<?> response = nguoiDungServicel.checkAccountRegister(nguoiDungDTO);
            if (!response.isSuccess()) {
                return ResponseEntity.badRequest().body(response);
            }
            nguoiDungServicel.sendCodeConfirm(nguoiDungDTO);
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.OTP));
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
                default -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
            };
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
        }
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestParam String email) {
        Optional<NguoiDung> optional = nguoiDungServicel.getByEmailOptional(email);
        if (optional.isEmpty()) {
            return ResponseEntity.badRequest().body(ServiceResponse.error("EMAIL_NOT_FOUND", "Email không tồn tại trong hệ thống."));
        }

        boolean sent = nguoiDungServicel.sendResetPasswordOtp(email);
        if (sent) {
            return ResponseEntity.ok(ServiceResponse.success("OTP_SENT", "Mã OTP đã được gửi về email."));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error("OTP_SEND_FAIL", "Không thể gửi OTP. Vui lòng thử lại."));
        }
    }

    @PostMapping("/verify-reset-otp")
    public ResponseEntity<?> verifyResetOtp(@RequestParam String email, @RequestParam String otp) {
        int result = nguoiDungServicel.verifyResetPasswordOtp(email, otp);
        return switch (result) {
            case 1 -> ResponseEntity.ok(ServiceResponse.success("OTP_VALID", "Mã OTP hợp lệ."));
            case -1 -> ResponseEntity.badRequest().body(ServiceResponse.error("OTP_INVALID", "Mã OTP không đúng."));
            case -2 -> ResponseEntity.badRequest().body(ServiceResponse.error("OTP_EXPIRED", "Mã OTP đã hết hạn."));
            case -3 -> ResponseEntity.badRequest().body(ServiceResponse.error("EMAIL_NOT_FOUND", "Email không tồn tại."));
            default -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error("VERIFY_FAIL", "Xác thực OTP không thành công."));
        };
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> resetPassword(
            @RequestParam String email,
            @RequestParam String newPassword) {

        boolean success = nguoiDungServicel.resetPassword(email, newPassword);
        if (success) {
            return ResponseEntity.ok(ServiceResponse.success("RESET_SUCCESS", "Mật khẩu đã được cập nhật."));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error("RESET_FAIL", "Không thể đặt lại mật khẩu."));
        }
    }

    @GetMapping("/resend-otp")
    public ResponseEntity<?> resendOTP(@RequestParam String email) {
        boolean result = nguoiDungServicel.resendOtpForRegistration(email);
        if (result) {
            return ResponseEntity.ok(ServiceResponse.success("RESEND_OTP_SUCCESS", "Mã xác nhận mới đã được gửi đến email."));
        } else {
            return ResponseEntity.badRequest().body(ServiceResponse.error("RESEND_OTP_FAILED", "Không thể gửi lại OTP. Email chưa đăng ký hoặc đã xác nhận."));
        }
    }

    @PutMapping("/thong-tin-bo-sung")
    public ResponseEntity<?> themThongTinBenhNhan(
            @RequestBody @Valid BenhNhanRequestDTO dto,
            HttpServletRequest request) {

        try {
            String tokenHeader = request.getHeader("Authorization");
            if (tokenHeader == null || !tokenHeader.startsWith("Bearer ")) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(ServiceResponse.error(NotificationCode.AUTH_INVALID_TOKEN));
            }

            String token = tokenHeader.replace("Bearer ","");
            String email = jwtService.extractUserEmail(token);

            ServiceResponse<?> response = benhNhanService.themThongTinBenhNhan(dto, email);

            return ResponseEntity.status(response.isSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST)
                    .body(response);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(ServiceResponse.error(NotificationCode.AUTH_INVALID_TOKEN, e.getMessage()));
        }
    }
}