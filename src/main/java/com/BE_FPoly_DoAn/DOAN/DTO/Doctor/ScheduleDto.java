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
public class ScheduleDto {
    private LocalDate date;
    private String shift;
    private String reason;
}