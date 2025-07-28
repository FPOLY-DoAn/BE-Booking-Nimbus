package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.TaoGioTuDongDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.GioKhamChiTietRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class GioKhamChiTietServiceImpl {

    private final GioKhamChiTietRepository repository;
    private final LichLamViecBacSiRepository lichLamViecRepo;

    public GioKhamChiTietServiceImpl(GioKhamChiTietRepository repository, LichLamViecBacSiRepository lichLamViecRepo) {
        this.repository = repository;
        this.lichLamViecRepo = lichLamViecRepo;
    }

    public ServiceResponse<?> getByLichId(Integer lichId) {
        List<GioKhamChiTietDto> dtoList = repository.findByLichLamViecBacSi_LichlvId(lichId)
                .stream()
                .map(GioKhamChiTietMapper::toDto)
                .toList();
        return ServiceResponse.success(NotificationCode.SERVICE_ID, dtoList);
    }

    public ServiceResponse<?> create(GioKhamChiTietDto dto) {
        LichLamViecBacSi lich = lichLamViecRepo.findById(dto.getLichLamViecId()).orElse(null);
        if (lich == null) {
            return ServiceResponse.error(NotificationCode.NOT_FOUND, "Không tìm thấy lịch làm việc bác sĩ");
        }

        boolean isDuplicate = repository.findByLichLamViecBacSi_LichlvId(dto.getLichLamViecId())
                .stream()
                .anyMatch(gio -> gio.getThoiGian().equals(dto.getThoiGian()));
        if (isDuplicate) {
            return ServiceResponse.error(NotificationCode.CREATE_FAIL, "Giờ khám đã tồn tại trong lịch này");
        }

        boolean isToday = lich.getNgay().isEqual(java.time.LocalDate.now());
        if (isToday && dto.getThoiGian().isBefore(java.time.LocalTime.now())) {
            return ServiceResponse.error(NotificationCode.CREATE_FAIL, "Không thể tạo giờ khám trong quá khứ");
        }

        GioKhamChiTiet entity = GioKhamChiTietMapper.toEntity(dto, lich);
        repository.save(entity);

        List<GioKhamChiTietDto> updated = repository.findByLichLamViecBacSi_LichlvId(dto.getLichLamViecId())
                .stream()
                .map(GioKhamChiTietMapper::toDto)
                .toList();
        return ServiceResponse.success(NotificationCode.CREATED_SUCCESS, updated);
    }

    public ServiceResponse<?> generate(TaoGioTuDongDTO req) {
        try {
            LichLamViecBacSi lich = lichLamViecRepo.findById(req.getLichLamViecId()).orElse(null);
            if (lich == null) {
                return ServiceResponse.error(NotificationCode.NOT_FOUND, "Không tìm thấy lịch làm việc bác sĩ");
            }

            List<LocalTime> gioTonTai = repository.findByLichLamViecBacSi_LichlvId(req.getLichLamViecId())
                    .stream().map(GioKhamChiTiet::getThoiGian).toList();

            List<GioKhamChiTiet> taoMoi = new java.util.ArrayList<>();
            LocalTime start = LocalTime.parse(req.getBatDau());
            LocalTime end = LocalTime.parse(req.getKetThuc());
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

            return ServiceResponse.success(NotificationCode.CREATED_SUCCESS, ketQua);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.CREATE_FAIL, "Lỗi khi tạo tự động: " + e.getMessage());
        }
    }
}