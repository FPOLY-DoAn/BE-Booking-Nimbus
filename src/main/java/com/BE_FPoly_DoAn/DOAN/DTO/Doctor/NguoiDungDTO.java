package com.BE_FPoly_DoAn.DOAN.DTO.Doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NguoiDungDTO {
    private String hoTen;
    private String gioiTinh;
    private String email;
    private String soDienThoai;
    private String matKhau;
}