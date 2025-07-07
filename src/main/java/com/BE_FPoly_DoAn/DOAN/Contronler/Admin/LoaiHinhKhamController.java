package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.LoaiHinhKham.LoaiHinhKhamDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;
import com.BE_FPoly_DoAn.DOAN.Mapper.DichVuMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LoaiHinhKhamServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dich-vu")
public class LoaiHinhKhamController {

    private final LoaiHinhKhamServiceImpl service;

    public LoaiHinhKhamController(LoaiHinhKhamServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ServiceResponse<List<LoaiHinhKhamDTO>>> getAll() {
        List<LoaiHinhKhamDTO> list = service.getAll()
                .stream()
                .map(DichVuMapper::toDto)
                .toList();
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_LIST, list));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceResponse<LoaiHinhKhamDTO>> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(dv -> ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_ID, DichVuMapper.toDto(dv))))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND)));
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<LoaiHinhKhamDTO>> create(@RequestBody @Valid LoaiHinhKhamDTO dto) {
        DichVu saved = service.save(DichVuMapper.toEntity(dto));
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_CREATE_SUCCESS, DichVuMapper.toDto(saved)));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<LoaiHinhKhamDTO>> update(@PathVariable Integer id,
                                                                   @RequestBody @Valid LoaiHinhKhamDTO dto) {
        Optional<DichVu> opt = service.getById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND));
        }
        DichVu entity = opt.get();
        DichVuMapper.updateEntity(entity, dto);
        DichVu saved = service.save(entity);
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_UPDATE_SUCCESS, DichVuMapper.toDto(saved)));
    }

//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
//    public ResponseEntity<ServiceResponse<?>> delete(@PathVariable Integer id) {
//        Optional<DichVu> opt = service.getById(id);
//        if (opt.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                    .body(ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND));
//        }
//        try {
//            service.delete(opt.get());
//            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_DELETE_SUCCESS));
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body(ServiceResponse.error(NotificationCode.SERVICE_DELETE_FAIL));
//        }
//    }
}