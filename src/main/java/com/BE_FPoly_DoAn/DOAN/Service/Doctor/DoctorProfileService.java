package com.BE_FPoly_DoAn.DOAN.Service.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.DoctorProfileDto;

public interface DoctorProfileService {
    Object updateProfile(Integer doctorId, DoctorProfileDto profileDto);
}