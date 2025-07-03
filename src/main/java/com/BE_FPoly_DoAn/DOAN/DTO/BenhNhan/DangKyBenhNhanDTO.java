package com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DangKyBenhNhanDTO {
    @NotBlank(message = "VALIDATION_BAOHIEM_REQUIRED")
    private String baoHiem;

    @NotBlank(message = "VALIDATION_LIENHE_REQUIRED")
    private String lienHeKhanCap;
}