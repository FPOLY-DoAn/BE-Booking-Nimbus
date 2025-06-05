package com.BE_FPoly_DoAn.DOAN.Fillter;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Security.RedisTemplateConfig;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.JwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
public class JwtFillter extends OncePerRequestFilter {
    @Autowired
    private JwtService jwtService;

    @Autowired
    private NguoiDungServiceImpl nguoiDungService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorization = request.getHeader("Authorization");
        String token = null;
        String soDienThoai = null;
        if(authorization != null){
            token = authorization.replace("Bearer ","");
            soDienThoai = jwtService.extractUserSoDienThoai(token);
        }

        if(token != null && redisTemplate.hasKey(token)){
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("Token is blacklisted");
            return;
        }

        if(soDienThoai != null && SecurityContextHolder.getContext().getAuthentication()==null){
            UserDetails userDetails = nguoiDungService.loadUserByUsername(soDienThoai);

            if(jwtService.isTokenValid(token, userDetails.getUsername())){
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null , userDetails.getAuthorities());
                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            }
        }
        filterChain.doFilter(request, response);
    }
}
