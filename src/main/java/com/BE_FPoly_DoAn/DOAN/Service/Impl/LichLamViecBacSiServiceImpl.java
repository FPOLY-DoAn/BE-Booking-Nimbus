package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecDto;
import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecResponseDto;
import com.BE_FPoly_DoAn.DOAN.Mapper.LichLamViecMapper;

import java.util.List;
import java.util.Optional;

@Service
public class LichLamViecBacSiServiceImpl implements InterfaceService<LichLamViecBacSi> {

    private final LichLamViecBacSiRepository repository;

    public LichLamViecBacSiServiceImpl(LichLamViecBacSiRepository repository) {
        this.repository = repository;
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

    public ServiceResponse<?> dangKyNghi(Integer bacSiId, LichLamViecDto dto) {
        try {
            LichLamViecBacSi entity = new LichLamViecBacSi();
            entity.setBacSi(BacSi.builder().bacSiId(bacSiId).build());
            entity.setNgay(dto.getNgay());

            repository.save(entity);
            return ServiceResponse.success(NotificationCode.SERVICE_CREATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVICE_CREATE_FAIL);
        }
    }

    public ServiceResponse<?> getLichLamViecByBacSi(Integer bacSiId) {
        try {
            List<LichLamViecResponseDto> list = repository.findByBacSi_BacSiId(bacSiId)
                    .stream()
                    .map(LichLamViecMapper::toDto)
                    .toList();

            return ServiceResponse.success(NotificationCode.SERVICE_LIST, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVICE_UNAVAILABLE);
        }
    }

    public ServiceResponse<?> suaLichLamViec(Integer lichId, LichLamViecDto dto) {
        Optional<LichLamViecBacSi> optional = repository.findById(lichId);
        if (optional.isEmpty()) {
            return ServiceResponse.error(NotificationCode.SERVICE_NOT_FOUND);
        }

        try {
            LichLamViecBacSi entity = optional.get();
            entity.setNgay(dto.getNgay());
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
}