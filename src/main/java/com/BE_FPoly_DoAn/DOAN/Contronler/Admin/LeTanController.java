package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.LeTanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LeTan.LeTanServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/le-tan")
@RequiredArgsConstructor
@Tag(name = "Quản lý lễ tân", description = "APIs chỉ có quyền admin")
public class LeTanController {

    private final LeTanServiceImpl leTanService;

    @GetMapping("/LayDanhSachLeTan")
    @Operation(summary = "Lấy danh sách tất cả lễ tân")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(leTanService.getAllResponse());
    }

    @GetMapping("/LayLeTanTheoId/{id}")
    @Operation(summary = "Lấy thông tin lễ tân theo ID")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(leTanService.getByIdResponse(id));
    }

    @PostMapping("/ThemMoiLeTan")
    @PreAuthorize("hasRole('ROLE_QUANLY')")
    @Operation(summary = "Tạo tài khoản lễ tân")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody LeTanRequestDTO dto) {
        return ResponseEntity.ok(leTanService.create(dto));
    }

    @PutMapping("/CapNhatLeTan/{id}")
    @PreAuthorize("hasRole('ROLE_QUANLY')")
    @Operation(summary = "Cập nhật lễ tân theo ID")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id,
                                                     @Valid @RequestBody LeTanRequestDTO dto) {
        return ResponseEntity.ok(leTanService.update(id, dto));
    }
}