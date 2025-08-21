package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GioKhamChiTietDto {
    private Integer gioKhamId;
    private Integer lichLamViecId;
    private LocalTime batDau;
    private LocalTime ketThuc;
    private Boolean daDat;
}