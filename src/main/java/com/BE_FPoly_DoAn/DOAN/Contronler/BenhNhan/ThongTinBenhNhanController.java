package com.BE_FPoly_DoAn.DOAN.Contronler.BenhNhan;

import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BenhNhanServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ho-so-ca-nhan")
@PreAuthorize("hasAuthority('ROLE_BENHNHAN')")
public class ThongTinBenhNhanController {

    private final BenhNhanServiceImpl service;

    public ThongTinBenhNhanController(BenhNhanServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/HoSoBenhAn")
    public ResponseEntity<ServiceResponse<?>> getBenhAn(@AuthenticationPrincipal UserDetails userDetails) {
        String email = userDetails.getUsername();
        ServiceResponse<?> response = service.getBenhAnByEmail(email);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/LichSuKham")
    public ResponseEntity<ServiceResponse<?>> getLichSuKham(@AuthenticationPrincipal UserDetails userDetails) {
        String email = userDetails.getUsername();
        ServiceResponse<?> response = service.getLichSuKhamByEmail(email);
        return ResponseEntity.ok(response);
    }
}