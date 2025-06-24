package com.BE_FPoly_DoAn.DOAN.Contronler.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.ScheduleDto;
import com.BE_FPoly_DoAn.DOAN.Service.DoctorScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bac-si/schedule")
public class DoctorScheduleController {

    @Autowired
    private DoctorScheduleService scheduleService;

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_DOCTOR')")
    public ResponseEntity<?> getSchedule(@PathVariable Integer id) {
        return ResponseEntity.ok(scheduleService.getSchedule(id));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_DOCTOR')")
    public ResponseEntity<?> updateSchedule(@PathVariable Integer id, @RequestBody ScheduleDto dto) {
        return ResponseEntity.ok(scheduleService.updateSchedule(id, dto));
    }

    @PostMapping("/{id}/leave-request")
    @PreAuthorize("hasRole('ROLE_MANAGER')")
    public ResponseEntity<?> requestLeave(@PathVariable Integer id, @RequestBody ScheduleDto dto) {
        return ResponseEntity.ok(scheduleService.requestLeave(id, dto));
    }
}
