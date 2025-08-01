package com.BE_FPoly_DoAn.DOAN.Contronler.BenhNhan;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BenhNhanServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/benh-nhan")
@PreAuthorize("hasAuthority('ROLE_QUANLY')")
@Tag(name = "Lấy theo ID và danh sách , cập nhật bệnh nhân")
public class BenhNhanController {

    private final BenhNhanServiceImpl service;

    public BenhNhanController(BenhNhanServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/LayDanhSachBenhNhan")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/LayBenhNhanTheoId/{id}")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/CapNhatBenhNhan/{id}")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id,
                                                     @RequestBody @Valid BenhNhanDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

//    @DeleteMapping("/XoaBenhNhan/{id}")
//    public ResponseEntity<ServiceResponse<?>> delete(@PathVariable Integer id) {
//        return ResponseEntity.ok(service.delete(id));
//    }
}