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
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BenhAnServiceImpl {

    private final BenhAnRepository benhAnRepo;
    private final LichKhamRepository lichKhamRepo;
    private final BacSiRepository bacSiRepo;
    private final DichVuRepository dichVuRepo;
    private final BenhRepository benhRepo;
    private final HoSoBenhAnRepository hoSoRepo;

    public BenhAnServiceImpl(BenhAnRepository benhAnRepo,
                             LichKhamRepository lichKhamRepo,
                             BacSiRepository bacSiRepo,
                             DichVuRepository dichVuRepo,
                             BenhRepository benhRepo,
                             HoSoBenhAnRepository hoSoRepo) {
        this.benhAnRepo = benhAnRepo;
        this.lichKhamRepo = lichKhamRepo;
        this.bacSiRepo = bacSiRepo;
        this.dichVuRepo = dichVuRepo;
        this.benhRepo = benhRepo;
        this.hoSoRepo = hoSoRepo;
    }

    @Transactional
    public ServiceResponse<?> createBenhAn(BenhAnDTO dto) {
        try {
            LichKham lichKham = lichKhamRepo.findById(dto.getLichKhamId())
                    .orElseThrow(() -> new RuntimeException("Lịch khám không tồn tại"));

            BacSi bacSi = bacSiRepo.findById(dto.getBacSiKetLuanId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));

            DichVu dichVu = dichVuRepo.findById(dto.getDichVuId())
                    .orElseThrow(() -> new RuntimeException("Dịch vụ không tồn tại"));

            BenhAn benhAn = BenhAnMapper.toEntity(dto, lichKham, bacSi, dichVu);
            BenhAn savedBenhAn = benhAnRepo.save(benhAn);

            List<HoSoBenhAn> hoSoList = new ArrayList<>();
            for (Integer benhId : dto.getBenhIds()) {
                Benh benh = benhRepo.findById(benhId)
                        .orElseThrow(() -> new RuntimeException("Bệnh không tồn tại: ID " + benhId));

                HoSoBenhAn hoSo = HoSoBenhAnMapper.toEntity(new HoSoBenhAnDTO(null, savedBenhAn.getBenhAnId(), benhId), savedBenhAn, benh);
                hoSoList.add(hoSo);
            }
            hoSoRepo.saveAll(hoSoList);

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_UPDATE_SUCCESS);

        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_DELETE_FAIL, e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse<?> updateBenhAn(Integer id, @Valid BenhAnDTO dto) {
        try {
            BenhAn existing = benhAnRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Bệnh án không tồn tại"));

            LichKham lichKham = lichKhamRepo.findById(dto.getLichKhamId())
                    .orElseThrow(() -> new RuntimeException("Lịch khám không tồn tại"));

            BacSi bacSi = bacSiRepo.findById(dto.getBacSiKetLuanId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));

            DichVu dichVu = dichVuRepo.findById(dto.getDichVuId())
                    .orElseThrow(() -> new RuntimeException("Dịch vụ không tồn tại"));

            existing.setLichKham(lichKham);
            existing.setBacSiKetLuan(bacSi);
            existing.setDichVu(dichVu);
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

                HoSoBenhAn hoSo = HoSoBenhAnMapper.toEntity(new HoSoBenhAnDTO(null, existing.getBenhAnId(), benhId), existing, benh);
                hoSoList.add(hoSo);
            }
            hoSoRepo.saveAll(hoSoList);

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_UPDATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_UPDATE_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> getAllBenhAn() {
        try {
            List<BenhAn> danhSach = benhAnRepo.findAll();

            List<BenhAnDTO> dtoList = danhSach.stream().map(benhAn -> {
                List<BenhInfoDTO> benhInfoList = benhAn.getHoSoBenhAns().stream()
                        .map(hoso -> {
                            Benh benh = hoso.getBenh();
                            return new BenhInfoDTO(benh.getBenhId(), benh.getTenBenh());
                        })
                        .toList();

                List<Integer> benhIds = benhInfoList.stream()
                        .map(BenhInfoDTO::getBenhId)
                        .toList();

                BenhAnDTO dto = BenhAnMapper.toDto(benhAn, benhIds);
                dto.setBenhInfoList(benhInfoList);
                return dto;
            }).toList();

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_LIST, dtoList);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getBenhAnById(Integer id) {
        try {
            Optional<BenhAn> optional = benhAnRepo.findById(id);
            if (optional.isEmpty()) {
                return ServiceResponse.error(NotificationCode.MEDICAL_RECORD_NOT_FOUND);
            }

            BenhAn benhAn = optional.get();

            List<BenhInfoDTO> benhInfoList = benhAn.getHoSoBenhAns().stream()
                    .map(hoso -> {
                        Benh benh = hoso.getBenh();
                        return new BenhInfoDTO(benh.getBenhId(), benh.getTenBenh());
                    })
                    .toList();

            List<Integer> benhIds = benhInfoList.stream()
                    .map(BenhInfoDTO::getBenhId)
                    .toList();

            BenhAnDTO dto = BenhAnMapper.toDto(benhAn, benhIds);
            dto.setBenhInfoList(benhInfoList);

            return ServiceResponse.success(NotificationCode.MEDICAL_RECORD_DETAIL, dto);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse<?> deleteBenhAn(Integer id) {
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

}