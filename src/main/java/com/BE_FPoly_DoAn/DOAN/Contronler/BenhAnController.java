package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BenhAnServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/benh-an")
@PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
@Tag(name = "Quản lý bệnh án")
@RequiredArgsConstructor
public class BenhAnController {

    private final BenhAnServiceImpl benhAnService;

    @PostMapping("/TaoBenhAn")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody BenhAnDTO dto) {
        return ResponseEntity.ok(benhAnService.create(dto));
    }

    @GetMapping("/LayDanhSachBenhAn")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(benhAnService.getAll());
    }

    @GetMapping("/LayBenhAnTheoId/{id}")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(benhAnService.getById(id));
    }

    @PutMapping("/CapNhatBenhAn/{id}")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id, @Valid @RequestBody BenhAnDTO dto) {
        return ResponseEntity.ok(benhAnService.update(id, dto));
    }

    @GetMapping("/LayBenhAnTheoBenhNhan/{benhNhanId}")
    public ResponseEntity<ServiceResponse<?>> getByBenhNhanId(@PathVariable Integer benhNhanId) {
        return ResponseEntity.ok(benhAnService.getByBenhNhanId(benhNhanId));
    }

    // @DeleteMapping("/XoaBenhAn/{id}")
    // @PreAuthorize("hasRole('ROLE_QUANLY')")
    // public ResponseEntity<ServiceResponse<?>> delete(@PathVariable Integer id) {
    //     return ResponseEntity.ok(benhAnService.delete(id));
    // }
}
