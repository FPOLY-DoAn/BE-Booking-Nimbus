package com.BE_FPoly_DoAn.DOAN.Contronler.BenhNhan;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan.BenhNhanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BenhNhanServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
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

    @PostMapping("/TaoMoiBenhNhan")
    @PreAuthorize("hasAuthority('ROLE_BENHNHAN')")
    public ResponseEntity<ServiceResponse<?>> getOrCreateBenhNhan(@AuthenticationPrincipal UserDetails userDetails) {
        return ResponseEntity.ok(service.getOrCreateBenhNhanIdByEmail(userDetails.getUsername()));
    }

    @GetMapping("/LayDanhSachBenhNhan")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/LayBenhNhanTheoId/{id}")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/CapNhatBenhNhan")
    @PreAuthorize("hasAuthority('ROLE_BENHNHAN')")
    public ResponseEntity<ServiceResponse<?>> update(@AuthenticationPrincipal UserDetails userDetails,
                                                     @RequestBody @Valid BenhNhanRequestDTO dto) {
        return ResponseEntity.ok(service.updateByEmail(userDetails.getUsername(), dto));
    }

    @GetMapping("/LayThongTinBenhNhan")
    @PreAuthorize("hasAuthority('ROLE_BENHNHAN')")
    public ResponseEntity<ServiceResponse<?>> getBenhNhanCuaToi(@AuthenticationPrincipal UserDetails userDetails) {
        String email = userDetails.getUsername(); // Thông thường username là email
        return ResponseEntity.ok(service.getBenhNhanByEmail(email));
    }
}