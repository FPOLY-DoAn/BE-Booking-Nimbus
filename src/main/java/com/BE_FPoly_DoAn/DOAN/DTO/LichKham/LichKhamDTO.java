package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham.KieuLichKham;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham.TrangThaiLichKham;
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
    private LocalDateTime thoiGianHen; // A: Đã đến, C: Huỷ, P: Đang chờ

    private LocalDateTime thoiGianDen; // H: Hẹn, T: Tái khám, D: Định kỳ

    @NotNull(message = "Kiểu lịch khám không được để trống")
    private KieuLichKham kieuLichKham;

    @NotNull(message = "Trạng thái không được để trống")
    private TrangThaiLichKham trangThai;

    private String ghiChu;

    private LocalDate ngayKham;

    private String caKham;
}