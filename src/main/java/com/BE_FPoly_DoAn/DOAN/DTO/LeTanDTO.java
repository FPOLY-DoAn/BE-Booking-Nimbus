package com.BE_FPoly_DoAn.DOAN.DTO;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
@Data
public class LeTanDTO {
        @NotBlank(message = "Họ tên không được để trống")
        private String hoTen;

        @NotNull(message = "Giới tính không được để trống")
        private Character gioiTinh;

        @NotBlank(message = "Email không được để trống")
        @Email(message = "Email không đúng định dạng")
        private String email;

        @NotBlank(message = "Số điện thoại không được để trống")
        private String soDienThoai;

        @NotBlank(message = "Mật khẩu không được để trống")
        private String matKhau;

        @NotBlank(message = "Chức vụ không được để trống")
        private String chucVu;

        @NotNull(message = "Ngày tuyển dụng không được để trống")
        @PastOrPresent(message = "Ngày tuyển dụng không được là ngày trong tương lai")
        private LocalDate ngayTuyenDung;

        @Size(max = 250, message = "Ghi chú không được vượt quá 250 ký tự")
        private String ghiChu;

        @NotNull(message = "Trạng thái hoạt động không được để trống")
        private Boolean trangThaiHoatDong;

}
