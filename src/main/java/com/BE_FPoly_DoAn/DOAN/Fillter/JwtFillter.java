package com.BE_FPoly_DoAn.DOAN.Fillter;

import com.BE_FPoly_DoAn.DOAN.Dao.BlacklistRepository;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class JwtFillter extends OncePerRequestFilter {

    private JwtService jwtService;
    private BlacklistRepository blacklistRepository;

    public JwtFillter(JwtService jwtService, BlacklistRepository blacklistRepository) {
        this.jwtService = jwtService;
        this.blacklistRepository = blacklistRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String path = request.getRequestURI();

        // Cho phép truy cập swagger
        if (path.startsWith("/swagger-ui")
                || path.startsWith("/v3/api-docs")
                || path.startsWith("/swagger-resources")
                || path.equals("/swagger-ui.html")) {
            filterChain.doFilter(request, response);
            return;
        }

        // Lấy token từ header
        String authorization = request.getHeader("Authorization");
        String token = null;
        String email = null;

        if (authorization != null && authorization.startsWith("Bearer ")) {
            token = authorization.replace("Bearer ", "");
            email = jwtService.extractUserEmail(token);
        }

        // Nếu token nằm trong blacklist
        if (token != null && blacklistRepository.existsByTokenBlackList(token)) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("Token is blacklisted");
            return;
        }

        // Nếu chưa được xác thực trong context thì xử lý
        if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            Claims claims = jwtService.extractAllClaims(token);
            List<String> roles = claims.get("roles", List.class);

            if (roles == null || roles.isEmpty()) {
                response.setStatus(HttpStatus.FORBIDDEN.value());
                response.getWriter().write("Token không chứa quyền truy cập");
                return;
            }

            List<GrantedAuthority> authorities = roles.stream()
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
            UserDetails userDetails = new User(email, "", authorities);

            if (jwtService.isTokenValid(token, userDetails.getUsername())) {
                UsernamePasswordAuthenticationToken authenticationToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, authorities);

                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authenticationToken);

                System.out.println("Authorities đã set: " + authenticationToken.getAuthorities());
            }
        }
        filterChain.doFilter(request, response);
    }
}
