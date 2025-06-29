package com.BE_FPoly_DoAn.DOAN.Contronler.QuanLy;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quanly")
public class QuanLyRegisterController {
    @GetMapping("/dangki")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> dangKiLeTan(){

        return ResponseEntity.ok().body("");
    }
}
