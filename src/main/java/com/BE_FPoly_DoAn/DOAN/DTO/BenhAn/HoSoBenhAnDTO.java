package com.BE_FPoly_DoAn.DOAN.DTO.BenhAn;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoSoBenhAnDTO {

    private Integer hoSoBenhAnId;

    @NotNull(message = "Bệnh án không được để trống")
    private Integer benhAnId;

    @NotNull(message = "Bệnh không được để trống")
    private Integer benhId;
}