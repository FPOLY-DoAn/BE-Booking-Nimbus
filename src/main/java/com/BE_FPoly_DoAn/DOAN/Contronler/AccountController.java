package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.DoiMatKhauDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final NguoiDungServiceImpl nguoiDungService;
    private final JwtService jwtService;

    public AccountController(NguoiDungServiceImpl nguoiDungService, JwtService jwtService) {
        this.nguoiDungService = nguoiDungService;
        this.jwtService = jwtService;
    }

    @GetMapping("/info")
    public ResponseEntity<?> getUserInfo(HttpServletRequest request) {
        Integer userId = jwtService.extractUserIdFromRequest(request);
        return ResponseEntity.ok(nguoiDungService.getCurrentUserInfo(userId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@Valid @RequestBody NguoiDungDTO dto, HttpServletRequest request) {
        Integer userId = jwtService.extractUserIdFromRequest(request);
        return ResponseEntity.ok(nguoiDungService.updateCurrentUserInfo(userId, dto));
    }

    @PutMapping("/change-password")
    public ResponseEntity<?> changePassword(@Valid @RequestBody DoiMatKhauDTO dto, HttpServletRequest request) {
        Integer userId = jwtService.extractUserIdFromRequest(request);
        return ResponseEntity.ok(nguoiDungService.changePassword(userId, dto.getOldPassword(), dto.getNewPassword()));
    }
}
