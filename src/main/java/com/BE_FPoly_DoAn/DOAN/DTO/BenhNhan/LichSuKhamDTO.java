package com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan;

import com.BE_FPoly_DoAn.DOAN.Entity.LoaiHinhKham;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LichSuKhamDTO {
    private Integer lichKhamId;
    private String tenBacSi;
    private String tenBenhNhan;
    private String tenChuyenKhoa;
    private LoaiHinhKham loaiHinhKham;
    private LocalTime thoiGianTu;
    private LocalTime thoiGianDen;
    private String trangThai;
    private String ghiChu;
    private String caKham;
    private String ngayKham;
}
