package com.BE_FPoly_DoAn.DOAN.DTO.ThongKe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThongKeKhoaDTO {
    private String tenKhoa;
    private int soLuong;
    private int soLuongThangTruoc;
    private double tangTruongPhanTram;
    private int nam;
    private int thang;
}