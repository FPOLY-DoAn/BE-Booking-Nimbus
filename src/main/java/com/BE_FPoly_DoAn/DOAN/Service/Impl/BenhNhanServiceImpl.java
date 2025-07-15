package com.BE_FPoly_DoAn.DOAN.Service.Impl;

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
            BenhNhan benhNhan = benhNhanRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy bệnh nhân"));

            benhNhan.setBaoHiem(dto.getBaoHiem());
            benhNhan.setLienHeKhanCap(dto.getLienHeKhanCap());

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
}