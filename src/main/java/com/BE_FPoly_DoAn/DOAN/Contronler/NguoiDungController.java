package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.BenhNhanService;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("nguoi_dung")
public class NguoiDungController {

    private NguoiDungService nguoiDungService;

    public NguoiDungController( NguoiDungService nguoiDungService) {
        this.nguoiDungService = nguoiDungService;
    }

    @PreAuthorize("hasAuthority('ROLE_BENHNHAN')")
    @GetMapping("infor/{benhNhanId}")
    public ResponseEntity<?> getNguoiDung(@PathVariable Integer benhNhanId) {
        System.out.println("id"+ benhNhanId);
        Optional<NguoiDung> nguoiDung = nguoiDungService.getById(benhNhanId);

        if (nguoiDung.isPresent()) {
            BenhNhanDTO benhNhanDTO = BenhNhanDTO.builder().hoTen(nguoiDung.get().getHoTen())
                    .email(nguoiDung.get().getEmail())
                    .gioiTinh(String.valueOf(nguoiDung.get().getGioiTinh()))
                    .soDienThoai(nguoiDung.get().getSoDienThoai())
                    .build();
            return ResponseEntity.ok(benhNhanDTO);
        }
        return ResponseEntity.badRequest().body(ServiceResponse.error("500","Không tìm thấy người dùng này"));
    }
}
