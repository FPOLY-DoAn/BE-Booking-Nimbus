package com.BE_FPoly_DoAn.DOAN.Contronler.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.Dao.GioKhamChiTietRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gio-kham")
@PreAuthorize("hasAnyAuthority('ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY', 'ROLE_LETAN')")
public class GioKhamChiTietController {

    private final GioKhamChiTietRepository repository;

    public GioKhamChiTietController(GioKhamChiTietRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{lichId}")
    public ResponseEntity<?> getSlotsByLich(@PathVariable Integer lichId) {
        List<GioKhamChiTiet> list = repository.findByLichLamViecBacSi_LichlvId(lichId);
        List<GioKhamChiTietDto> dtoList = list.stream()
                .map(GioKhamChiTietMapper::toDto)
                .toList();
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_ID, dtoList));
    }
}