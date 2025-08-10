package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.ThongKe.ThongKeKhoaDTO;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichKhamServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy.ThongKeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/thong-ke")
@PreAuthorize("hasRole('ROLE_QUANLY')")
@RequiredArgsConstructor
@Tag(name = "Xem thống kê theo Bác sĩ, Tháng")
public class ThongKeController {

    private final ThongKeServiceImpl thongKeService;
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

    @GetMapping("/ThongKeBenhNhanTheoGioiTinh")
    public ResponseEntity<ServiceResponse<?>> thongKeBenhNhanTheoGioiTinh() {
        return ResponseEntity.ok(thongKeService.thongKeBenhNhanTheoGioiTinh());
    }

    @GetMapping("/ThongKeDoanhThuTheoThang")
    public ResponseEntity<ServiceResponse<?>> thongKeDoanhThuTheoThang() {
        return ResponseEntity.ok(thongKeService.thongKeDoanhThuTheoThang());
    }

    @GetMapping("/ThongKeDonThuocTheoThang")
    public ResponseEntity<ServiceResponse<?>> thongKeDonThuocTheoThang() {
        return ResponseEntity.ok(thongKeService.thongKeDonThuocTheoThang());
    }

    @GetMapping("/ThongKeBenhTheoTen")
    public ResponseEntity<ServiceResponse<?>> thongKeSoLuongBenhTheoTen() {
        return ResponseEntity.ok(thongKeService.thongKeSoLuongBenhTheoTen());
    }

    @GetMapping("/ThongKeHoaDonTheoDichVu")
    public ResponseEntity<ServiceResponse<?>> thongKeHoaDonTheoDichVu() {
        return ResponseEntity.ok(thongKeService.thongKeHoaDonTheoDichVu());
    }

    @GetMapping("/TheoKhoa")
    @Operation(summary = "Thống kê theo khoa (có thể lọc theo năm/tháng, kèm tăng trưởng so với tháng trước)")
    public ResponseEntity<ServiceResponse<?>> thongKeTheoKhoa(
            @RequestParam(required = false) Integer nam,
            @RequestParam(required = false) Integer thang
    ) {
        List<ThongKeKhoaDTO> result = thongKeService.thongKeTheoKhoa(nam, thang);
        return ResponseEntity.ok(
                ServiceResponse.success(NotificationCode.FETCH_SUCCESS, result)
        );
    }
}