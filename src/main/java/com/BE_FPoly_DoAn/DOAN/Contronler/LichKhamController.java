package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichKhamServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lich-kham")
@RequiredArgsConstructor
public class LichKhamController {

    private final LichKhamServiceImpl lichKhamService;

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> create(@Valid @RequestBody LichKhamDTO dto) {
        return lichKhamService.create(dto);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> getAll() {
        return lichKhamService.getAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> getById(@PathVariable Integer id) {
        return lichKhamService.getById(id);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> update(@PathVariable Integer id, @Valid @RequestBody LichKhamDTO dto) {
        return lichKhamService.update(id, dto);
    }

//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_QUANLY')")
//    public ServiceResponse<?> delete(@PathVariable Integer id) {
//        return lichKhamService.delete(id);
//    }

    @PostMapping("/search")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> search(@RequestBody LichKhamFilterDTO filter) {
        return lichKhamService.searchLichKham(filter);
    }

}