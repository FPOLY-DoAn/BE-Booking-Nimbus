package com.BE_FPoly_DoAn.DOAN.Service.Doctor;


import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.DoctorStatisticsDto;

public interface DoctorStatisticsService {
    DoctorStatisticsDto getStatistics(Integer doctorId, String range);
}
