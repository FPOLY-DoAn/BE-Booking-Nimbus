package com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.MedicalRecordDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.MedicalRecordService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Override
    public List<MedicalRecordDto> getRecords(Integer patientId) {
        return Collections.emptyList();
    }

    @Override
    public Object createRecord(Integer patientId, MedicalRecordDto dto) {
        return "Created record for patientId: " + patientId;
    }

    @Override
    public Object exportToPDF(Integer recordId) {
        return "Exported PDF for recordId: " + recordId;
    }

    @Override
    public Object sendRecordByEmail(Integer recordId) {
        return "Sent email with recordId: " + recordId;
    }
}
