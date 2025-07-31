package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.ThanhToanDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.ThanhToanServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/thanh-toan")
@RequiredArgsConstructor
public class ThanhToanController {

    private final ThanhToanServiceImpl thanhToanService;

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_BENHNHAN', 'ROLE_LETAN', 'ROLE_BACSI', 'ROLE_QUANLY')")
    public ServiceResponse<?> create(@Valid @RequestBody ThanhToanDTO dto) {
        return thanhToanService.create(dto);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_QUANLY', 'ROLE_LETAN')")
    public ServiceResponse<?> getAll() {
        return thanhToanService.getAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_QUANLY', 'ROLE_LETAN')")
    public ServiceResponse<?> getById(@PathVariable Integer id) {
        return thanhToanService.getById(id);
    }
}