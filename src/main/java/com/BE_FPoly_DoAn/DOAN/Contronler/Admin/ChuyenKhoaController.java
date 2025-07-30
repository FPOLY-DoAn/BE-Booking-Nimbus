package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.ChuyenKhoa.ChuyenKhoaDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;
import com.BE_FPoly_DoAn.DOAN.Mapper.ChuyenKhoaMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.ChuyenKhoaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chuyen-khoa")
public class ChuyenKhoaController {

    private final ChuyenKhoaServiceImpl chuyenKhoaService;

    public ChuyenKhoaController(ChuyenKhoaServiceImpl chuyenKhoaService) {
        this.chuyenKhoaService = chuyenKhoaService;
    }

    @GetMapping("/LayDanhSachChuyenKhoa")
    public ResponseEntity<ServiceResponse<List<ChuyenKhoaDTO>>> getAll() {
        List<ChuyenKhoaDTO> list = chuyenKhoaService.getAll()
                .stream()
                .map(ChuyenKhoaMapper::toDto)
                .toList();

        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SPECIALTY_LIST, list));
    }

    @GetMapping("/LayChuyenKhoaTheoId/{id}")
    public ResponseEntity<ServiceResponse<ChuyenKhoaDTO>> getById(@PathVariable Integer id) {
        return chuyenKhoaService.getById(id)
                .map(ck -> ResponseEntity.ok(ServiceResponse.success(NotificationCode.SPECIALTY_DETAIL, ChuyenKhoaMapper.toDto(ck))))
                .orElse(ResponseEntity.ok(ServiceResponse.error(NotificationCode.SPECIALTY_NOT_FOUND)));
    }

    @PostMapping("/TaoMoiChuyenKhoa")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<ChuyenKhoaDTO>> create(@RequestBody @Valid ChuyenKhoaDTO dto) {
        boolean exists = chuyenKhoaService.existsByTen(dto.getTenKhoa());
        if (exists) {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SPECIALTY_DUPLICATE));
        }

        ChuyenKhoa entity = ChuyenKhoaMapper.toEntity(dto);
        ChuyenKhoa saved = chuyenKhoaService.save(entity);

        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SPECIALTY_CREATE_SUCCESS, ChuyenKhoaMapper.toDto(saved)));
    }

    @PutMapping("/CapNhatChuyenKhoa/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<ChuyenKhoaDTO>> update(@PathVariable Integer id,
                                                                 @RequestBody @Valid ChuyenKhoaDTO dto) {
        Optional<ChuyenKhoa> optional = chuyenKhoaService.getById(id);
        if (optional.isEmpty()) {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SPECIALTY_NOT_FOUND));
        }

        ChuyenKhoa entity = optional.get();
        ChuyenKhoaMapper.updateEntity(entity, dto);
        ChuyenKhoa saved = chuyenKhoaService.save(entity);

        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SPECIALTY_UPDATE_SUCCESS, ChuyenKhoaMapper.toDto(saved)));
    }

//    @DeleteMapping("/XoaChuyenKhoa/{id}")
//    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
//    public ResponseEntity<ServiceResponse<?>> delete(@PathVariable Integer id) {
//        Optional<ChuyenKhoa> optional = chuyenKhoaService.getById(id);
//        if (optional.isEmpty()) {
//            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SPECIALTY_NOT_FOUND));
//        }
//
//        try {
//            chuyenKhoaService.delete(optional.get());
//            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SPECIALTY_DELETE_SUCCESS));
//        } catch (Exception e) {
//            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.SPECIALTY_DELETE_FAIL));
//        }
//    }
}