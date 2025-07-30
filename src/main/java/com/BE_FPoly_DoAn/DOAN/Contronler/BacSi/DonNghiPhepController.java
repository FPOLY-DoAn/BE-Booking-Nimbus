package com.BE_FPoly_DoAn.DOAN.Contronler.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DonNghiPhepDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.DonNghiPhep;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.DonNghiPhepServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/don-nghi-phep")
@PreAuthorize("hasAuthority('ROLE_BACSI')")
public class DonNghiPhepController {

    private final DonNghiPhepServiceImpl donNghiPhepService;

    public DonNghiPhepController(DonNghiPhepServiceImpl donNghiPhepService) {
        this.donNghiPhepService = donNghiPhepService;
    }

    @PostMapping("/dang-ky")
    public ResponseEntity<?> dangKyNghi(@RequestBody @Valid DonNghiPhepDTO dto) {
        return ResponseEntity.ok(donNghiPhepService.dangKyNghi(dto));
    }

    @GetMapping
    public List<DonNghiPhep> getAll() {
        return donNghiPhepService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        return donNghiPhepService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
