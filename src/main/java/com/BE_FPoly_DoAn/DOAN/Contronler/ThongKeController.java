package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichKhamServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/thong-ke")
@PreAuthorize("hasRole('ROLE_QUANLY')")
@RequiredArgsConstructor
public class ThongKeController {

    private final LichKhamServiceImpl lichKhamService;

    @GetMapping("/ThongKeTheoThang")
    public ResponseEntity<ServiceResponse<?>> thongKeTheoThangVaNam(@RequestParam int month,
                                                                    @RequestParam int year) {
        return ResponseEntity.ok(lichKhamService.thongKeTheoThang(month, year));
    }

    @GetMapping("/ThongKeTheoBacSi")
    public ResponseEntity<ServiceResponse<?>> thongKeTheoBacSi() {
        return ResponseEntity.ok(lichKhamService.thongKeTheoBacSi());
    }
}