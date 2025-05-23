package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LichKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import com.BE_FPoly_DoAn.DOAN.Service.LichKhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LichKhamServiceImpl implements LichKhamService {

    @Autowired
    private LichKhamRepository lichKhamRepository;

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
    public void delete(Integer id) {
        lichKhamRepository.findById(id).ifPresent(lichKhamRepository::delete);
    }
}