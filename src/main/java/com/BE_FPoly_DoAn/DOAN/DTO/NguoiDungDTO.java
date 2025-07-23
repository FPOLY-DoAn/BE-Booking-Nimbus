package com.BE_FPoly_DoAn.DOAN.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NguoiDungDTO {

    @NotBlank(message = "VALIDATION_NAME_REQUIRED")
    @Size(max = 50, message = "VALIDATION_NAME_TOO_LONG")
    private String hoTen;

    private String gioiTinh;

    @NotBlank(message = "VALIDATION_EMAIL_REQUIRED")
    @Email(message = "VALIDATION_EMAIL_INVALID")
    private String email;

    @NotBlank(message = "VALIDATION_PHONE_REQUIRED")
    @Size(max = 15, message = "VALIDATION_PHONE_TOO_LONG")
    private String soDienThoai;

    private String matKhau;

//    private String baoHiem;
//
//    private String lienHeKhanCap;
}