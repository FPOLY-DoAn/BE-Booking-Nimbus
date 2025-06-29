package com.BE_FPoly_DoAn.DOAN.Service.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.ScheduleDto;

public interface DoctorScheduleService {
    Object getSchedule(Integer doctorId);
    Object updateSchedule(Integer doctorId, ScheduleDto dto);
    Object requestLeave(Integer doctorId, ScheduleDto dto);
}