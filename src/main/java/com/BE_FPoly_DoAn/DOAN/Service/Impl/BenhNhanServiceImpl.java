package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan.BenhNhanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.BenhNhanRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Mapper.BenhNhanMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BenhNhanServiceImpl {

    private final BenhNhanRepository benhNhanRepo;
    private final NguoiDungRepository nguoiDungRepo;

    @Transactional
    public ServiceResponse<?> create(Integer nguoiDungId, BenhNhanDTO dto) {
        try {
            NguoiDung nguoiDung = nguoiDungRepo.findById(nguoiDungId)
                    .orElseThrow(() -> new RuntimeException("Người dùng không tồn tại"));

            BenhNhan entity = BenhNhanMapper.toEntity(dto, nguoiDung);
            benhNhanRepo.save(entity);
            return ServiceResponse.success(NotificationCode.PATIENT_CREATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.PATIENT_CREATE_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> getAll() {
        List<BenhNhanDTO> list = benhNhanRepo.findAll().stream()
                .map(BenhNhanMapper::toDTO)
                .toList();
        return ServiceResponse.success(NotificationCode.PATIENT_LIST_SUCCESS, list);
    }

    public ServiceResponse<?> getById(Integer id) {
        return benhNhanRepo.findById(id)
                .map(bn -> ServiceResponse.success(NotificationCode.PATIENT_DETAIL_SUCCESS, BenhNhanMapper.toDTO(bn)))
                .orElseGet(() -> ServiceResponse.error(NotificationCode.PATIENT_NOT_FOUND));
    }

    @Transactional
    public ServiceResponse<?> update(Integer id, BenhNhanDTO dto) {
        try {
            Optional<BenhNhan> optional = benhNhanRepo.findById(id);
            if (optional.isEmpty()) {
                return ServiceResponse.error(NotificationCode.PATIENT_NOT_FOUND);
            }

            if (dto.getHoTen() == null || dto.getHoTen().isBlank()) {
                return ServiceResponse.error(NotificationCode.VALIDATION_NAME_REQUIRED);
            }

            if (dto.getEmail() == null || dto.getEmail().isBlank()) {
                return ServiceResponse.error(NotificationCode.VALIDATION_EMAIL_REQUIRED);
            }

            if (!dto.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                return ServiceResponse.error(NotificationCode.VALIDATION_EMAIL_INVALID);
            }

            if (dto.getSoDienThoai() == null || dto.getSoDienThoai().isBlank()) {
                return ServiceResponse.error(NotificationCode.VALIDATION_PHONE_REQUIRED);
            }

            if (!dto.getSoDienThoai().matches("^\\d{10,15}$")) {
                return ServiceResponse.error(NotificationCode.VALIDATION_PHONE_INVALID);
            }

            if (dto.getGioiTinh() == null || dto.getGioiTinh().isBlank()) {
                return ServiceResponse.error(NotificationCode.VALIDATION_GENDER_REQUIRED);
            }

            if (dto.getBaoHiem() == null || dto.getBaoHiem().isBlank()) {
                return ServiceResponse.error(NotificationCode.VALIDATION_BAOHIEM_REQUIRED);
            }

            if (dto.getLienHeKhanCap() == null || dto.getLienHeKhanCap().isBlank()) {
                return ServiceResponse.error(NotificationCode.VALIDATION_KHANCAP_REQUIRED);
            }

            if (!dto.getLienHeKhanCap().matches("^\\d{10,15}$")) {
                return ServiceResponse.error(NotificationCode.VALIDATION_KHANCAP_INVALID);
            }

            BenhNhan benhNhan = optional.get();

            benhNhan.setBaoHiem(dto.getBaoHiem());
            benhNhan.setLienHeKhanCap(dto.getLienHeKhanCap());
            benhNhan.setDiaChi(dto.getDiaChi());

            NguoiDung nguoiDung = benhNhan.getNguoiDung();
            if (nguoiDung != null) {
                nguoiDung.setHoTen(dto.getHoTen());
                nguoiDung.setEmail(dto.getEmail());
                nguoiDung.setSoDienThoai(dto.getSoDienThoai());
                nguoiDung.setGioiTinh(dto.getGioiTinh());
            }

            benhNhanRepo.save(benhNhan);

            return ServiceResponse.success(NotificationCode.PATIENT_UPDATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.PATIENT_UPDATE_FAIL, e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse<?> delete(Integer id) {
        try {
            BenhNhan bn = benhNhanRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy bệnh nhân"));
            benhNhanRepo.delete(bn);
            return ServiceResponse.success(NotificationCode.PATIENT_DELETE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.PATIENT_DELETE_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> themThongTinBenhNhan(BenhNhanRequestDTO dto, String email) {
        try {
            Optional<NguoiDung> optional = nguoiDungRepo.findByEmail(email);
            if (optional.isEmpty()) {
                return ServiceResponse.error(NotificationCode.AUTH_INVALID_TOKEN, "Không tìm thấy người dùng với email: " + email);
            }

            NguoiDung nd = optional.get();

            if (!nd.getBenhNhans().isEmpty()) {
                return ServiceResponse.error(NotificationCode.PATIENT_NOT_FOUND);
            }

            BenhNhan benhNhan = BenhNhan.builder()
                    .nguoiDung(nd)
                    .baoHiem(dto.getBaoHiem())
                    .diaChi(dto.getDiaChi())
                    .lienHeKhanCap(dto.getLienHeKhanCap())
                    .build();

            benhNhanRepo.save(benhNhan);
            return ServiceResponse.success(NotificationCode.PATIENT_CREATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.PATIENT_CREATE_FAIL, e.getMessage());
        }
    }

}