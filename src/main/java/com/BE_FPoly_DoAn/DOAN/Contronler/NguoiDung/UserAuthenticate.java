package com.BE_FPoly_DoAn.DOAN.Contronler.NguoiDung;

import com.BE_FPoly_DoAn.DOAN.Model.LoginRequest;
import com.BE_FPoly_DoAn.DOAN.Model.SmsModelRequest;
import com.BE_FPoly_DoAn.DOAN.Security.RedisTemplateConfig;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.SmsService;
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
    @Autowired
    private NguoiDungService nguoiDungServicel;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private RedisTemplateConfig redisTemplateConfig;

    @Autowired
    private SmsService smsService;

    @PostMapping("/check-token")
    public ResponseEntity<?> checkToken(@RequestParam String token) {
        boolean exists = Boolean.TRUE.equals(redisTemplateConfig.redisTemplate().hasKey(token));
        return ResponseEntity.ok("Token " + (exists ? "tồn tại trong Redis (BLACKLIST)" : "không có trong Redis"));
    }


    @PostMapping("/login")
    public ResponseEntity<?> dangNhap(@RequestBody LoginRequest loginRequest) {
        try {
            Authentication authenticate = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getSoDienThoai(), loginRequest.getMatKhau()));
            UserDetails userDetails = (UserDetails) authenticate.getPrincipal();
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
            System.out.println("Token is " + tokenHeader);
            if (tokenHeader.startsWith("Bearer ")) {
                String token = tokenHeader.replace("Bearer ", "");
                long expiration = jwtService.getExpired(token) - System.currentTimeMillis();
                redisTemplateConfig.redisTemplate()
                        .opsForValue()
                        .set(token, "blacklisted", expiration, TimeUnit.MILLISECONDS);            }
            return ResponseEntity.ok().build();
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Đăng xuất thất bại");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> dangKi(@RequestParam long soDienThoai) {
        try {
            smsService.sendCodeAuth(soDienThoai);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Đăng xuất thất bại");
        }
    }
}
