package com.BE_FPoly_DoAn.DOAN.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuanLyRequestDTO {
    private String hoTen;
    private String gioiTinh;
    private String email;
    private String soDienThoai;
    private String matKhau;
    private String chucVu;
    private String ghiChu;
    private Boolean trangThaiHoatDong;
}