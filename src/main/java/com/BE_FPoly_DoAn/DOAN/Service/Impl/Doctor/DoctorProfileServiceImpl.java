package com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.DoctorProfileDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.DoctorProfileService;
import org.springframework.stereotype.Service;

@Service
public class DoctorProfileServiceImpl implements DoctorProfileService {
    @Override
    public Object updateProfile(Integer doctorId, DoctorProfileDto profileDto) {
        return "Updated profile for doctorId: " + doctorId;
    }
}