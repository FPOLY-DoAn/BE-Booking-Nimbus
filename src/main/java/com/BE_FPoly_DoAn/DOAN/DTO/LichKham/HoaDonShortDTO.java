package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonShortDTO {
    private Integer hoaDonId;
    private BigDecimal tongTien;
    private String trangThai;
    private LocalDate ngayThanhToan;
}