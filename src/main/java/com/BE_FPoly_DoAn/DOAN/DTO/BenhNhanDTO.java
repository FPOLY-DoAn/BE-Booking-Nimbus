package com.BE_FPoly_DoAn.DOAN.DTO;

import com.BE_FPoly_DoAn.DOAN.Entity.HoaDon;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BenhNhanDTO {

    @NotBlank(message = "VALIDATION_NAME_REQUIRED")
    @Size(max = 50, message = "VALIDATION_NAME_TOO_LONG")
    private String hoTen;

    @NotBlank(message = "VALIDATION_GENDER_REQUIRED")
    private String gioiTinh;

    @NotBlank(message = "VALIDATION_EMAIL_REQUIRED")
    @Email(message = "VALIDATION_EMAIL_INVALID")
    private String email;

    @NotBlank(message = "VALIDATION_PHONE_REQUIRED")
    @Size(max = 15, message = "VALIDATION_PHONE_TOO_LONG")
    private String soDienThoai;

    private String baoHiem = "Chưa cập nhật";

    @Pattern(regexp = "^$|^Chưa cập nhật$|^\\+?[0-9\\-\\s]{7,15}$", message = "Số điện thoại không hợp lệ")
    private String lienHeKhanCap = "Chưa cập nhật";

    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    private List<LichKham> lichKhams;
    private List<HoaDon> hoaDons;
}