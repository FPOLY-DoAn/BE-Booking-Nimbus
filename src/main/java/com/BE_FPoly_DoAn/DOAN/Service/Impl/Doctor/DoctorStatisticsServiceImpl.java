package com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.DoctorStatisticsDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.DoctorStatisticsService;
import org.springframework.stereotype.Service;

@Service
public class DoctorStatisticsServiceImpl implements DoctorStatisticsService {
    @Override
    public DoctorStatisticsDto getStatistics(Integer doctorId, String range) {
        return new DoctorStatisticsDto(doctorId, range, 10, 40);
    }
}