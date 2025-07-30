package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.ChuyenKhoaRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;
import com.BE_FPoly_DoAn.DOAN.Mapper.BacSiMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi.BacSiServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bac-si")
public class BacSiController {

    private final BacSiServiceImpl bacSiService;
    private final ChuyenKhoaRepository chuyenKhoaRepository;

    public BacSiController(BacSiServiceImpl bacSiService,
                            ChuyenKhoaRepository chuyenKhoaRepository) {
        this.bacSiService = bacSiService;
        this.chuyenKhoaRepository = chuyenKhoaRepository;
    }

    @GetMapping("/LayDanhSachBacSi")
    @PreAuthorize("hasAuthority('ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<?> getAll() {
        List<BacSiDTO> list = bacSiService.getAll()
                .stream()
                .map(BacSiMapper::toDto)
                .toList();

        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.DOCTOR_LIST_SUCCESS, list));
    }

    @GetMapping("/LayBacSiTheoId/{id}")
    @PreAuthorize("hasAuthority('ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        return bacSiService.getById(id)
                .map(BacSiMapper::toDto)
                .map(dto -> ResponseEntity.ok(ServiceResponse.success(NotificationCode.DOCTOR_FOUND, dto)))
                .orElse(ResponseEntity.status(404)
                        .body(ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND)));
    }

    @PostMapping("/TaoMoiBacSi")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> create(@RequestBody @Valid BacSiDTO dto) {
        try {
            ChuyenKhoa ck = chuyenKhoaRepository
                    .findById(dto.getChuyenKhoaId())
                    .orElseThrow(() -> new IllegalArgumentException("Chuyên khoa không tồn tại"));

            BacSi entity = BacSiMapper.toEntity(dto, ck);
            BacSi saved = bacSiService.save(entity);

            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.DOCTOR_CREATE_SUCCESS, BacSiMapper.toDto(saved)));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(ServiceResponse.error(NotificationCode.SPECIALTY_NOT_FOUND));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
        }
    }

    @PutMapping("/CapNhatBacSi/{id}")
    @PreAuthorize("hasAuthority('ROLE_BACSI', 'ROLE_QUANLY')")
    public ResponseEntity<?> update(@PathVariable Integer id,
                                    @RequestBody @Valid BacSiDTO dto) {
        return bacSiService.getById(id).map(entity -> {
            try {
                ChuyenKhoa ck = chuyenKhoaRepository
                        .findById(dto.getChuyenKhoaId())
                        .orElseThrow(() -> new IllegalArgumentException("Chuyên khoa không tồn tại"));

                BacSiMapper.updateEntity(entity, dto, ck);
                BacSi saved = bacSiService.save(entity);

                return ResponseEntity.ok(ServiceResponse.success(NotificationCode.DOCTOR_UPDATE_SUCCESS, BacSiMapper.toDto(saved)));
            } catch (IllegalArgumentException e) {
                return ResponseEntity.badRequest().body(ServiceResponse.error(NotificationCode.SPECIALTY_NOT_FOUND));
            } catch (Exception e) {
                return ResponseEntity.internalServerError().body(ServiceResponse.error(NotificationCode.SERVER_ERROR));
            }
        }).orElse(ResponseEntity.status(404)
                .body(ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND)));
    }

//    @DeleteMapping("/XoaBacSi/{id}")
//    public ResponseEntity<?> delete(@PathVariable Integer id) {
//        Optional<BacSi> optional = bacSiService.getById(id);
//
//        if (optional.isEmpty()) {
//            return ResponseEntity.status(404)
//                    .body(ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND));
//        }
//
//        try {
//            bacSiService.delete(optional.get());
//            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.DOCTOR_DELETE_SUCCESS));
//        } catch (Exception e) {
//            return ResponseEntity.status(500)
//                    .body(ServiceResponse.error(NotificationCode.DOCTOR_DELETE_FAIL));
//        }
//    }
}