package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import lombok.*;

import java.time.LocalDate;

/**
 * DTO dùng để lọc/tìm kiếm lịch khám trong hệ thống.
 * Dùng trong chức năng "Tìm kiếm lịch khám".
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichKhamFilterDTO {

    private LocalDate ngayKham;

    private Integer bacSiId;

    private String trangThai;
}