package com.BE_FPoly_DoAn.DOAN.Contronler.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecDto;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichLamViecBacSiServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bac-si/lich-lam-viec")
@PreAuthorize("hasAuthority('ROLE_BACSI')")
public class LichLamViecBacSiController {

    private final LichLamViecBacSiServiceImpl lichLamViecService;

    public LichLamViecBacSiController(LichLamViecBacSiServiceImpl lichLamViecService) {
        this.lichLamViecService = lichLamViecService;
    }

    @GetMapping("/{bacSiId}")
    public ResponseEntity<?> getLichLamViec(@PathVariable Integer bacSiId) {
        return ResponseEntity.ok(lichLamViecService.getLichLamViecByBacSi(bacSiId));
    }

//    @PutMapping("/{lichId}")
//    public ResponseEntity<?> suaLichLamViec(@PathVariable Integer lichId,
//                                            @RequestBody LichLamViecDto dto) {
//        return ResponseEntity.ok(lichLamViecService.suaLichLamViec(lichId, dto));
//    }

//    @DeleteMapping("/{lichId}")
//    public ResponseEntity<?> xoaLichLamViec(@PathVariable Integer lichId) {
//        return ResponseEntity.ok(lichLamViecService.xoaLichLamViec(lichId));
//    }
}