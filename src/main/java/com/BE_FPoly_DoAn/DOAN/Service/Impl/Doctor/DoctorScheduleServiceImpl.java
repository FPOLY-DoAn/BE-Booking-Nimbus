package com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.ScheduleDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.DoctorScheduleService;
import org.springframework.stereotype.Service;

@Service
public class DoctorScheduleServiceImpl implements DoctorScheduleService {
    @Override
    public Object getSchedule(Integer doctorId) {
        return "Fake schedule for doctorId " + doctorId;
    }

    @Override
    public Object updateSchedule(Integer doctorId, ScheduleDto dto) {
        return "Updated schedule for doctorId " + doctorId;
    }

    @Override
    public Object requestLeave(Integer doctorId, ScheduleDto dto) {
        return "Leave request created for doctorId " + doctorId;
    }
}