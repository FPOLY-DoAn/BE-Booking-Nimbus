package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DonNghiPhepDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DuyetDonDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.DonNghiPhep;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.DonNghiPhepServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/don-nghi-phep")
public class DonNghiPhepAdminController {

    private final DonNghiPhepServiceImpl donNghiPhepService;

    public DonNghiPhepAdminController(DonNghiPhepServiceImpl donNghiPhepService) {
        this.donNghiPhepService = donNghiPhepService;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<List<DonNghiPhep>>> getAll() {
        List<DonNghiPhep> list = donNghiPhepService.getAll();
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_LIST, list));
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public ResponseEntity<ServiceResponse<?>> dangKyNghi(@RequestBody @Valid DonNghiPhepDTO dto) {
        return ResponseEntity.ok(donNghiPhepService.dangKyNghi(dto));
    }

    @PutMapping("/{id}/duyet")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> duyetDon(@PathVariable Integer id) {
        DuyetDonDTO dto = new DuyetDonDTO();
        dto.setTrangThai(DonNghiPhep.TrangThai.DUOC_DUYET);
        return donNghiPhepService.duyetDon(id, dto);
    }
    
    @PutMapping("/{id}/tu-choi")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> tuChoiDon(
            @PathVariable Integer id,
            @RequestBody Map<String, String> body
    ) {
        String reason = body.get("lyDo");
        if (reason == null || reason.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(ServiceResponse.error(NotificationCode.VALIDATION_KHANCAP_REQUIRED));
        }

        return ResponseEntity.ok(donNghiPhepService.rejectDon(id, reason));
    }

}