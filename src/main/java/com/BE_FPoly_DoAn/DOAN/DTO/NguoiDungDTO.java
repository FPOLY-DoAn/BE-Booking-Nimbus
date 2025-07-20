package com.BE_FPoly_DoAn.DOAN.DTO;

import lombok.*;
import jakarta.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class NguoiDungDTO<T>{

    @NotBlank(message = "VALIDATION_NAME_REQUIRED")
    @Size(max = 50, message = "VALIDATION_NAME_TOO_LONG")
    private String hoTen;

    private char gioiTinh;

    @NotBlank(message = "VALIDATION_EMAIL_REQUIRED")
    @Email(message = "VALIDATION_EMAIL_INVALID")
    private String email;

    @NotBlank(message = "VALIDATION_PHONE_REQUIRED")
    @Size(max = 15, message = "VALIDATION_PHONE_TOO_LONG")
    private String soDienThoai;

    @NotBlank(message = "VALIDATION_PASSWORD_REQUIRED")
    private String matKhau;

}