package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("lichLamViecCrudService") // để phân biệt với service nghiệp vụ
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
}