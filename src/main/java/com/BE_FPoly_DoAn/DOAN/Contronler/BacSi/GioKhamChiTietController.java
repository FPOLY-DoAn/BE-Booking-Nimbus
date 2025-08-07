package com.BE_FPoly_DoAn.DOAN.Contronler.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.TaoGioTuDongDTO;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.GioKhamChiTietServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gio-kham")
@PreAuthorize("hasAnyAuthority('ROLE_QUANLY', 'ROLE_LETAN')")
@Tag(name = "Quản lý giờ khám")
public class GioKhamChiTietController {

    private final GioKhamChiTietServiceImpl gioKhamChiTietService;

    public GioKhamChiTietController(GioKhamChiTietServiceImpl gioKhamChiTietService) {
        this.gioKhamChiTietService = gioKhamChiTietService;
    }

    @GetMapping("/{lichId}")
    @Operation(summary = "Lấy danh sách giờ khám theo lịch làm việc bác sĩ")
    public ResponseEntity<?> getSlotsByLich(@PathVariable Integer lichId) {
        return ResponseEntity.ok(gioKhamChiTietService.getByLichId(lichId));
    }

    @PostMapping("/TaoGioKhamChiTiet")
    @Operation(summary = "Tạo giờ khám thủ công")
    public ResponseEntity<?> createGioKhamChiTiet(@RequestBody GioKhamChiTietDto dto) {
        return ResponseEntity.ok(gioKhamChiTietService.create(dto));
    }

    @PostMapping("/TaoGioKhamChiTietTuDong")
    @Operation(summary = "Tạo giờ khám tự động theo bước nhảy")
    public ResponseEntity<?> generateGioKham(@RequestBody TaoGioTuDongDTO req) {
        return ResponseEntity.ok(gioKhamChiTietService.generate(req));
    }
}