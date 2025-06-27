package com.BE_FPoly_DoAn.DOAN.Contronler.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.DoctorStatisticsDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.DoctorStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bac-si/statistics")
public class DoctorStatisticsController {

    @Autowired
    private DoctorStatisticsService statisticsService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public DoctorStatisticsDto getStatistics(@PathVariable Integer id, @RequestParam(defaultValue = "daily") String range) {
        return statisticsService.getStatistics(id, range);
    }
}