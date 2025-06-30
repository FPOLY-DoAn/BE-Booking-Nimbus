package com.BE_FPoly_DoAn.DOAN.Service.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.MedicalRecordDto;
import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecordDto> getRecords(Integer patientId);

    Object createRecord(Integer patientId, MedicalRecordDto dto);

    Object exportToPDF(Integer recordId);

    Object sendRecordByEmail(Integer recordId);
}