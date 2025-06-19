package com.BE_FPoly_DoAn.DOAN.Contronler.NguoiDung;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Model.LoginRequest;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Security.RedisTemplateConfig;
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

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/auth")
public class UserAuthenticate {

    private final NguoiDungServiceImpl nguoiDungServicel;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final RedisTemplateConfig redisTemplateConfig;

    public UserAuthenticate(NguoiDungServiceImpl nguoiDungServicel,
                            RedisTemplateConfig redisTemplateConfig,
                            JwtService jwtService,
                            AuthenticationManager authenticationManager) {
        this.nguoiDungServicel = nguoiDungServicel;
        this.redisTemplateConfig = redisTemplateConfig;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    @GetMapping("/check-expirationtoken")
    public ResponseEntity<?> checkExpiration(@RequestParam String token) {
        try {
            Long timeExpiration = jwtService.getExpired(token);
            return ResponseEntity.ok("Thời gian hết hạn: " + timeExpiration);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Token không hợp lệ hoặc đã hết hạn");
        }
    }

    @PostMapping("/check-token")
    public ResponseEntity<?> checkToken(@RequestParam String token) {
        boolean exists = Boolean.TRUE.equals(redisTemplateConfig.redisTemplate().hasKey(token));
        String message = exists ? "Token nằm trong danh sách đen (Redis)" : "Token hợp lệ (không có trong Redis)";
        return ResponseEntity.ok(message);
    }

    @PostMapping("/login")
    public ResponseEntity<?> dangNhap(@RequestBody LoginRequest loginRequest) {
        try {
            Authentication authenticate = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getEmail(),
                            loginRequest.getMatKhau()
                    )
            );

            UserDetails userDetails = (UserDetails) authenticate.getPrincipal();
            String token = jwtService.generateToken(userDetails.getUsername());
            return ResponseEntity.ok().body(token);

        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email hoặc mật khẩu không đúng");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi hệ thống khi đăng nhập");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<?> dangXuat(HttpServletRequest httpRequest) {
        try {
            String tokenHeader = httpRequest.getHeader("Authorization");
            if (tokenHeader == null || !tokenHeader.startsWith("Bearer ")) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Token không hợp lệ hoặc không được cung cấp");
            }

            String token = tokenHeader.replace("Bearer ", "");
            long expiration = jwtService.getExpired(token) - System.currentTimeMillis();

            if (expiration > 0) {
                redisTemplateConfig.redisTemplate()
                        .opsForValue()
                        .set(token, "blacklisted", expiration, TimeUnit.MILLISECONDS);
                return ResponseEntity.ok("Đăng xuất thành công");
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Token đã hết hạn");
            }

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi hệ thống khi đăng xuất");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> dangKi(@RequestBody NguoiDung nguoiDung) {
        try {
            ServiceResponse<?> response = nguoiDungServicel.checkAccountRegister(nguoiDung);
            if (!response.isSuccess()) {
                return ResponseEntity.badRequest().body("Tài khoản đã tồn tại hoặc thông tin không hợp lệ");
            }

            nguoiDungServicel.sendCodeConfirm(nguoiDung);
            return ResponseEntity.ok("Mã xác nhận đã được gửi đến email của bạn");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Đăng ký thất bại: " + e.getMessage());
        }
    }

    @PostMapping("/confirm_OTP")
    public ResponseEntity<?> confirmOTP(@RequestParam(required = true) Integer otp) {
        try {
            nguoiDungServicel.save(otp);
            return ResponseEntity.ok().body("Xác nhận OTP thành công. Tài khoản đã được tạo.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Xác nhận OTP thất bại: " + e.getMessage());
        }
    }
}