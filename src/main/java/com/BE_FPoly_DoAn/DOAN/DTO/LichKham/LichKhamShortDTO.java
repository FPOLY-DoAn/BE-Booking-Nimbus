package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LichKhamShortDTO {
    private Integer lichkhamId;
    private LocalDate ngayKham;
    private LocalDateTime thoiGianHen;
    private String trangThai;
    private Integer bacSiId;
}
