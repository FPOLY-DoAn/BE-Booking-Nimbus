package com.BE_FPoly_DoAn.DOAN.Utils;

import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import jakarta.servlet.http.HttpServletRequest;

public class TokenUtils {

    public static String getEmailFromRequest(HttpServletRequest request, JwtService jwtService) {
        String tokenHeader = request.getHeader("Authorization");
        if (tokenHeader == null || !tokenHeader.startsWith("Bearer ")) {
            throw new RuntimeException(NotificationCode.AUTH_INVALID_TOKEN.message());
        }
        String token = tokenHeader.replace("Bearer ", "");
        return jwtService.extractUserEmail(token);
    }
}
