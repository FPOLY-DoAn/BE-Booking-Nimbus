package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.DoctorProfileDto;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.DoctorProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bac-si/profile")
public class DoctorProfileController {

    @Autowired
    private DoctorProfileService profileService;

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> updateProfile(@PathVariable Integer id, @RequestBody DoctorProfileDto profileDto) {
        return ResponseEntity.ok(profileService.updateProfile(id, profileDto));
    }
}