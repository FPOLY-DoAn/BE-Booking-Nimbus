package com.BE_FPoly_DoAn.DOAN.Contronler.Doctor;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.BacSiService;
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
    private BacSiService bacSiService;

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
    @PreAuthorize("hasRole('Quản trị viên')")
    public BacSi create(@RequestBody @Valid BacSi bacSi) {
        return bacSiService.save(bacSi);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('Quản trị viên')")
    public ResponseEntity<BacSi> update(@PathVariable Integer id, @RequestBody BacSi updated) {
        return bacSiService.getById(id).map(b -> {
            updated.setBacSiId(id);
            return ResponseEntity.ok(bacSiService.save(updated));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('Quản trị viên')")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        bacSiService.delete(id);
        return ResponseEntity.noContent().build();
    }
}