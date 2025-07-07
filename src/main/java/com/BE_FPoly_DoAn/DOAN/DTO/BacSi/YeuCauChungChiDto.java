package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class YeuCauChungChiDto {

    @NotBlank(message = "VALIDATION_CHUNGCHI_REQUIRED")
    private String newCertificate;

    private String reason;
}