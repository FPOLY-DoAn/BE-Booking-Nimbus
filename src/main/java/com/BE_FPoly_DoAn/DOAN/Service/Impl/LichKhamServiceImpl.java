package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.*;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Fillter.LichKhamSpecification;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Mapper.LichKhamMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LichKhamServiceImpl {

    private final LichKhamRepository lichKhamRepo;
    private final BacSiRepository bacSiRepo;
    private final BenhNhanRepository benhNhanRepo;
    private final LichLamViecBacSiRepository lichLamViecBacSiRepo;
    private final GioKhamChiTietRepository gioKhamChiTietRepo;
    private final LoaiHinhKhamRepository loaiHinhKhamRepo;

    public LichKhamServiceImpl(LichKhamRepository lichKhamRepo,
                               BacSiRepository bacSiRepo,
                               BenhNhanRepository benhNhanRepo,
                               LichLamViecBacSiRepository lichLamViecBacSiRepo,
                               GioKhamChiTietRepository gioKhamChiTietRepo, LoaiHinhKhamRepository loaiHinhKhamRepo) {
        this.lichKhamRepo = lichKhamRepo;
        this.bacSiRepo = bacSiRepo;
        this.benhNhanRepo = benhNhanRepo;
        this.lichLamViecBacSiRepo = lichLamViecBacSiRepo;
        this.gioKhamChiTietRepo = gioKhamChiTietRepo;
        this.loaiHinhKhamRepo = loaiHinhKhamRepo;
    }

    @Transactional
    public ServiceResponse<?> create(LichKhamDTO dto) {
        if (dto.getThoiGianTu() == null || dto.getThoiGianDen() == null || dto.getNgayKham() == null) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian hẹn hoặc ngày khám không được để trống");
        }

        LocalTime gioHen = dto.getThoiGianTu();
        LocalTime gioDen = dto.getThoiGianDen();

        if (!gioHen.isBefore(gioDen)) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian hẹn phải trước thời gian đến");
        }

        if (dto.getNgayKham().isBefore(LocalDate.now())) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Không thể đặt lịch cho ngày trong quá khứ");
        }

        boolean isBacSiRanh = lichLamViecBacSiRepo.existsByBacSi_BacSiIdAndNgayAndCaTruc(
                dto.getBacSiId(), dto.getNgayKham(), dto.getCaKham()
        );
        if (!isBacSiRanh) {
            return ServiceResponse.error("APP_015", "Bác sĩ không có lịch làm việc trong ca này");
        }

        boolean daTrungLich = lichKhamRepo.existsLichKhamTrung(
                dto.getBacSiId(),
                dto.getNgayKham(),
                gioHen,
                gioDen,
                null
        );
        if (daTrungLich) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_CONFLICT,
                    "Thời gian khám đã bị trùng với lịch khác của bác sĩ");
        }

        int soLich = lichKhamRepo.countLichKhamByBacSiAndNgayAndCa(
                Long.valueOf(dto.getBacSiId()), dto.getNgayKham(), dto.getCaKham()
        );
        int gioiHanLich = 5;
        if (soLich >= gioiHanLich) {
            return ServiceResponse.error("APP_014",
                    "Bác sĩ đã đủ lịch trong ca " + dto.getCaKham());
        }

        if (!isThoiGianHopLeTheoCa(gioHen, dto.getCaKham())) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Giờ hẹn không phù hợp với ca khám đã chọn: " + dto.getCaKham());
        }

        try {
            BacSi bacSi = bacSiRepo.findById(dto.getBacSiId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));
            BenhNhan benhNhan = benhNhanRepo.findById(dto.getBenhNhanId())
                    .orElseThrow(() -> new RuntimeException("Bệnh nhân không tồn tại"));

            LoaiHinhKham loaiHinhKham = loaiHinhKhamRepo.findByTenLoai(dto.getLoaiHinhKham())
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy loại hình khám: " + dto.getLoaiHinhKham()));

            LichKham lichKham = LichKhamMapper.toEntity(dto, bacSi, benhNhan, loaiHinhKham);
            lichKhamRepo.save(lichKham);

            List<GioKhamChiTiet> gioKhamChiTietList = gioKhamChiTietRepo
                    .findByLichLamViecBacSi_BacSi_BacSiIdAndLichLamViecBacSi_NgayAndLichLamViecBacSi_CaTruc(
                            dto.getBacSiId(), dto.getNgayKham(), dto.getCaKham()
                    );

            gioKhamChiTietList.stream()
                    .filter(slot -> !slot.getThoiGian().isBefore(gioHen)
                            && !slot.getThoiGian().isAfter(gioDen))
                    .forEach(slot -> slot.setTrangThai(false));

            gioKhamChiTietRepo.saveAll(gioKhamChiTietList);

            return ServiceResponse.success(NotificationCode.APPOINTMENT_CREATE_SUCCESS, LichKhamMapper.toDTO(lichKham));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_CREATE_FAIL,
                    "Lỗi khi tạo lịch khám: " + e.getMessage());
        }
    }

    public ServiceResponse<?> getAll() {
        try {
            List<LichKhamDTO> list = lichKhamRepo.findAll().stream()
                    .map(LichKhamMapper::toDTO)
                    .toList();
            return ServiceResponse.success(NotificationCode.APPOINTMENT_LIST_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getById(Integer id) {
        return lichKhamRepo.findById(id)
                .map(lk -> ServiceResponse.success(NotificationCode.APPOINTMENT_DETAIL_SUCCESS, LichKhamMapper.toDTO(lk)))
                .orElseGet(() -> ServiceResponse.error(NotificationCode.APPOINTMENT_NOT_FOUND));
    }

    @Transactional
    public ServiceResponse<?> update(Integer id, LichKhamDTO dto) {

        if (dto.getThoiGianTu() == null || dto.getThoiGianDen() == null || dto.getNgayKham() == null) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian khám không được để trống");
        }

        LocalTime gioHen = dto.getThoiGianTu();
        LocalTime gioDen = dto.getThoiGianDen();

        if (!gioHen.isBefore(gioDen)) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian hẹn phải trước thời gian đến");
        }

        if (dto.getNgayKham().isBefore(LocalDate.now())) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Không thể cập nhật lịch cho ngày đã qua");
        }

        boolean isBacSiRanh = lichLamViecBacSiRepo.existsByBacSi_BacSiIdAndNgayAndCaTruc(
                dto.getBacSiId(), dto.getNgayKham(), dto.getCaKham()
        );
        if (!isBacSiRanh) {
            return ServiceResponse.error("APP_015", "Bác sĩ không có lịch làm việc trong ca này");
        }

        boolean daTrung = lichKhamRepo.existsLichKhamTrung(
                dto.getBacSiId(),
                dto.getNgayKham(),
                gioHen,
                gioDen,
                id
        );
        if (daTrung) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_CONFLICT,
                    "Thời gian khám đã bị trùng với lịch khác");
        }

        try {
            LichKham existing = lichKhamRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy lịch khám"));

            BacSi bacSi = bacSiRepo.findById(dto.getBacSiId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));

            BenhNhan benhNhan = benhNhanRepo.findById(dto.getBenhNhanId())
                    .orElseThrow(() -> new RuntimeException("Bệnh nhân không tồn tại"));

            LoaiHinhKham loaiHinhKham = loaiHinhKhamRepo.findByTenLoai(dto.getLoaiHinhKham())
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy loại hình khám tên: " + dto.getLoaiHinhKham()));

            existing.setBacSi(bacSi);
            existing.setBenhNhan(benhNhan);
            existing.setThoiGianTu(gioHen);
            existing.setThoiGianDen(gioDen);
            existing.setLoaiHinhKham(loaiHinhKham);
            existing.setTrangThai(dto.getTrangThai());
            existing.setGhiChu(dto.getGhiChu());
            existing.setNgayKham(dto.getNgayKham());
            existing.setCaKham(dto.getCaKham());

            lichKhamRepo.save(existing);
            return ServiceResponse.success(NotificationCode.APPOINTMENT_UPDATE_SUCCESS, LichKhamMapper.toDTO(existing));

        } catch (RuntimeException e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_UPDATE_FAIL,
                    "Không thể cập nhật lịch khám: " + e.getMessage());
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_UPDATE_FAIL,
                    "Đã xảy ra lỗi không xác định: " + e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse<?> delete(Integer id) {
        try {
            LichKham lk = lichKhamRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy lịch khám"));

            lichKhamRepo.delete(lk);
            return ServiceResponse.success(NotificationCode.APPOINTMENT_DELETE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_DELETE_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> searchLichKham(LichKhamFilterDTO filter) {
        List<LichKham> result = lichKhamRepo.findAll(LichKhamSpecification.filterBy(filter));

        if (result.isEmpty()) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_NOT_FOUND);
        }

        List<LichKhamDTO> dtoList = result.stream()
                .map(LichKhamMapper::toDTO)
                .toList();

        return ServiceResponse.success(NotificationCode.APPOINTMENT_LIST_SUCCESS, dtoList);
    }

    public ServiceResponse<?> thongKeTheoThang(int month, int year) {
        var raw = lichKhamRepo.thongKeTheoThang(month, year);
        if (raw.isEmpty()) {
            return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);
        }

        List<Map<String, Object>> result = raw.stream().map(row -> {
            Map<String, Object> map = new HashMap<>();
            map.put("thang", row[0]);
            map.put("soLuong", row[1]);
            return map;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_MONTHLY, result);
    }

    public ServiceResponse<?> thongKeTheoBacSi() {
        var raw = lichKhamRepo.thongKeTheoBacSi();
        if (raw.isEmpty()) {
            return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);
        }

        List<Map<String, Object>> result = raw.stream().map(row -> {
            Map<String, Object> map = new HashMap<>();
            map.put("bacSiId", row[0]);
            map.put("soLuong", row[1]);
            return map;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_DOCTOR, result);
    }

    private boolean isThoiGianHopLeTheoCa(LocalTime time, String caKham) {
        if ("Sáng".equalsIgnoreCase(caKham)) {
            return !time.isBefore(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(12, 0));
        } else if ("Chiều".equalsIgnoreCase(caKham)) {
            return !time.isBefore(LocalTime.of(13, 0)) && time.isBefore(LocalTime.of(18, 0));
        } else if ("Tối".equalsIgnoreCase(caKham)) {
            return !time.isBefore(LocalTime.of(18, 0)) && time.isBefore(LocalTime.of(21, 0));
        }
        return false;
    }

    public List<GioKhamChiTietDto> getKhungGioRanh(Integer bacSiId, LocalDate ngayKham, String caKham) {
        List<GioKhamChiTiet> list = gioKhamChiTietRepo
                .findByLichLamViecBacSi_BacSi_BacSiIdAndLichLamViecBacSi_NgayAndLichLamViecBacSi_CaTruc(
                        bacSiId, ngayKham, caKham)
                .stream()
                .filter(GioKhamChiTiet::getTrangThai)
                .toList();

        return list.stream().map(GioKhamChiTietMapper::toDto).toList();
    }
}