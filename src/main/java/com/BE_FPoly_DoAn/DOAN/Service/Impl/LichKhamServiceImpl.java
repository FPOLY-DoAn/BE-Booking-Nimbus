package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LichKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LichKhamServiceImpl implements InterfaceService<LichKham> {

    private final LichKhamRepository lichKhamRepository;

    public LichKhamServiceImpl(LichKhamRepository lichKhamRepository) {
        this.lichKhamRepository = lichKhamRepository;
    }

    @Override
    public List<LichKham> getAll() {
        return lichKhamRepository.findAll();
    }

    @Override
    public Optional<LichKham> getById(Integer id) {
        return lichKhamRepository.findById(id);
    }

    @Override
    public LichKham save(LichKham lichKham) {
        return lichKhamRepository.save(lichKham);
    }

    @Override
    public void delete(LichKham id) {

    }


}