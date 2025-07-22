package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LichLamViecDTO {
    private Integer lichlvId;
    private LocalDate ngay;
    private String caTruc;
    private String lyDoNghi;
}