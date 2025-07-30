package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.ThongKeDonNghiPhepService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/thong-ke-ngay-nghi")
public class ThongKeDonNghiPhepController {

    private final ThongKeDonNghiPhepService service;

    public ThongKeDonNghiPhepController(ThongKeDonNghiPhepService service) {
        this.service = service;
    }

    @GetMapping("/quan-ly")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> thongKeQuanLy(@RequestParam int nam) {
        return ResponseEntity.ok(service.thongKeChoQuanLy(nam));
    }

    @GetMapping("/bac-si/{bacSiId}")
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public ResponseEntity<ServiceResponse<?>> thongKeCaNhan(@PathVariable int bacSiId,
                                                            @RequestParam int nam) {
        return ResponseEntity.ok(service.thongKeCaNhanBacSi(bacSiId, nam));
    }
}