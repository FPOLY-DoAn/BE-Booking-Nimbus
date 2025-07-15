package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BenhAnServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/benh-an")
@RequiredArgsConstructor
public class BenhAnController {

    private final BenhAnServiceImpl benhAnService;

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> taoBenhAn(@Valid @RequestBody BenhAnDTO dto) {
        return benhAnService.createBenhAn(dto);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> getAllBenhAn() {
        return benhAnService.getAllBenhAn();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI')")
    public ServiceResponse<?> getBenhAnById(@PathVariable Integer id) {
        return benhAnService.getBenhAnById(id);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_QUANLY')")
    public ServiceResponse<?> updateBenhAn(@PathVariable Integer id, @Valid @RequestBody BenhAnDTO dto) {
        return benhAnService.updateBenhAn(id, dto);
    }

//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_QUANLY)")
//    public ServiceResponse<?> deleteBenhAn(@PathVariable Integer id) {
//        return benhAnService.deleteBenhAn(id);
//    }
}
