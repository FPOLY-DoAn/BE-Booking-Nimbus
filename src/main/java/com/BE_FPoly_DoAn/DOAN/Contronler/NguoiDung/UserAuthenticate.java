package com.BE_FPoly_DoAn.DOAN.Contronler.NguoiDung;

import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Model.LoginRequest;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Security.RedisTemplateConfig;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/auth")
public class UserAuthenticate {
    private final NguoiDungServiceImpl nguoiDungServicel;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final RedisTemplateConfig redisTemplateConfig;

    public UserAuthenticate(NguoiDungServiceImpl nguoiDungServicel, RedisTemplateConfig redisTemplateConfig, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.nguoiDungServicel = nguoiDungServicel;
        this.redisTemplateConfig = redisTemplateConfig;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    @GetMapping("/check-expirationtoken")
    public ResponseEntity<?> checkExpiration(@RequestParam String token) {
        Long timeExiration = jwtService.getExpired(token);
        return ResponseEntity.ok("Expiration " + timeExiration);
    }

    //Kiểm tra token trong blacklisted
    @PostMapping("/check-token")
    public ResponseEntity<?> checkToken(@RequestParam String token) {
        boolean exists = Boolean.TRUE.equals(redisTemplateConfig.redisTemplate().hasKey(token));
        return ResponseEntity.ok("Token " + (exists ? "tồn tại trong Redis (BLACKLIST)" : "không có trong Redis"));
    }


    @PostMapping("/login")
    public ResponseEntity<?> dangNhap(@RequestBody LoginRequest loginRequest) {
        try {
            Authentication authenticate = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getMatKhau()));
            UserDetails userDetails = (UserDetails) authenticate.getPrincipal();
            //tạo token cho người dùng vừa đăng nhập
            final String token = jwtService.generateToken(userDetails.getUsername());
            return ResponseEntity.ok().body(token);
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Đăng nhập thất bại");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<?> dangXuat(HttpServletRequest httpRequest) {
        try {
            String tokenHeader = httpRequest.getHeader("Authorization");
            //Kiểm tra có token
            if (tokenHeader.startsWith("Bearer ")) {
                String token = tokenHeader.replace("Bearer ", "");
                long expiration = jwtService.getExpired(token) - System.currentTimeMillis();
                //chèn token vào blacklist
                redisTemplateConfig.redisTemplate()
                        .opsForValue()
                        .set(token, "blacklisted", expiration, TimeUnit.MILLISECONDS);
            }
            return ResponseEntity.ok().build();
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Đăng xuất thất bại");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> dangKi(@RequestBody NguoiDungDTO NguoiDungDTO) {
        try {
            ServiceResponse<?> response = nguoiDungServicel.checkAccountRegister(NguoiDungDTO);
            if (!response.isSuccess()) {
                return ResponseEntity.badRequest().body(response.getData());
            }
            nguoiDungServicel.sendCodeConfirm(NguoiDungDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Đăng kí thất bại");
        }
    }

    @PostMapping("/confirm_OTP")
    public ResponseEntity<?> confirmOTP(@RequestParam(required = true) Integer otp) {
        try {
            nguoiDungServicel.save(otp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Xác nhận mã OTP thất bại");
        }
        return ResponseEntity.ok().body("Đã tạo tài khoản thành công");
    }
}
