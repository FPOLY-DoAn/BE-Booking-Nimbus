package com.BE_FPoly_DoAn.DOAN.DTO;

import jakarta.validation.constraints.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuanLyDTO {

    // ============ Thông tin người dùng chung ============

    @NotBlank(message = "VALIDATION_NAME_REQUIRED")
    @Size(max = 50, message = "VALIDATION_NAME_TOO_LONG")
    private String hoTen;

    @NotNull(message = "VALIDATION_GENDER_REQUIRED")
    private Character gioiTinh;

    @NotBlank(message = "VALIDATION_EMAIL_REQUIRED")
    @Email(message = "VALIDATION_EMAIL_INVALID")
    private String email;

    @NotBlank(message = "VALIDATION_PHONE_REQUIRED")
    @Size(max = 15, message = "VALIDATION_PHONE_TOO_LONG")
    @Pattern(regexp = "^\\+?[0-9\\-\\s]{7,15}$", message = "VALIDATION_PHONE_INVALID")
    private String soDienThoai;

    @NotBlank(message = "VALIDATION_PASSWORD_REQUIRED")
    private String matKhau;

    // ============ Thông tin riêng của quản lý ============

    @NotBlank(message = "VALIDATION_CHUCVU_REQUIRED")
    @Size(max = 100, message = "VALIDATION_CHUCVU_TOO_LONG")
    private String chucVu;

    @Size(max = 250, message = "VALIDATION_GHICHU_TOO_LONG")
    private String ghiChu;
}