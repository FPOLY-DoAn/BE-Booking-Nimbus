package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    @NotNull(message = "Thời gian hẹn không được để trống")
    private LocalDateTime thoiGianHen;

    private LocalDateTime thoiGianDen;

    @NotNull(message = "Kiểu lịch khám không được để trống")
    private String kieuLichKham;

    @NotNull(message = "Trạng thái không được để trống")
    private String trangThai;

    private String ghiChu;

    private LocalDate ngayKham;

    private LocalDateTime ngayCapNhat;

    private String caKham;
}