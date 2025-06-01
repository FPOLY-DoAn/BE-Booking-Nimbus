package com.BE_FPoly_DoAn.DOAN.Fillter;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.JwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Configuration
public class JwtFillter extends OncePerRequestFilter {
    @Autowired
    private JwtService jwtService;

    @Autowired
    private NguoiDungServiceImpl nguoiDungService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorization = request.getHeader("Authorization");
        String token = null;
        String userName = null;
        if(authorization != null){
            token = authorization.replace("Bearer ","");
            userName = jwtService.extractUserName(token);
        }

//        if(userName != null && SecurityContextHolder.getContext().getAuthentication()==null){
//            UserDetails userDetails = nguoiDungService.loadUserByUsername(username);
//            if(){
//
//            }
//        }
    }
}
