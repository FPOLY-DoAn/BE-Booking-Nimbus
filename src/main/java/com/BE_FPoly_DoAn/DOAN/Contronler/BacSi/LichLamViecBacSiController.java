package com.BE_FPoly_DoAn.DOAN.Contronler.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi.BacSiServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.JwtService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichLamViecBacSiServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bac-si/lich-lam-viec")
@PreAuthorize("hasAuthority('ROLE_BACSI')")
public class LichLamViecBacSiController {

    private final JwtService jwtService;
    private final BacSiServiceImpl bacSiService;
    private final LichLamViecBacSiServiceImpl lichLamViecService;

    public LichLamViecBacSiController(JwtService jwtService, BacSiServiceImpl bacSiService, LichLamViecBacSiServiceImpl lichLamViecService) {
        this.jwtService = jwtService;
        this.bacSiService = bacSiService;
        this.lichLamViecService = lichLamViecService;
    }

    @GetMapping("/me")
    public ResponseEntity<?> getLichLamViecCuaToi(HttpServletRequest request) {
        Integer userId = jwtService.extractUserIdFromRequest(request);

        BacSi bacSi = bacSiService.getByNguoiDungId(userId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy bác sĩ tương ứng"));

        return ResponseEntity.ok(lichLamViecService.getLichLamViecByBacSi(bacSi.getBacSiId()));
    }

    @PutMapping("/{lichId}")
    public ResponseEntity<?> suaLichLamViec(@PathVariable Integer lichId, @RequestBody LichLamViecDTO dto) {
        return ResponseEntity.ok(lichLamViecService.suaLichLamViec(lichId, dto));
    }

//    @DeleteMapping("/{lichId}")
//    public ResponseEntity<?> xoaLichLamViec(@PathVariable Integer lichId) {
//        return ResponseEntity.ok(lichLamViecService.xoaLichLamViec(lichId));
//    }
}