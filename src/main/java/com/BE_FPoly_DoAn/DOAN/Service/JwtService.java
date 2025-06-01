package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.PhanQuyenServiceImpl;
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
public class JwtService  {
    @Value("${jwt.secret}")
    private static String salt;

    @Autowired
    private NguoiDungServiceImpl nguoiDungService;

    @Autowired
    private PhanQuyenServiceImpl phanQuyenService;

    public String generateToken(String tenNguoiDung){
        Map<String, Object> claims = new HashMap<>();
        Optional<NguoiDung> newNguoiDung = nguoiDungService.findByName(tenNguoiDung);
        List<PhanQuyen> phanQuyenList = newNguoiDung.get().getPhanQuyens();
        boolean isBacSi = false;
        boolean isQuanLy = false;
        boolean isLeTan = false;
        boolean isBenhNhan = false;
        if(!newNguoiDung.get().getPhanQuyens().isEmpty()){
            for (PhanQuyen pq : phanQuyenList){
                if(pq.getVaiTro().getVaitro_id() == 1){
                    isBacSi = true;
                }
                if(pq.getVaiTro().getVaitro_id() == 2){
                    isBenhNhan = true;
                }
                if(pq.getVaiTro().getVaitro_id() == 3){
                    isQuanLy = true;
                }
                if(pq.getVaiTro().getVaitro_id() == 4){
                    isLeTan = true;
                }
            }
        }
        claims.put("isBacSi",isBacSi);
        claims.put("isQuanLy",isQuanLy);
        claims.put("isLeTan",isLeTan);
        claims.put("isBenhNhan",isBenhNhan);
        claims.put("fullName", newNguoiDung.get().getHoten());

        return createToken(claims, newNguoiDung.get().getHoten());
    }

    public String createToken(Map<String, Object> claims, String hoten) {
        long expirationTime = 1000 * 60 * 60 * 10;
        return Jwts.builder().setClaims(claims)
                .setSubject(hoten)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS256, generateKeyJwt())
                .compact();
    }

    public Key generateKeyJwt() {
        byte [] signKey = Decoders.BASE64.decode(salt);
        return Keys.hmacShaKeyFor(signKey);
    }

    public String extractUserName(String token){
        return extractAllClaims(token).getSubject();
    }

    public Claims extractAllClaims(String token){
        return Jwts.parserBuilder()
                .setSigningKey(generateKeyJwt())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public boolean isTokenValid(String token, String userName){
        String usernameAfterExtract = extractUserName(token);
        return (usernameAfterExtract.equals(userName) && !isTokenExpired(token));
    }

    public boolean isTokenExpired(String token){
        return extractAllClaims(token).getExpiration().before(new Date());
    }

}
