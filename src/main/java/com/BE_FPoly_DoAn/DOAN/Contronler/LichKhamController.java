package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichKhamServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/lich-kham")
@PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
@RequiredArgsConstructor
public class LichKhamController {

    private final LichKhamServiceImpl lichKhamService;

    @PostMapping("/TaoLichKham")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody LichKhamDTO dto) {
        return ResponseEntity.ok(lichKhamService.create(dto));
    }

    @GetMapping("/LayDanhSachLichKham")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(lichKhamService.getAll());
    }

    @GetMapping("/LayLichKhamTheoId/{id}")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(lichKhamService.getById(id));
    }

    @PutMapping("/CapNhatLichKham/{id}")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id, @Valid @RequestBody LichKhamDTO dto) {
        return ResponseEntity.ok(lichKhamService.update(id, dto));
    }

    // @DeleteMapping("/XoaLichKham/{id}")
    // @PreAuthorize("hasRole('ROLE_QUANLY')")
    // public ResponseEntity<ServiceResponse<?>> delete(@PathVariable Integer id) {
    //     return ResponseEntity.ok(lichKhamService.delete(id));
    // }

    @PostMapping("/TimKiemLichKham")
    public ResponseEntity<ServiceResponse<?>> search(@RequestBody LichKhamFilterDTO filter) {
        return ResponseEntity.ok(lichKhamService.searchLichKham(filter));
    }

}