package com.BE_FPoly_DoAn.DOAN.Contronler.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.ScheduleDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.DoctorScheduleService;
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
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public ResponseEntity<?> getSchedule(@PathVariable Integer id) {
        return ResponseEntity.ok(scheduleService.getSchedule(id));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public ResponseEntity<?> updateSchedule(@PathVariable Integer id, @RequestBody ScheduleDto dto) {
        return ResponseEntity.ok(scheduleService.updateSchedule(id, dto));
    }

    @PostMapping("/{id}/leave-request")
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public ResponseEntity<?> requestLeave(@PathVariable Integer id, @RequestBody ScheduleDto dto) {
        return ResponseEntity.ok(scheduleService.requestLeave(id, dto));
    }
}
