package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LichLamViecHomNayChiTietDTO {
    private Integer bacSiId;
    private String hoTen;
    private LocalDate ngay;
    private String caTruc;
    private String lyDoNghi;
    private List<GioKhamChiTietDto> gioKhamChiTiet;
}