package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * DTO chính dùng để tạo và cập nhật lịch khám.
 * Ánh xạ dữ liệu giữa client và backend.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichKhamDTO {

    private Integer lichkhamId;

    @NotNull(message = "ID bác sĩ không được để trống")
    private Integer bacSiId;

    @NotNull(message = "ID bệnh nhân không được để trống")
    private Integer benhNhanId;

    @Schema(type = "string", example = "10:30")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime thoiGianHen;

    @Schema(type = "string", example = "11:00")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime thoiGianDen;

    @NotNull(message = "Kiểu lịch khám không được để trống")
    private String kieuLichKham;

    @NotNull(message = "Trạng thái không được để trống")
    private String trangThai;

    private String ghiChu;

    @Schema(type = "string", example = "2025-08-05")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayKham;

    @Schema(type = "string", example = "2025-08-05T08:27:15.911", format = "date-time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime ngayCapNhat;


    private String caKham;
}