package com.BE_FPoly_DoAn.DOAN.DTO.ChuyenKhoa;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenKhoaDTO {

    private Integer chuyenKhoaId;

    @NotBlank(message = "VALIDATION_NAME_REQUIRED")
    @Size(max = 100, message = "VALIDATION_NAME_TOO_LONG")
    private String tenKhoa;

    @Size(max = 250, message = "VALIDATION_GHICHU_TOO_LONG")
    private String moTa;
}