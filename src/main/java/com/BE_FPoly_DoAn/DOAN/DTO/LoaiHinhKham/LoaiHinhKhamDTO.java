package com.BE_FPoly_DoAn.DOAN.DTO.LoaiHinhKham;

import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoaiHinhKhamDTO {

    private Integer dichVuId;

    @NotBlank(message = "VALIDATION_NAME_REQUIRED")
    @Size(max = 100, message = "VALIDATION_NAME_TOO_LONG")
    private String tenDichVu;

    @NotBlank(message = "VALIDATION_MOTA_REQUIRED")
    @Size(max = 250, message = "VALIDATION_MOTA_TOO_LONG")
    private String moTa;

    @NotNull(message = "VALIDATION_GIA_REQUIRED")
    @DecimalMin(value = "0.0", inclusive = true, message = "VALIDATION_GIA_POSITIVE")
    private BigDecimal gia;
}