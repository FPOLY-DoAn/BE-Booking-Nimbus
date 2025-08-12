package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.QuanLyRequestDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy.QuanLyServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quan-ly")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ROLE_QUANLY')")
@Tag(name = "Quản lý tài khoản quản lý", description = "APIs chỉ có quyền admin")
public class QuanLyController {

    private final QuanLyServiceImpl quanLyService;

    @GetMapping("/LayDanhSachQuanLy")
    @Operation(summary = "Lấy danh sách tất cả tài khoản quản lý")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(quanLyService.getAllResponse());
    }

    @GetMapping("/LayQuanLyTheoId/{id}")
    @Operation(summary = "Lấy thông tin tài khoản quản lý theo ID")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(quanLyService.getByIdResponse(id));
    }

    @PostMapping("/TaoMoiQuanLy")
    @Operation(summary = "Tạo tài khoản quản lý mới")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody QuanLyRequestDTO dto) {
        return ResponseEntity.ok(quanLyService.create(dto));
    }

    @PutMapping("/CapNhatQuanLy/{id}")
    @Operation(summary = "Cập nhật thông tin tài khoản quản lý theo ID")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id,
                                                     @Valid @RequestBody QuanLyRequestDTO dto) {
        return ResponseEntity.ok(quanLyService.update(id, dto));
    }
}