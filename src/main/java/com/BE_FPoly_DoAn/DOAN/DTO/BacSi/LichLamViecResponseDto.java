package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LichLamViecResponseDto {
    private Integer lichId;
    private LocalDate ngay;
    private String caTruc;
    private String lyDoNghi;
}