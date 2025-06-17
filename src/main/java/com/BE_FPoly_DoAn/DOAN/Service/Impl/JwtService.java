package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.*;

@Service
public class JwtService {
    @Value("${jwt.secret}")
    private String salt;

    @Autowired
    private NguoiDungServiceImpl nguoiDungService;

    @Autowired
    private PhanQuyenServiceImpl phanQuyenService;

    //cung cấp thông tin tạo token
    public String generateToken(String soDienThoai) {
        Map<String, Object> claims = new HashMap<>();
        NguoiDung newNguoiDung = nguoiDungService.findBySoDienThoai(soDienThoai);
        List<PhanQuyen> phanQuyenList = newNguoiDung.getPhanQuyens();
        boolean isBacSi = false;
        boolean isQuanLy = false;
        boolean isLeTan = false;
        boolean isBenhNhan = false;
        if (!newNguoiDung.getPhanQuyens().isEmpty()) {
            for (PhanQuyen pq : phanQuyenList) {
                if (pq.getVaiTro().getVaiTroId() == 1) {
                    isBacSi = true;
                }
                if (pq.getVaiTro().getVaiTroId() == 2) {
                    isBenhNhan = true;
                }
                if (pq.getVaiTro().getVaiTroId() == 3) {
                    isQuanLy = true;
                }
                if (pq.getVaiTro().getVaiTroId() == 4) {
                    isLeTan = true;
                }
            }
        }
        claims.put("isBacSi", isBacSi);
        claims.put("isQuanLy", isQuanLy);
        claims.put("isLeTan", isLeTan);
        claims.put("isBenhNhan", isBenhNhan);
        claims.put("soDienThoai", newNguoiDung.getSoDienThoai());

        return createToken(claims, newNguoiDung.getSoDienThoai());
    }

    // tạo token
    public String createToken(Map<String, Object> claims, String email) {

        long expirationTime = 1000 * 60 * 60 * 10;
         return Jwts.builder().setClaims(claims)
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS256, generateKeyJwt())
                .compact();
    }

    // tạo chữ kí cho token
    public Key generateKeyJwt() {
        byte[] signKey = Decoders.BASE64.decode(salt);
        return Keys.hmacShaKeyFor(signKey);
    }

    //lấy ra số điện thoại từ token
    public String extractUserEmail(String token) {
        return extractAllClaims(token).getSubject();
    }

    //lấy ra tất cả thông tin từ token
    public Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(generateKeyJwt())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    //kiểm tra token còn sử dụng được không
    public boolean isTokenValid(String token, String email) {
        String emailAfterExtract = extractUserEmail(token);
        return (emailAfterExtract.equals(email) && !isTokenExpired(token));
    }

    // kiểm tra token còn thời gian sử dụng không
    public boolean isTokenExpired(String token) {
        return extractAllClaims(token).getExpiration().before(new Date());
    }

    //lấy ra thời gian của token
    public long getExpired(String token) {
        Claims claims = extractAllClaims(token);
        return claims.getExpiration().getTime();
    }


}
