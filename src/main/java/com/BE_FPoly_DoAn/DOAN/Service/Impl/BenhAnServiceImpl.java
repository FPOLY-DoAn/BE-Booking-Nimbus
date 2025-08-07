package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhInfoDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.HoSoBenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.*;
import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Mapper.BenhAnMapper;
import com.BE_FPoly_DoAn.DOAN.Mapper.HoSoBenhAnMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BenhAnServiceImpl {

    private final BenhAnRepository benhAnRepo;
    private final LichKhamRepository lichKhamRepo;
    private final BacSiRepository bacSiRepo;
    private final BenhRepository benhRepo;
    private final HoSoBenhAnRepository hoSoRepo;
    private final NguoiDungRepository nguoiDungRepo;
    private final JwtService jwtService;
    private final HttpServletRequest request;

    public BenhAnServiceImpl(
            BenhAnRepository benhAnRepo,
            LichKhamRepository lichKhamRepo,
            BacSiRepository bacSiRepo,
            BenhRepository benhRepo,
            HoSoBenhAnRepository hoSoRepo,
            NguoiDungRepository nguoiDungRepo,
            JwtService jwtService,
            HttpServletRequest request
    ) {
        this.benhAnRepo = benhAnRepo;
        this.lichKhamRepo = lichKhamRepo;
        this.bacSiRepo = bacSiRepo;
        this.benhRepo = benhRepo;
        this.hoSoRepo = hoSoRepo;
        this.nguoiDungRepo = nguoiDungRepo;
        this.jwtService = jwtService;
        this.request = request;
    }

    private BacSi getCurrentBacSiFromToken() {
        Integer nguoiDungId = jwtService.extractUserIdFromRequest(request);
        return bacSiRepo.findByNguoiDung_NguoiDungId(nguoiDungId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy thông tin bác sĩ từ token"));
    }

    @Transactional
    public ServiceResponse<?> create(BenhAnDTO dto) {
        if (dto.getLichKhamId() == null)
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_LICHKHAM_REQUIRED);
        if (dto.getTomTat() == null || dto.getTomTat().trim().isEmpty())
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_TOMTAT_REQUIRED);
        if (dto.getKetLuan() == null || dto.getKetLuan().trim().isEmpty())
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_KETLUAN_REQUIRED);
        if (dto.getThoiGian() == null)
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_THOI_GIAN_REQUIRED);
        if (dto.getBenhIds() == null || dto.getBenhIds().isEmpty())
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_BENHIDS_EMPTY);

        try {
            LichKham lichKham = lichKhamRepo.findById(dto.getLichKhamId())
                    .orElseThrow(() -> new RuntimeException("Lịch khám không tồn tại"));
            BacSi bacSi = getCurrentBacSiFromToken();

            Optional<BenhAn> existingBenhAn = benhAnRepo.findByLichKham_LichkhamId(dto.getLichKhamId());
            if (existingBenhAn.isPresent()) {
                return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_ALREADY_EXISTS);
            }

            BenhAn benhAn = BenhAnMapper.toEntity(dto, lichKham, bacSi);
            BenhAn savedBenhAn = benhAnRepo.save(benhAn);

            List<HoSoBenhAn> hoSoList = new ArrayList<>();
            for (Integer benhId : dto.getBenhIds()) {
                Benh benh = benhRepo.findById(benhId)
                        .orElseThrow(() -> new RuntimeException("Bệnh không tồn tại: ID " + benhId));
                HoSoBenhAn hoSo = HoSoBenhAnMapper.toEntity(
                        new HoSoBenhAnDTO(null, savedBenhAn.getBenhAnId(), benhId), savedBenhAn, benh);
                hoSoList.add(hoSo);
            }
            hoSoRepo.saveAll(hoSoList);

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_CREATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_DELETE_FAIL, e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse<?> update(Integer id, BenhAnDTO dto) {
        if (dto.getLichKhamId() == null)
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_LICHKHAM_REQUIRED);
        if (dto.getTomTat() == null || dto.getTomTat().trim().isEmpty())
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_TOMTAT_REQUIRED);
        if (dto.getKetLuan() == null || dto.getKetLuan().trim().isEmpty())
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_KETLUAN_REQUIRED);
        if (dto.getThoiGian() == null)
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_THOI_GIAN_REQUIRED);
        if (dto.getBenhIds() == null || dto.getBenhIds().isEmpty())
            return ServiceResponse.error(NotificationCode.VALIDATION_BENHAN_BENHIDS_EMPTY);

        try {
            BenhAn existing = benhAnRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Bệnh án không tồn tại"));
            LichKham lichKham = lichKhamRepo.findById(dto.getLichKhamId())
                    .orElseThrow(() -> new RuntimeException("Lịch khám không tồn tại"));
            BacSi bacSi = getCurrentBacSiFromToken();

            existing.setLichKham(lichKham);
            existing.setBacSiKetLuan(bacSi);
            existing.setTomTat(dto.getTomTat());
            existing.setKetLuan(dto.getKetLuan());
            existing.setGhiChu(dto.getGhiChu());
            existing.setThoiGian(dto.getThoiGian());

            benhAnRepo.save(existing);
            hoSoRepo.deleteAll(existing.getHoSoBenhAns());

            List<HoSoBenhAn> hoSoList = new ArrayList<>();
            for (Integer benhId : dto.getBenhIds()) {
                Benh benh = benhRepo.findById(benhId)
                        .orElseThrow(() -> new RuntimeException("Bệnh không tồn tại: ID " + benhId));
                HoSoBenhAn hoSo = HoSoBenhAnMapper.toEntity(
                        new HoSoBenhAnDTO(null, existing.getBenhAnId(), benhId), existing, benh);
                hoSoList.add(hoSo);
            }
            hoSoRepo.saveAll(hoSoList);

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_UPDATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_UPDATE_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> getAll() {
        try {
            List<BenhAn> danhSach = benhAnRepo.findAll();
            List<BenhAnDTO> dtoList = danhSach.stream().map(benhAn -> {
                List<BenhInfoDTO> benhInfoList = benhAn.getHoSoBenhAns().stream()
                        .map(hoso -> new BenhInfoDTO(hoso.getBenh().getBenhId(), hoso.getBenh().getTenBenh()))
                        .toList();
                return BenhAnMapper.toDTO(benhAn, benhInfoList);
            }).toList();

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_LIST, dtoList);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getById(Integer id) {
        try {
            Optional<BenhAn> optional = benhAnRepo.findById(id);
            if (optional.isEmpty()) {
                return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_NOT_FOUND);
            }

            BenhAn benhAn = optional.get();
            List<BenhInfoDTO> benhInfoList = benhAn.getHoSoBenhAns().stream()
                    .map(hoso -> new BenhInfoDTO(hoso.getBenh().getBenhId(), hoso.getBenh().getTenBenh()))
                    .toList();
            BenhAnDTO dto = BenhAnMapper.toDTO(benhAn, benhInfoList);

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_DETAIL, dto);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse<?> delete(Integer id) {
        try {
            BenhAn benhAn = benhAnRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Bệnh án không tồn tại"));
            hoSoRepo.deleteAll(benhAn.getHoSoBenhAns());
            benhAnRepo.delete(benhAn);

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_DELETE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_DELETE_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> getByBenhNhanId(Integer benhNhanId) {
        try {
            List<BenhAn> danhSach = benhAnRepo.findByLichKham_BenhNhan_BenhNhanId(benhNhanId);
            List<BenhAnDTO> dtoList = danhSach.stream().map(benhAn -> {
                List<BenhInfoDTO> benhInfoList = benhAn.getHoSoBenhAns().stream()
                        .map(hoso -> new BenhInfoDTO(hoso.getBenh().getBenhId(), hoso.getBenh().getTenBenh()))
                        .toList();
                return BenhAnMapper.toDTO(benhAn, benhInfoList);
            }).toList();

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_LIST, dtoList);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }
}