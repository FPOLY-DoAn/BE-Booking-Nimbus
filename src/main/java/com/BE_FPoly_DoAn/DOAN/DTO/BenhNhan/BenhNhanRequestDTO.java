package com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BenhNhanRequestDTO {

    private Integer benhNhanId;
    private String baoHiem;
    private String diaChi;
    private String lienHeKhanCap;
    private String canCuocCongDan;
    private String danToc;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
}