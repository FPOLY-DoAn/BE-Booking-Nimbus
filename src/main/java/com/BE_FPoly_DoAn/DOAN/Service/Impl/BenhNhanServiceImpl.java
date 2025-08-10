package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan.BenhNhanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.BenhAnRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.BenhNhanRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.LichKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhAn;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Mapper.BenhAnMapper;
import com.BE_FPoly_DoAn.DOAN.Mapper.BenhNhanMapper;
import com.BE_FPoly_DoAn.DOAN.Mapper.LichKhamMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BenhNhanServiceImpl {

    private final BenhNhanRepository benhNhanRepo;
    private final NguoiDungRepository nguoiDungRepo;
    private final BenhAnRepository benhAnRepo;
    private final LichKhamRepository lichKhamRepo;

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

            LocalDate now = LocalDate.now();

            BenhNhan benhNhan = BenhNhan.builder()
                    .nguoiDung(nd)
                    .baoHiem(dto.getBaoHiem())
                    .diaChi(dto.getDiaChi())
                    .lienHeKhanCap(dto.getLienHeKhanCap())
                    .canCuocCongDan(dto.getCanCuocCongDan())
                    .danToc(dto.getDanToc())
                    .ngayTao(dto.getNgayTao() != null ? dto.getNgayTao() : now)
                    .ngayCapNhat(dto.getNgayCapNhat() != null ? dto.getNgayCapNhat() : now)
                    .build();

            benhNhanRepo.save(benhNhan);
            return ServiceResponse.success(NotificationCode.PATIENT_CREATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.PATIENT_CREATE_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> getOrCreateBenhNhanIdByEmail(String email) {
        Optional<NguoiDung> optionalNguoiDung = nguoiDungRepo.findByEmail(email);
        if (optionalNguoiDung.isEmpty()) {
            return ServiceResponse.error(NotificationCode.USER_NOT_FOUND);
        }

        NguoiDung nguoiDung = optionalNguoiDung.get();

        Optional<BenhNhan> existing = benhNhanRepo.findByNguoiDung(nguoiDung);
        if (existing.isPresent()) {
            return ServiceResponse.success(NotificationCode.PATIENT_ALREADY_EXISTS, BenhNhanMapper.toRequestDTO(existing.get())
            );
        }

        BenhNhan benhNhan = new BenhNhan();
        benhNhan.setNguoiDung(nguoiDung);
        benhNhan.setNgayTao(LocalDate.now());
        benhNhan.setNgayCapNhat(LocalDate.now());

        BenhNhan saved = benhNhanRepo.save(benhNhan);
        return ServiceResponse.success(NotificationCode.PATIENT_CREATE_SUCCESS, BenhNhanMapper.toRequestDTO(saved));
    }

    @Transactional
    public ServiceResponse<?> updateByEmail(String email, BenhNhanRequestDTO dto) {
        Optional<NguoiDung> optionalNguoiDung = nguoiDungRepo.findByEmail(email);
        if (optionalNguoiDung.isEmpty()) {
            return ServiceResponse.error(NotificationCode.USER_NOT_FOUND);
        }

        NguoiDung nguoiDung = optionalNguoiDung.get();

        Optional<BenhNhan> optionalBenhNhan = benhNhanRepo.findByNguoiDung(nguoiDung);
        if (optionalBenhNhan.isEmpty()) {
            return ServiceResponse.error(NotificationCode.PATIENT_NOT_FOUND);
        }

        BenhNhan benhNhan = optionalBenhNhan.get();

        benhNhan.setBaoHiem(dto.getBaoHiem());
        benhNhan.setDiaChi(dto.getDiaChi());
        benhNhan.setLienHeKhanCap(dto.getLienHeKhanCap());
        benhNhan.setCanCuocCongDan(dto.getCanCuocCongDan());
        benhNhan.setDanToc(dto.getDanToc());
        benhNhan.setNgayCapNhat(LocalDate.now());

        BenhNhan updated = benhNhanRepo.save(benhNhan);

        return ServiceResponse.success(NotificationCode.PATIENT_UPDATE_SUCCESS, BenhNhanMapper.toDTO(updated));
    }

    public ServiceResponse<?> getBenhNhanByEmail(String email) {
        Optional<NguoiDung> optionalNguoiDung = nguoiDungRepo.findByEmail(email);
        if (optionalNguoiDung.isEmpty()) {
            return ServiceResponse.error(NotificationCode.USER_NOT_FOUND);
        }
        NguoiDung nguoiDung = optionalNguoiDung.get();

        Optional<BenhNhan> benhNhanOpt = benhNhanRepo.findByNguoiDung(nguoiDung);
        if (benhNhanOpt.isEmpty()) {
            return ServiceResponse.error(NotificationCode.PATIENT_NOT_FOUND);
        }

        return ServiceResponse.success(NotificationCode.PATIENT_DETAIL_SUCCESS, BenhNhanMapper.toDTO(benhNhanOpt.get()));
    }

    public ServiceResponse<?> getBenhAnByEmail(String email) {
        Optional<NguoiDung> nguoiDungOpt = nguoiDungRepo.findByEmail(email);
        if (nguoiDungOpt.isEmpty()) {
            return ServiceResponse.error(NotificationCode.USER_NOT_FOUND);
        }

        NguoiDung nguoiDung = nguoiDungOpt.get();

        Optional<BenhNhan> benhNhanOpt = benhNhanRepo.findByNguoiDung(nguoiDung);
        if (benhNhanOpt.isEmpty()) {
            return ServiceResponse.error(NotificationCode.PATIENT_NOT_FOUND);
        }

        Integer benhNhanId = benhNhanOpt.get().getBenhNhanId();

        List<BenhAn> benhAnList = benhAnRepo.findByLichKham_BenhNhan_BenhNhanId(benhNhanId);
        List<BenhAnDTO> dtoList = benhAnList.stream()
                .map(BenhAnMapper::toDTO)
                .toList();

        return ServiceResponse.success(NotificationCode.FETCH_SUCCESS, dtoList);
    }

    public ServiceResponse<?> getLichSuKhamByEmail(String email) {
        Optional<NguoiDung> nguoiDungOpt = nguoiDungRepo.findByEmail(email);
        if (nguoiDungOpt.isEmpty()) {
            return ServiceResponse.error(NotificationCode.USER_NOT_FOUND);
        }

        NguoiDung nguoiDung = nguoiDungOpt.get();

        Optional<BenhNhan> benhNhanOpt = benhNhanRepo.findByNguoiDung(nguoiDung);
        if (benhNhanOpt.isEmpty()) {
            return ServiceResponse.error(NotificationCode.PATIENT_NOT_FOUND);
        }

        Integer benhNhanId = benhNhanOpt.get().getBenhNhanId();

        List<LichKham> lichKhamList = lichKhamRepo.findAll(
                (root, query, cb) -> cb.equal(root.get("benhNhan").get("benhNhanId"), benhNhanId)
        );

        List<LichKhamDTO> dtoList = lichKhamList.stream()
                .map(LichKhamMapper::toDTO)
                .toList();

        return ServiceResponse.success(NotificationCode.FETCH_SUCCESS, dtoList);
    }


}