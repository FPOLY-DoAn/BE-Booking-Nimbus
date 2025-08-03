package com.BE_FPoly_DoAn.DOAN.Contronler.BenhNhan;

import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;
import com.BE_FPoly_DoAn.DOAN.Entity.LoaiHinhKham;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LoaiHinhKhamServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/benhnhan")
public class BenhNhanDatLichContronller {
    private final LoaiHinhKhamServiceImpl loaiHinhKhamService;

    public BenhNhanDatLichContronller(LoaiHinhKhamServiceImpl dichVuService) {
        this.loaiHinhKhamService = dichVuService;
    }

    @GetMapping("/dichvu")
    @PreAuthorize("hasAuthority('ROLE_BENHNHAN')")
    public ResponseEntity<?> getDichVu() {
    List<LoaiHinhKham> loaiHinhKhamList = loaiHinhKhamService.getAll();
        return ResponseEntity.ok().body(loaiHinhKhamList);
    }

}
