package com.BE_FPoly_DoAn.DOAN.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LeTanDTO {

        @NotBlank(message = "VALIDATION_NAME_REQUIRED")
        private String hoTen;

        @NotNull(message = "VALIDATION_GENDER_REQUIRED")
        private Character gioiTinh;

        @NotBlank(message = "VALIDATION_EMAIL_REQUIRED")
        @Email(message = "VALIDATION_EMAIL_INVALID")
        private String email;

        @NotBlank(message = "VALIDATION_PHONE_REQUIRED")
        private String soDienThoai;

        @NotBlank(message = "VALIDATION_PASSWORD_REQUIRED")
        private String matKhau;

        @NotBlank(message = "VALIDATION_CHUCVU_REQUIRED")
        private String chucVu;

        @NotNull(message = "VALIDATION_NGAY_TUYEN_REQUIRED")
        @PastOrPresent(message = "VALIDATION_NGAY_TUYEN_PAST")
        private LocalDate ngayTuyenDung;

        @Size(max = 250, message = "VALIDATION_GHICHU_TOO_LONG")
        private String ghiChu;

        @NotNull(message = "VALIDATION_TRANGTHAI_REQUIRED")
        private Boolean trangThaiHoatDong;
}