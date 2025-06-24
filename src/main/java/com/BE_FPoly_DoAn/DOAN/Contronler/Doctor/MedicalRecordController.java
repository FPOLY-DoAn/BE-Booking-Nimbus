package com.BE_FPoly_DoAn.DOAN.Contronler.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.MedicalRecordDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bac-si/medical-records")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService recordService;

    @GetMapping("/patients/{patientId}")
    @PreAuthorize("hasRole('Bác sĩ')")
    public List<MedicalRecordDto> getRecords(@PathVariable Integer patientId) {
        return recordService.getRecords(patientId);
    }

    @PostMapping("/patients/{patientId}")
    @PreAuthorize("hasRole('Bác sĩ')")
    public ResponseEntity<?> createRecord(@PathVariable Integer patientId, @RequestBody MedicalRecordDto dto) {
        return ResponseEntity.ok(recordService.createRecord(patientId, dto));
    }

    @GetMapping("/records/{recordId}/export")
    @PreAuthorize("hasRole('Bác sĩ')")
    public ResponseEntity<?> exportPDF(@PathVariable Integer recordId) {
        return ResponseEntity.ok(recordService.exportToPDF(recordId));
    }

    @PostMapping("/records/{recordId}/send-email")
    @PreAuthorize("hasRole('Bác sĩ')")
    public ResponseEntity<?> sendEmail(@PathVariable Integer recordId) {
        return ResponseEntity.ok(recordService.sendRecordByEmail(recordId));
    }
}