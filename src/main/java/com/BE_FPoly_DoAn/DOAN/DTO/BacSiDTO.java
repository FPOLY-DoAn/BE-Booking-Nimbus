package com.BE_FPoly_DoAn.DOAN.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BacSiDTO {

    // ============ Thông tin người dùng chung ============

    @NotBlank(message = "VALIDATION_NAME_REQUIRED")
    @Size(max = 50, message = "VALIDATION_NAME_TOO_LONG")
    private String hoTen;

    @NotNull(message = "VALIDATION_GENDER_REQUIRED")
    private String gioiTinh;

    @NotBlank(message = "VALIDATION_EMAIL_REQUIRED")
    @Email(message = "VALIDATION_EMAIL_INVALID")
    private String email;

    @NotBlank(message = "VALIDATION_PHONE_REQUIRED")
    @Size(max = 15, message = "VALIDATION_PHONE_TOO_LONG")
    private String soDienThoai;

    @NotBlank(message = "VALIDATION_PASSWORD_REQUIRED")
    private String matKhau;

    // ============ Thông tin riêng của bác sĩ ============

    @JsonIgnore
    @NotNull(message = "VALIDATION_CHUYENKHOA_REQUIRED")
    private Integer chuyenKhoaId;

    private String tenKhoa;

    @NotBlank(message = "VALIDATION_CHUNGCHI_REQUIRED")
    private String chungChi;

    @NotBlank(message = "VALIDATION_TRINHDO_REQUIRED")
    private String trinhDo;

    @NotNull(message = "VALIDATION_KINHNGHIEM_REQUIRED")
    @Positive(message = "VALIDATION_KINHNGHIEM_POSITIVE")
    private Integer kinhNghiem;

    @NotNull(message = "VALIDATION_NGAYTUYEN_REQUIRED")
    @PastOrPresent(message = "VALIDATION_NGAYTUYEN_PAST")
    private LocalDate ngayTuyenDung;

    @Size(max = 250, message = "VALIDATION_GHICHU_TOO_LONG")
    private String ghiChu;

    @NotNull(message = "VALIDATION_TRANGTHAI_REQUIRED")
    private Boolean trangThaiHoatDong;
}