package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.DoiMatKhauDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final NguoiDungServiceImpl nguoiDungService;
    private final JwtService jwtService;

    public AccountController(NguoiDungServiceImpl nguoiDungService, JwtService jwtService) {
        this.nguoiDungService = nguoiDungService;
        this.jwtService = jwtService;
    }

    @GetMapping("/LayDanhSachNguoiDung")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<List<NguoiDungDTO>>> getAllUsers() {
        List<NguoiDungDTO> list = nguoiDungService.getAllUsers();
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.USER_LIST_SUCCESS, list));
    }

    @GetMapping("/LayThongTin")
    public ResponseEntity<?> getUserInfo(HttpServletRequest request) {
        Integer userId = jwtService.extractUserIdFromRequest(request);
        return ResponseEntity.ok(nguoiDungService.getCurrentUserInfo(userId));
    }

    @PutMapping("/CapNhatThongTin")
    public ResponseEntity<?> updateUser(@Valid @RequestBody NguoiDungDTO dto, HttpServletRequest request) {
        Integer userId = jwtService.extractUserIdFromRequest(request);
        return ResponseEntity.ok(nguoiDungService.updateCurrentUserInfo(userId, dto));
    }

    @PutMapping("/DoiMatKhau")
    public ResponseEntity<?> changePassword(@Valid @RequestBody DoiMatKhauDTO dto, HttpServletRequest request) {
        Integer userId = jwtService.extractUserIdFromRequest(request);
        return ResponseEntity.ok(nguoiDungService.changePassword(userId, dto.getOldPassword(), dto.getNewPassword()));
    }
}