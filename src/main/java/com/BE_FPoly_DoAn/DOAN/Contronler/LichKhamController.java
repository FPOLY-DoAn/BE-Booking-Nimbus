package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichKhamServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lich-kham")
@RequiredArgsConstructor
@Tag(name = "Quản lý lịch khám", description = "CRUD lịch khám, đặt lịch cho bệnh nhân")
public class LichKhamController {

    private final LichKhamServiceImpl lichKhamService;

    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    @PostMapping("/TaoLichKham")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody LichKhamDTO dto) {
        return ResponseEntity.ok(lichKhamService.create(dto));
    }

    @GetMapping("/LayDanhSachLichKham")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(lichKhamService.getAll());
    }

    @GetMapping("/LayLichKhamTheoId/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(lichKhamService.getById(id));
    }

    @PutMapping("/CapNhatLichKham/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id, @Valid @RequestBody LichKhamDTO dto) {
        return ResponseEntity.ok(lichKhamService.update(id, dto));
    }

    @PostMapping("/TimKiemLichKham")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> search(@RequestBody LichKhamFilterDTO filter) {
        return ResponseEntity.ok(lichKhamService.searchLichKham(filter));
    }
}