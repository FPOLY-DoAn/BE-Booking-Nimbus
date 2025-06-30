package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LichLamViecBacSiServiceImpl implements InterfaceService<LichLamViecBacSi> {

    private final LichLamViecBacSiRepository lichLamViecBacSiRepository;

    public LichLamViecBacSiServiceImpl(LichLamViecBacSiRepository lichLamViecBacSiRepository) {
        this.lichLamViecBacSiRepository = lichLamViecBacSiRepository;
    }

    @Override
    public List<LichLamViecBacSi> getAll() {
        return lichLamViecBacSiRepository.findAll();
    }

    @Override
    public Optional<LichLamViecBacSi> getById(Integer id) {
        return lichLamViecBacSiRepository.findById(id);
    }

    @Override
    public LichLamViecBacSi save(LichLamViecBacSi lichLamViecBacSi) {
        return lichLamViecBacSiRepository.save(lichLamViecBacSi);
    }

    @Override
    public void delete(LichLamViecBacSi id) {

    }


}