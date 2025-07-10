package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DonNghiPhepDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DuyetDonDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.DonNghiPhep;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Mapper.DonNghiPhepMapper;
import com.BE_FPoly_DoAn.DOAN.Dao.BacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.DonNghiPhepRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DonNghiPhepServiceImpl implements InterfaceService<DonNghiPhep> {

    private final DonNghiPhepRepository donNghiPhepRepository;
    private final BacSiRepository bacSiRepository;
    private final LichLamViecBacSiRepository lichLamViecBacSiRepository;

    public DonNghiPhepServiceImpl(DonNghiPhepRepository donNghiPhepRepository,
                                  BacSiRepository bacSiRepository,
                                  LichLamViecBacSiRepository lichLamViecBacSiRepository) {
        this.donNghiPhepRepository = donNghiPhepRepository;
        this.bacSiRepository = bacSiRepository;
        this.lichLamViecBacSiRepository = lichLamViecBacSiRepository;
    }

    public ServiceResponse<?> dangKyNghi(DonNghiPhepDTO dto) {
        Optional<BacSi> optionalBacSi = bacSiRepository.findById(dto.getBacSiId());
        if (optionalBacSi.isEmpty()) {
            return ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND);
        }

        BacSi bacSi = optionalBacSi.get();

        if (dto.getNgayBatDau().isAfter(dto.getNgayKetThuc())) {
            return ServiceResponse.error(NotificationCode.DON_INVALID_DATE);
        }

        if (dto.getNgayBatDau().isBefore(LocalDate.now())) {
            return ServiceResponse.error(NotificationCode.DON_IN_PAST);
        }

        List<LichLamViecBacSi> lichBiTrung = lichLamViecBacSiRepository
                .findByBacSiAndNgayBetween(bacSi, dto.getNgayBatDau(), dto.getNgayKetThuc());

        if (!lichBiTrung.isEmpty()) {
            return ServiceResponse.error(NotificationCode.DON_CONFLICT);
        }

        DonNghiPhep entity = DonNghiPhepMapper.toEntity(dto, bacSi);
        donNghiPhepRepository.save(entity);

        return ServiceResponse.success(NotificationCode.DON_REGISTER_SUCCESS);
    }

    @Override
    public List<DonNghiPhep> getAll() {
        return donNghiPhepRepository.findAll();
    }

    @Override
    public Optional<DonNghiPhep> getById(Integer id) {
        return donNghiPhepRepository.findById(id);
    }

    @Override
    public DonNghiPhep save(DonNghiPhep donNghiPhep) {
        return donNghiPhepRepository.save(donNghiPhep);
    }

    @Override
    public void delete(DonNghiPhep donNghiPhep) {
        donNghiPhepRepository.delete(donNghiPhep);
    }

    public List<DonNghiPhep> getByBacSiId(Integer bacSiId) {
        return donNghiPhepRepository.findByBacSi_BacSiId(bacSiId);
    }

    public ServiceResponse<?> approveDon(Integer id) {
        Optional<DonNghiPhep> optional = donNghiPhepRepository.findById(id);
        if (optional.isEmpty()) {
            return ServiceResponse.error(NotificationCode.DON_NOT_FOUND);
        }

        DonNghiPhep don = optional.get();

        if (don.getTrangThai() != DonNghiPhep.TrangThai.CHO_DUYET) {
            return ServiceResponse.error(NotificationCode.DON_ALREADY_PROCESSED);
        }

        don.setTrangThai(DonNghiPhep.TrangThai.DUOC_DUYET);
        donNghiPhepRepository.save(don);

        return ServiceResponse.success(NotificationCode.DON_APPROVED_SUCCESS);
    }

    public ServiceResponse<?> rejectDon(Integer id, String lyDo) {
        Optional<DonNghiPhep> optional = donNghiPhepRepository.findById(id);
        if (optional.isEmpty()) {
            return ServiceResponse.error(NotificationCode.DON_NOT_FOUND);
        }

        DonNghiPhep don = optional.get();

        if (don.getTrangThai() != DonNghiPhep.TrangThai.CHO_DUYET) {
            return ServiceResponse.error(NotificationCode.DON_ALREADY_PROCESSED);
        }

        don.setTrangThai(DonNghiPhep.TrangThai.TU_CHOI);
        don.setLyDoTuChoi(lyDo);
        donNghiPhepRepository.save(don);

        return ServiceResponse.success(NotificationCode.DON_REJECTED_SUCCESS);
    }

    public ResponseEntity<?> duyetDon(Integer id, DuyetDonDTO dto) {
        if (dto.getTrangThai() == null) {
            return ResponseEntity.badRequest()
                    .body(ServiceResponse.error(NotificationCode.INVALID_TRANG_THAI));
        }

        if (dto.getTrangThai() == DonNghiPhep.TrangThai.TU_CHOI) {
            if (dto.getLyDoTuChoi() == null || dto.getLyDoTuChoi().isBlank()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(ServiceResponse.error(NotificationCode.VALIDATION_REJECT_REASON_REQUIRED));
            }
            return ResponseEntity.ok(rejectDon(id, dto.getLyDoTuChoi()));
        }

        if (dto.getTrangThai() == DonNghiPhep.TrangThai.DUOC_DUYET) {
            return ResponseEntity.ok(approveDon(id));
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ServiceResponse.error(NotificationCode.INVALID_TRANG_THAI));
    }
}