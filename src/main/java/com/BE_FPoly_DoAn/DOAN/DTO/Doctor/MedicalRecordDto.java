package com.BE_FPoly_DoAn.DOAN.DTO.Doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MedicalRecordDto {
    private String trieuChung;
    private String chuanDoan;
    private String phuongPhapDieuTri;
    private LocalDate ngayKham;
}