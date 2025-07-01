package com.BE_FPoly_DoAn.DOAN.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BacSiDTO {

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

    // ============ Thông tin riêng của bác sĩ ============

    @NotNull(message = "ID chuyên khoa không được để trống")
    private Integer chuyenKhoaId;

    @NotBlank(message = "Chứng chỉ không được để trống")
    private String chungChi;

    @NotBlank(message = "Trình độ không được để trống")
    private String trinhDo;

    @NotNull(message = "Kinh nghiệm không được để trống")
    @Positive(message = "Kinh nghiệm phải là số dương")
    private Integer kinhNghiem;

    @NotNull(message = "Ngày tuyển dụng không được để trống")
    @PastOrPresent(message = "Ngày tuyển dụng không được là ngày trong tương lai")
    private LocalDate ngayTuyenDung;

    @Size(max = 250, message = "Ghi chú không vượt quá 250 ký tự")
    private String ghiChu;

    @NotNull(message = "Trạng thái hoạt động không được để trống")
    private Boolean trangThaiHoatDong;
}
