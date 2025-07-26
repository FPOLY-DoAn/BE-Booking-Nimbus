package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO tóm tắt lịch khám - dùng cho hiển thị danh sách rút gọn.
 * (ví dụ: danh sách lịch hẹn hôm nay hoặc thống kê nhanh)
 */
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