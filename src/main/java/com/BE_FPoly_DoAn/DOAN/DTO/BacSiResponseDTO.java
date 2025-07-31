package com.BE_FPoly_DoAn.DOAN.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BacSiResponseDTO {
    private String bacsi_id;
    private String hoTen;
    private String gioiTinh;
    private String email;
    private String soDienThoai;

    @JsonIgnore
    private Integer chuyenKhoaId;
    private String tenKhoa;
    private String chungChi;
    private String trinhDo;
    private Integer kinhNghiem;
    private LocalDate ngayTuyenDung;
    private String ghiChu;
    private Boolean trangThaiHoatDong;
}
