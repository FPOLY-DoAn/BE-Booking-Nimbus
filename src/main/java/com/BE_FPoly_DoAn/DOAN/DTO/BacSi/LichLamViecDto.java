package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LichLamViecDto {
    private LocalDate ngay;
    private String caTruc;
    private String lyDoNghi;
}