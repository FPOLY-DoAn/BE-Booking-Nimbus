package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.LoaiHinhKham.LoaiHinhKhamDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.LoaiHinhKham;
import com.BE_FPoly_DoAn.DOAN.Mapper.LoaiHinhKhamMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LoaiHinhKhamServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loai-hinh-kham")
@Tag(name = "Quản lý loại hình khám")
public class LoaiHinhKhamController {

    private final LoaiHinhKhamServiceImpl service;

    public LoaiHinhKhamController(LoaiHinhKhamServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/LayDanhSachLoaiHinhKham")
    @PreAuthorize("hasAnyAuthority('ROLE_BACSI','ROLE_QUANLY','ROLE_BENHNHAN','ROLE_LETAN')")
    public ResponseEntity<ServiceResponse<List<LoaiHinhKhamDTO>>> getAll() {
        List<LoaiHinhKhamDTO> list = service.getAll()
                .stream()
                .map(LoaiHinhKhamMapper::toDto)
                .toList();
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_LIST, list));
    }

    @GetMapping("/LayLoaiHinhKhamTheoId/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_BACSI','ROLE_QUANLY','ROLE_BENHNHAN','ROLE_LETAN')")
    public ResponseEntity<ServiceResponse<LoaiHinhKhamDTO>> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(dv -> ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_ID, LoaiHinhKhamMapper.toDto(dv))))
                .orElse(ResponseEntity.ok(ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND)));
    }

    @PostMapping("/TaoMoiLoaiHinhKham")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<LoaiHinhKhamDTO>> create(@RequestBody @Valid LoaiHinhKhamDTO dto) {
        if (service.existsByTenDichVu(dto.getTenLoai())) {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SERVICE_DUPLICATE));
        }

        try {
            LoaiHinhKham saved = service.save(LoaiHinhKhamMapper.toEntity(dto));
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_CREATE_SUCCESS, LoaiHinhKhamMapper.toDto(saved)));
        } catch (Exception e) {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SERVICE_CREATE_FAIL));
        }
    }

    @PutMapping("/CapNhatDichVu/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<LoaiHinhKhamDTO>> update(@PathVariable Integer id,
                                                                   @RequestBody @Valid LoaiHinhKhamDTO dto) {
        Optional<LoaiHinhKham> opt = service.getById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND));
        }
        try {
            LoaiHinhKham entity = opt.get();
            LoaiHinhKhamMapper.updateEntity(entity, dto);
            LoaiHinhKham saved = service.save(entity);
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_UPDATE_SUCCESS, LoaiHinhKhamMapper.toDto(saved)));
        } catch (Exception e) {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SERVICE_UPDATE_FAIL));
        }
    }
}