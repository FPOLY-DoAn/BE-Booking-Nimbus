package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiRequestDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi.BacSiServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bac-si")
@PreAuthorize("hasRole('ROLE_QUANLY')")
@RequiredArgsConstructor
@Tag(name = "Quản lý bác sĩ", description = "APIS chỉ có quyền admin")
public class BacSiController {

    private final BacSiServiceImpl bacSiService;

    @GetMapping("/LayDanhSachBacSi")
    @Operation(summary = "Lấy danh sách tất cả bác sĩ")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(bacSiService.getAllResponse());
    }

    @GetMapping("/LayBacSiTheoId/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    @Operation(summary = "Lấy bác sĩ theo ID", description = "Dành cho tất cả các role")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(bacSiService.getByIdResponse(id));
    }

    @PostMapping("/TaoMoiBacSi")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    @Operation(summary = "Tạo tài khoản bác sĩ", description = "Chỉ admin mới được tạo.")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody BacSiRequestDTO dto) {
        return ResponseEntity.ok(bacSiService.create(dto));
    }

    @PutMapping("/CapNhatBacSi/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_BACSI', 'ROLE_QUANLY')")
    @Operation(summary = "Cập nhật bác sĩ theo ID")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id,
                                                     @Valid @RequestBody BacSiRequestDTO dto) {
        System.out.println("Lưu bác sĩ"+id);
        System.out.println("BacSiRequestDTO"+ dto.getTenKhoa());
        return ResponseEntity.ok(bacSiService.update(id, dto));

    }
}