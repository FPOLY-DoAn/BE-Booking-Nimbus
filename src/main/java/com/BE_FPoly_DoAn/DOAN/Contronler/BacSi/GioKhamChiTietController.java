package com.BE_FPoly_DoAn.DOAN.Contronler.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.TaoGioTuDongDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.GioKhamChiTietRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/gio-kham")
public class GioKhamChiTietController {

    private final GioKhamChiTietRepository repository;
    private final LichLamViecBacSiRepository lichLamViecRepo;


    public GioKhamChiTietController(GioKhamChiTietRepository repository, LichLamViecBacSiRepository lichLamViecRepo) {
        this.repository = repository;
        this.lichLamViecRepo = lichLamViecRepo;
    }

    @GetMapping("/{lichId}")
    public ResponseEntity<?> getSlotsByLich(@PathVariable Integer lichId) {
        List<GioKhamChiTiet> list = repository.findByLichLamViecBacSi_LichlvId(lichId);
        List<GioKhamChiTietDto> dtoList = list.stream()
                .map(GioKhamChiTietMapper::toDto)
                .toList();
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.SERVICE_ID, dtoList));
    }

    @PostMapping("TaoGioKhamChiTiet")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> createGioKhamChiTiet(@RequestBody GioKhamChiTietDto dto) {
        try {
            LichLamViecBacSi lich = lichLamViecRepo.findById(dto.getLichLamViecId())
                    .orElse(null);

            if (lich == null) {
                return ResponseEntity.badRequest().body(
                        ServiceResponse.error(NotificationCode.NOT_FOUND, "Không tìm thấy lịch làm việc bác sĩ"));
            }

            List<GioKhamChiTiet> gioDaCo = repository.findByLichLamViecBacSi_LichlvId(dto.getLichLamViecId());
            boolean isDuplicate = gioDaCo.stream()
                    .anyMatch(gio -> gio.getThoiGian().equals(dto.getThoiGian()));
            if (isDuplicate) {
                return ResponseEntity.badRequest().body(
                        ServiceResponse.error(NotificationCode.CREATE_FAIL, "Giờ khám đã tồn tại trong lịch này"));
            }

            boolean isToday = lich.getNgay().isEqual(java.time.LocalDate.now());
            if (isToday && dto.getThoiGian().isBefore(java.time.LocalTime.now())) {
                return ResponseEntity.badRequest().body(
                        ServiceResponse.error(NotificationCode.CREATE_FAIL, "Không thể tạo giờ khám trong quá khứ"));
            }

            GioKhamChiTiet entity = GioKhamChiTietMapper.toEntity(dto, lich);
            repository.save(entity);

            List<GioKhamChiTietDto> updatedList = repository.findByLichLamViecBacSi_LichlvId(dto.getLichLamViecId())
                    .stream()
                    .map(GioKhamChiTietMapper::toDto)
                    .toList();

            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.CREATED_SUCCESS, updatedList));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(
                    ServiceResponse.error(NotificationCode.CREATE_FAIL, "Lỗi khi tạo giờ khám: " + e.getMessage()));
        }
    }


    @PostMapping("/TaoGioKhamChiTietTuDong")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> generateGioKham(@RequestBody TaoGioTuDongDTO req) {
        try {
            LichLamViecBacSi lich = lichLamViecRepo.findById(req.getLichLamViecId()).orElse(null);
            if (lich == null) {
                return ResponseEntity.badRequest().body(
                        ServiceResponse.error(NotificationCode.NOT_FOUND, "Không tìm thấy lịch làm việc bác sĩ"));
            }

            LocalTime start = LocalTime.parse(req.getBatDau());
            LocalTime end = LocalTime.parse(req.getKetThuc());

            List<GioKhamChiTiet> gioDaCo = repository.findByLichLamViecBacSi_LichlvId(req.getLichLamViecId());
            List<LocalTime> gioTonTai = gioDaCo.stream()
                    .map(GioKhamChiTiet::getThoiGian)
                    .toList();

            List<GioKhamChiTiet> taoMoi = new java.util.ArrayList<>();
            while (!start.isAfter(end)) {
                if (!gioTonTai.contains(start)) {
                    taoMoi.add(GioKhamChiTiet.builder()
                            .lichLamViecBacSi(lich)
                            .thoiGian(start)
                            .trangThai(true)
                            .build());
                }
                start = start.plusMinutes(req.getBuocNhayPhut());
            }

            repository.saveAll(taoMoi);

            List<GioKhamChiTietDto> ketQua = repository.findByLichLamViecBacSi_LichlvId(req.getLichLamViecId())
                    .stream()
                    .map(GioKhamChiTietMapper::toDto)
                    .toList();

            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.CREATED_SUCCESS, ketQua));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(
                    ServiceResponse.error(NotificationCode.CREATE_FAIL, "Lỗi khi tạo tự động: " + e.getMessage()));
        }
    }

}