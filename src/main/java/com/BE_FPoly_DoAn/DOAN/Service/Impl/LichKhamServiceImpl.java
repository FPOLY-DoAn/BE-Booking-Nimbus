package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.*;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Fillter.LichKhamSpecification;
import com.BE_FPoly_DoAn.DOAN.Mapper.LichKhamMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LichKhamServiceImpl {

    private final LichKhamRepository lichKhamRepo;
    private final BacSiRepository bacSiRepo;
    private final BenhNhanRepository benhNhanRepo;

    public LichKhamServiceImpl(LichKhamRepository lichKhamRepo,
                               BacSiRepository bacSiRepo,
                               BenhNhanRepository benhNhanRepo) {
        this.lichKhamRepo = lichKhamRepo;
        this.bacSiRepo = bacSiRepo;
        this.benhNhanRepo = benhNhanRepo;
    }

    @Transactional
    public ServiceResponse<?> create(LichKhamDTO dto) {
        try {
            BacSi bacSi = bacSiRepo.findById(dto.getBacSiId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));
            BenhNhan benhNhan = benhNhanRepo.findById(dto.getBenhNhanId())
                    .orElseThrow(() -> new RuntimeException("Bệnh nhân không tồn tại"));

            LichKham lichKham = LichKhamMapper.toEntity(dto, bacSi, benhNhan);
            lichKhamRepo.save(lichKham);
            return ServiceResponse.success(NotificationCode.APPOINTMENT_CREATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_CREATE_FAIL, e.getMessage());
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
        try {
            LichKham existing = lichKhamRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy lịch khám"));

            BacSi bacSi = bacSiRepo.findById(dto.getBacSiId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));
            BenhNhan benhNhan = benhNhanRepo.findById(dto.getBenhNhanId())
                    .orElseThrow(() -> new RuntimeException("Bệnh nhân không tồn tại"));

            existing.setBacSi(bacSi);
            existing.setBenhNhan(benhNhan);
            existing.setThoiGianHen(dto.getThoiGianHen());
            existing.setThoiGianDen(dto.getThoiGianDen());
            existing.setKieuLichKham(dto.getKieuLichKham());
            existing.setTrangThai(dto.getTrangThai());
            existing.setGhiChu(dto.getGhiChu());
            existing.setNgayKham(dto.getNgayKham());
            existing.setCaKham(dto.getCaKham());

            lichKhamRepo.save(existing);
            return ServiceResponse.success(NotificationCode.APPOINTMENT_UPDATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_UPDATE_FAIL, e.getMessage());
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
        List<LichKhamDTO> dtoList = result.stream().map(LichKhamMapper::toDTO).toList();
        return ServiceResponse.success(NotificationCode.APPOINTMENT_LIST_SUCCESS, dtoList);
    }

    public ServiceResponse<?> thongKeTheoThang() {
        var raw = lichKhamRepo.thongKeTheoThang();
        List<Map<String, Object>> result = raw.stream().map(row -> {
            Map<String, Object> map = new HashMap<>();
            map.put("thang", row[0]);
            map.put("soLuong", row[1]);
            return map;
        }).toList();
        return ServiceResponse.success(NotificationCode.APPOINTMENT_LIST_SUCCESS, result);
    }

    public ServiceResponse<?> thongKeTheoBacSi() {
        var raw = lichKhamRepo.thongKeTheoBacSi();
        List<Map<String, Object>> result = raw.stream().map(row -> {
            Map<String, Object> map = new HashMap<>();
            map.put("bacSiId", row[0]);
            map.put("soLuong", row[1]);
            return map;
        }).toList();
        return ServiceResponse.success(NotificationCode.APPOINTMENT_LIST_SUCCESS, result);
    }
}