package com.BE_FPoly_DoAn.DOAN.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaoGioTuDongDTO {
    private Integer lichLamViecId;
    private String batDau;
    private String ketThuc;
    private Integer buocNhayPhut;
}
