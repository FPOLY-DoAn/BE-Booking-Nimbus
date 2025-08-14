package com.BE_FPoly_DoAn.DOAN.Contronler.Guest;

import com.BE_FPoly_DoAn.DOAN.Dao.GuestAppointmentService;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi.BacSiServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RequiredArgsConstructor
@RestController
@RequestMapping("/guest")
public class GuestAppointmentController {

    private final GuestAppointmentService guestService;
    private final BacSiServiceImpl bacSiService;

    @GetMapping("/chuyen-khoa")
    public ResponseEntity<ServiceResponse<?>> getAllChuyenKhoa() {
        return ResponseEntity.ok(guestService.getAllChuyenKhoa());
    }

    @GetMapping("/bac-si")
    public ResponseEntity<ServiceResponse<?>> getBacSiTheoChuyenKhoa(@RequestParam String tenKhoa) {
        return ResponseEntity.ok(guestService.getBacSiTheoChuyenKhoa(tenKhoa));
    }

    @GetMapping("/bac-si/{id}/ngay-lam-viec")
    public ResponseEntity<ServiceResponse<?>> getNgayLamViec(@PathVariable Integer id) {
        return ResponseEntity.ok(guestService.getNgayLamViec(id));
    }

    @GetMapping("/bac-si/{id}/ngay/{ngay}/ca")
    public ResponseEntity<ServiceResponse<?>> getCaLamViec(
            @PathVariable Integer id,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate ngay) {
        return ResponseEntity.ok(guestService.getCaLamViec(id, ngay));
    }

    @GetMapping("/bac-si/{id}/ngay/{ngay}/ca/{ca}/gio-trong")
    public ResponseEntity<ServiceResponse<?>> getGioTrong(
            @PathVariable Integer id,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate ngay,
            @PathVariable String ca) {
        return ResponseEntity.ok(guestService.getGioTrongTheoCa(id, ngay, ca));
    }

    @GetMapping("/LayDanhSachBacSi")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(bacSiService.getAllResponse());
    }

    @GetMapping("/chuyen-khoa/{tenKhoa}/lich-trong")
    public ResponseEntity<ServiceResponse<?>> getLichKhamTrong(@PathVariable String tenKhoa) {
        return ResponseEntity.ok(guestService.getLichKhamTrongTheoChuyenKhoa(tenKhoa));
    }

    @GetMapping("/chuyen-khoa/{tenKhoa}/ngay/{ngay}/ca/{ca}/gio-trong")
    public ResponseEntity<ServiceResponse<?>> getGioTrongChuyenKhoa(
            @PathVariable String tenKhoa,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate ngay,
            @PathVariable String ca) {
        return ResponseEntity.ok(guestService.getGioTrongTheoChuyenKhoa(tenKhoa, ngay, ca));
    }
}