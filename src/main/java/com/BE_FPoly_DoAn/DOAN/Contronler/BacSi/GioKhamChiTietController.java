package com.BE_FPoly_DoAn.DOAN.Contronler.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.TaoGioTuDongDTO;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.GioKhamChiTietServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gio-kham")
public class GioKhamChiTietController {

    private final GioKhamChiTietServiceImpl gioKhamChiTietService;

    public GioKhamChiTietController(GioKhamChiTietServiceImpl gioKhamChiTietService) {
        this.gioKhamChiTietService = gioKhamChiTietService;
    }

    @GetMapping("/{lichId}")
    public ResponseEntity<?> getSlotsByLich(@PathVariable Integer lichId) {
        return ResponseEntity.ok(gioKhamChiTietService.getByLichId(lichId));
    }

    @PostMapping("/TaoGioKhamChiTiet")
    public ResponseEntity<?> createGioKhamChiTiet(@RequestBody GioKhamChiTietDto dto) {
        return ResponseEntity.ok(gioKhamChiTietService.create(dto));
    }

    @PostMapping("/TaoGioKhamChiTietTuDong")
    public ResponseEntity<?> generateGioKham(@RequestBody TaoGioTuDongDTO req) {
        return ResponseEntity.ok(gioKhamChiTietService.generate(req));
    }
}