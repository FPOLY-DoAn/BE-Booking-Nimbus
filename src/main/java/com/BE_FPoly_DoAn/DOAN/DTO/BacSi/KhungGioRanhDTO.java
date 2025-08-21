package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KhungGioRanhDTO {
    private LocalTime batDau;
    private LocalTime ketThuc;
    private Boolean daDat;
}