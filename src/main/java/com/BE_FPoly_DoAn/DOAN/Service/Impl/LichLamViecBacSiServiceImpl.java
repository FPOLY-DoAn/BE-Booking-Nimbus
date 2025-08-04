package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecResponseDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.BacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Mapper.LichLamViecMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LichLamViecBacSiServiceImpl implements InterfaceService<LichLamViecBacSi> {

    private final LichLamViecBacSiRepository repository;
    private final BacSiRepository bacSiRepository;

    public LichLamViecBacSiServiceImpl(LichLamViecBacSiRepository repository, BacSiRepository bacSiRepository) {
        this.repository = repository;
        this.bacSiRepository = bacSiRepository;
    }

    @Override
    public List<LichLamViecBacSi> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<LichLamViecBacSi> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public LichLamViecBacSi save(LichLamViecBacSi entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(LichLamViecBacSi entity) {
        repository.delete(entity);
    }

    public ServiceResponse<?> dangKyNghi(Integer bacSiId, LichLamViecDTO dto) {
        try {
            LichLamViecBacSi entity = new LichLamViecBacSi();
            entity.setBacSi(BacSi.builder().bacSiId(bacSiId).build());
            entity.setNgay(dto.getNgay());
            entity.setCaTruc(dto.getCaTruc());
            entity.setLyDoNghi(dto.getLyDoNghi());

            repository.save(entity);
            return ServiceResponse.success(NotificationCode.WORK_SCHEDULE_DETAILS_CUSSCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.WORK_SCHEDULE_DETAILS_FAIL);
        }
    }

    public ServiceResponse<?> getLichLamViecByBacSi(Integer bacSiId) {
        try {
            List<LichLamViecResponseDTO> list = repository.findByBacSi_BacSiId(bacSiId)
                    .stream()
                    .map(LichLamViecMapper::toDto)
                    .toList();

            return ServiceResponse.success(NotificationCode.SERVICE_LIST, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVICE_UNAVAILABLE);
        }
    }

    public ServiceResponse<?> suaLichLamViec(Integer lichId, LichLamViecDTO dto) {
        Optional<LichLamViecBacSi> optional = repository.findById(lichId);
        if (optional.isEmpty()) {
            return ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND);
        }

        try {
            LichLamViecBacSi entity = optional.get();
            entity.setNgay(dto.getNgay());
            entity.setCaTruc(dto.getCaTruc());
            entity.setLyDoNghi(dto.getLyDoNghi());
            repository.save(entity);
            return ServiceResponse.success(NotificationCode.SERVICE_UPDATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVICE_UPDATE_FAIL);
        }
    }

    public ServiceResponse<?> xoaLichLamViec(Integer lichId) {
        Optional<LichLamViecBacSi> optional = repository.findById(lichId);
        if (optional.isEmpty()) {
            return ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND);
        }

        try {
            repository.delete(optional.get());
            return ServiceResponse.success(NotificationCode.SERVICE_DELETE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVICE_DELETE_FAIL);
        }
    }

    public ServiceResponse<?> taoLichLamViec(Integer bacSiId, LichLamViecDTO dto) {
        try {
            boolean isExist = repository.existsByBacSi_BacSiIdAndNgayAndCaTruc(bacSiId, dto.getNgay(), dto.getCaTruc());
            if (isExist) {
                return ServiceResponse.error(NotificationCode.CREATE_FAIL, "Bác sĩ đã có lịch làm việc trong ca này");
            }

            Optional<BacSi> optional = bacSiRepository.findById(bacSiId);
            if (optional.isEmpty()) {
                return ServiceResponse.error(NotificationCode.NOT_FOUND, "Không tìm thấy bác sĩ");
            }

            BacSi bacSi = optional.get();

            LichLamViecBacSi entity = LichLamViecBacSi.builder()
                    .bacSi(bacSi)
                    .ngay(dto.getNgay())
                    .caTruc(dto.getCaTruc())
                    .lyDoNghi(dto.getLyDoNghi())
                    .build();

            LichLamViecBacSi saved = repository.save(entity);

            return ServiceResponse.success(
                    NotificationCode.WORK_SCHEDULE_CREATE_SUCCESS,
                    LichLamViecMapper.toDto(saved)
            );
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.WORK_SCHEDULE_CREATE_FAIL, e.getMessage());
        }
    }
}