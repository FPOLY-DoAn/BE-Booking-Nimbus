package com.BE_FPoly_DoAn.DOAN.Contronler.NguoiDung;

import com.BE_FPoly_DoAn.DOAN.Security.LoginRequest;
import com.BE_FPoly_DoAn.DOAN.Service.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/auth")
public class UserAuthenticate {
    @Autowired
    private NguoiDungService nguoiDungServicel;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> dangNhap(@RequestBody LoginRequest loginRequest){
        try {            System.out.println("TK & MK"+ loginRequest.getTaiKhoan()+ loginRequest.getMatKhau());

            Authentication authenticate = authenticationManager.authenticate(
                   new UsernamePasswordAuthenticationToken(loginRequest.getTaiKhoan(), loginRequest.getMatKhau()));

            UserDetails userDetails = (UserDetails) authenticate.getPrincipal();
            final String token= jwtService.generateToken(userDetails.getUsername());
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(token);
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Đăng nhập thất bại");
        }


    }
}
