package com.BE_FPoly_DoAn.DOAN.DTO.Doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorStatisticsDto {
    private Integer doctorId;
    private String range;
    private Integer soBenhNhan;
    private Integer tongGioLam;
}