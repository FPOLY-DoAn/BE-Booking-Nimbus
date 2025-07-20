package com.BE_FPoly_DoAn.DOAN.Contronler.LeTan;

import com.BE_FPoly_DoAn.DOAN.Entity.LeTan;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LeTan.LeTanServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("le_tan")
public class QuanLyLeTanController {
    private LeTanServiceImpl leTanService;
    private NguoiDungServiceImpl nguoiDungService;
    private JwtService jwtService;

    public QuanLyLeTanController(LeTanServiceImpl leTanService, JwtService jwtService, NguoiDungServiceImpl nguoiDungService) {
        this.leTanService = leTanService;
        this.nguoiDungService = nguoiDungService;
        this.jwtService = jwtService;
    }

//    @GetMapping("/infor")
//    public ResponseEntity<?> getInforLeTan(HttpServletRequest request){
//        String header = request.getHeader("Authorization");
//
//        if (header == null || !header.startsWith("Bearer ")) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Thiếu Authorization Header");
//        }
//
//        String token = header.substring(7);
//        Object result = leTanService.getById(token);
//
//        if (result instanceof Integer && ((Integer) result == -1)) {
//            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Không có quyền lễ tân");
//        }
//
//        return ResponseEntity.ok(result);
//    }
}
