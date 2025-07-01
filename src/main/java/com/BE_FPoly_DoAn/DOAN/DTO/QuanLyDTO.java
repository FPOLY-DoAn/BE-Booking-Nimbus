package com.BE_FPoly_DoAn.DOAN.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class QuanLyDTO {
    // ============ Thông tin người dùng chung ============

    @NotBlank(message = "Họ tên không được để trống")
    @Size(max = 50, message = "Họ tên không vượt quá 50 ký tự")
    private String hoTen;

    private Character gioiTinh;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotBlank(message = "Số điện thoại không được để trống")
    @Size(max = 15, message = "Số điện thoại không vượt quá 15 ký tự")
    private String soDienThoai;

    @NotBlank(message = "Mật khẩu không được để trống")
    private String matKhau;

    // ============ Thông tin riêng của quản lý ============

    @NotBlank(message = "Chức vụ không được để trống")
    private String chucVu;

    @Size(max = 250, message = "Ghi chú không vượt quá 250 ký tự")
    private String ghiChu;
}
