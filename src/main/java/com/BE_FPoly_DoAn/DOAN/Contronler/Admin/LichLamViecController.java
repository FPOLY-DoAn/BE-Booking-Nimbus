package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecDTO;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichLamViecBacSiServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/lich-lam-viec")
@PreAuthorize("hasAuthority('ROLE_QUANLY')")
public class LichLamViecController {

    private final LichLamViecBacSiServiceImpl lichLamViecService;

    public LichLamViecController(LichLamViecBacSiServiceImpl lichLamViecService) {
        this.lichLamViecService = lichLamViecService;
    }

    @PostMapping("/TaoLichLamViec")
    @Operation(summary = "Tạo ngày khám theo ca của lịch làm việc bác sĩ")
    public ResponseEntity<?> create(@RequestParam Integer bacSiId,
                                            @RequestBody LichLamViecDTO dto) {
        return ResponseEntity.ok(lichLamViecService.taoLichLamViec(bacSiId, dto));
    }
}
