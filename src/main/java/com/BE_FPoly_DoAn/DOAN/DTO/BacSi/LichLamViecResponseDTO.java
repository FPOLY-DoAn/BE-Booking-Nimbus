package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LichLamViecResponseDTO {
    private Integer lichlvId;
    private LocalDate ngay;
    private String caTruc;
    private String lyDoNghi;
    private Integer bacSiId;
    private String tenBacSi;
}