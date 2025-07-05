package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.ChuyenKhoaRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;
import com.BE_FPoly_DoAn.DOAN.Mapper.BacSiMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor.BacSiServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bac-si")
public class DoctorController {

    private final BacSiServiceImpl bacSiService;
    private final ChuyenKhoaRepository chuyenKhoaRepository;

    public DoctorController(BacSiServiceImpl bacSiService,
                            ChuyenKhoaRepository chuyenKhoaRepository) {
        this.bacSiService = bacSiService;
        this.chuyenKhoaRepository = chuyenKhoaRepository;
    }

    @GetMapping
    public List<BacSiDTO> getAll() {
        return bacSiService.getAll()
                .stream()
                .map(BacSiMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BacSiDTO> getById(@PathVariable Integer id) {
        return bacSiService.getById(id)
                .map(BacSiMapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<BacSiDTO> create(@RequestBody @Valid BacSiDTO dto) {

        ChuyenKhoa ck = chuyenKhoaRepository
                .findById(dto.getChuyenKhoaId())
                .orElseThrow(() -> new IllegalArgumentException("Chuyên khoa không tồn tại"));

        BacSi entity = BacSiMapper.toEntity(dto, ck);
        BacSi saved  = bacSiService.save(entity);

        return ResponseEntity.ok(BacSiMapper.toDto(saved));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<BacSiDTO> update(@PathVariable Integer id,
                                           @RequestBody @Valid BacSiDTO dto) {

        return bacSiService.getById(id).map(entity -> {
            ChuyenKhoa ck = chuyenKhoaRepository
                    .findById(dto.getChuyenKhoaId())
                    .orElseThrow(() -> new IllegalArgumentException("Chuyên khoa không tồn tại"));

            BacSiMapper.updateEntity(entity, dto, ck);
            BacSi saved = bacSiService.save(entity);

            return ResponseEntity.ok(BacSiMapper.toDto(saved));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        Optional<BacSi> optional = bacSiService.getById(id);

        if (optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND));
        }

        try {
            bacSiService.delete(optional.get());
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.DOCTOR_DELETE_SUCCESS));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ServiceResponse.error(NotificationCode.DOCTOR_DELETE_FAIL));
        }
    }
}