package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

    @Schema(type = "string", example = "11:00")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime thoiGianHen;

    private String trangThai;

    private Integer bacSiId;
}