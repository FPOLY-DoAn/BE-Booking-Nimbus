package com.BE_FPoly_DoAn.DOAN.Contronler.BenhNhan;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("nguoi_dung")
public class DangKyBenhNhanController {

    private NguoiDungServiceImpl nguoiDungService;

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

    @PostMapping("update")
    public ResponseEntity<?> getNguoiDung(@RequestBody BenhNhanDTO benhNhanDTO) {
        Optional<NguoiDung> nguoiDung = nguoiDungService.updateNguoiDung_BenhNhan(benhNhanDTO);

        if (nguoiDung.isPresent()) {
            return ResponseEntity.ok(nguoiDung);
        }
        return ResponseEntity.badRequest().body(ServiceResponse.error(NotificationCode.USER_REGISTER_FAIL.code(), NotificationCode.USER_REGISTER_FAIL.code()));
    }
}