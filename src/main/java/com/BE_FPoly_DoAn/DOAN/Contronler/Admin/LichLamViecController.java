package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecDTO;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichLamViecBacSiServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/lich-lam-viec")
@PreAuthorize("hasAuthority('ROLE_QUANLY')")
@Tag(name = "Tạo lịch làm việc cho bác sĩ")
public class LichLamViecController {

    private final LichLamViecBacSiServiceImpl lichLamViecService;

    public LichLamViecController(LichLamViecBacSiServiceImpl lichLamViecService) {
        this.lichLamViecService = lichLamViecService;
    }

    @PostMapping("/TaoLichLamViec")
    @Operation(summary = "Tạo ngày khám theo ca của lịch làm việc bác sĩ")
    public ResponseEntity<?> create(@RequestParam Integer bacSiId, @RequestBody LichLamViecDTO dto) {
        return ResponseEntity.ok(lichLamViecService.taoLichLamViec(bacSiId, dto));
    }

    @GetMapping("/LayDanhSachLichLamViec")
    @Operation(summary = "Xem tất cả lịch làm việc đã tạo")
    public ResponseEntity<?> getAllLichLamViec() {
        return ResponseEntity.ok(lichLamViecService.getAllLichLamViec());
    }

    @GetMapping("/LayLichTheoBacSiId/{bacSiId}")
    @Operation(summary = "Xem lịch làm việc của một bác sĩ")
    public ResponseEntity<?> getLichLamViecByBacSi(@PathVariable Integer bacSiId) {
        return ResponseEntity.ok(lichLamViecService.getLichLamViecByBacSi(bacSiId));
    }

    @GetMapping("/LichLamViecHomNay")
    @Operation(summary = "Xem lịch làm việc hôm nay của tất cả bác sĩ")
    public ResponseEntity<?> getLichLamViecHomNay() {
        return ResponseEntity.ok(lichLamViecService.getLichLamViecHomNay());
    }

    @GetMapping("/ChiTietLichLamViecHomNay")
    @Operation(summary = "Xem lịch hôm nay kèm giờ khám chi tiết")
    public ResponseEntity<?> getLichHomNayChiTiet() {
        return ResponseEntity.ok(lichLamViecService.getLichLamViecHomNayChiTiet());
    }

    @GetMapping("/LichLamViecTheoNgay")
    @Operation(summary = "Xem lịch làm việc của tất cả bác sĩ theo ngày tùy chọn")
    public ResponseEntity<?> getLichLamViecTheoNgay(@RequestParam String ngay) {
        return ResponseEntity.ok(lichLamViecService.getLichLamViecTheoNgay(LocalDate.parse(ngay)));
    }
}