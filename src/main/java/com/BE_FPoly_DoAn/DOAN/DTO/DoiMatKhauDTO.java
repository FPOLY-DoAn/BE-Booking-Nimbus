package com.BE_FPoly_DoAn.DOAN.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoiMatKhauDTO {
    @NotBlank(message = "VALIDATION_PASSWORD_REQUIRED")
    private String oldPassword;

    @NotBlank(message = "VALIDATION_PASSWORD_REQUIRED")
    private String newPassword;
}
