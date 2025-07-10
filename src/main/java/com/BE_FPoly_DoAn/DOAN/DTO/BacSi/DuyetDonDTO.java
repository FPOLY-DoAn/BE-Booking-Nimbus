package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import com.BE_FPoly_DoAn.DOAN.Entity.DonNghiPhep.TrangThai;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DuyetDonDTO {

    @NotNull
    private TrangThai trangThai;

    private String lyDoTuChoi;
}