package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor.BacSiServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bac-si")
public class DoctorController {

    @Autowired
    private BacSiServiceImpl bacSiService;

    @GetMapping
    public List<BacSi> getAll() {
        return bacSiService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BacSi> getById(@PathVariable Integer id) {
        return bacSiService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public BacSi create(@RequestBody @Valid BacSi bacSi) {
        return bacSiService.save(bacSi);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<BacSi> update(@PathVariable Integer id, @RequestBody BacSi updated) {
        return bacSiService.getById(id).map(b -> {
            updated.setBacSiId(id);
            return ResponseEntity.ok(bacSiService.save(updated));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<Void> delete(@PathVariable BacSi id) {
        bacSiService.delete(id);
        return ResponseEntity.noContent().build();
    }
}