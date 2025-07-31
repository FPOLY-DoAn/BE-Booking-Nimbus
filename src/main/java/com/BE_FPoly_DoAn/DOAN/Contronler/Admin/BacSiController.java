package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiRequestDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi.BacSiServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bac-si")
@PreAuthorize("hasRole('ROLE_QUANLY')")
@RequiredArgsConstructor
public class BacSiController {

    private final BacSiServiceImpl bacSiService;

    @GetMapping("/LayDanhSachBacSi")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(bacSiService.getAllResponse());
    }

    @GetMapping("/LayBacSiTheoId/{id}")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(bacSiService.getByIdResponse(id));
    }

    @PostMapping("/TaoMoiBacSi")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody BacSiRequestDTO dto) {
        return ResponseEntity.ok(bacSiService.create(dto));
    }

    @PutMapping("/CapNhatBacSi/{id}")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id,
                                                     @Valid @RequestBody BacSiRequestDTO dto) {
        return ResponseEntity.ok(bacSiService.update(id, dto));
    }
}