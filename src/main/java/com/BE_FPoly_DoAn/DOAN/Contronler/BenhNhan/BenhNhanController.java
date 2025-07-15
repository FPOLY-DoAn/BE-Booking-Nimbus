package com.BE_FPoly_DoAn.DOAN.Contronler.BenhNhan;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BenhNhanServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/benh-nhan")
@RequiredArgsConstructor
public class BenhNhanController {

    private final BenhNhanServiceImpl benhNhanService;

    @PostMapping("/{nguoiDungId}")
    @PreAuthorize("hasRole('ROLE_LETAN'), 'ROLE_BENHNHAN")
    public ServiceResponse<?> create(@PathVariable Integer nguoiDungId, @Valid @RequestBody BenhNhanDTO dto) {
        return benhNhanService.create(nguoiDungId, dto);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> getAll() {
        return benhNhanService.getAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> getById(@PathVariable Integer id) {
        return benhNhanService.getById(id);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_LETAN')")
    public ServiceResponse<?> update(@PathVariable Integer id, @Valid @RequestBody BenhNhanDTO dto) {
        return benhNhanService.update(id, dto);
    }

//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_QUANLY')")
//    public ServiceResponse<?> delete(@PathVariable Integer id) {
//        return benhNhanService.delete(id);
//    }
}