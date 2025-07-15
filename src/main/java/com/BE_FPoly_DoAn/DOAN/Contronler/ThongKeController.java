package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichKhamServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/thong-ke")
@RequiredArgsConstructor
public class ThongKeController {

    private final LichKhamServiceImpl lichKhamService;

    @GetMapping("/thang")
    @PreAuthorize("hasRole('ROLE_QUANLY')")
    public ServiceResponse<?> thongKeThang() {
        return lichKhamService.thongKeTheoThang();
    }

    @GetMapping("/bac-si")
    @PreAuthorize("hasRole('ROLE_QUANLY')")
    public ServiceResponse<?> thongKeTheoBacSi() {
        return lichKhamService.thongKeTheoBacSi();
    }
}