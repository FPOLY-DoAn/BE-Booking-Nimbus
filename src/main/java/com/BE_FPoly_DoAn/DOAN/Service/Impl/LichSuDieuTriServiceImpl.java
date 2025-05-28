package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LichSuDieuTriRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LichSuDieuTri;
import com.BE_FPoly_DoAn.DOAN.Service.LichSuDieuTriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LichSuDieuTriServiceImpl implements LichSuDieuTriService {

    @Autowired
    private LichSuDieuTriRepository lichSuDieuTriRepository;

    @Override
    public List<LichSuDieuTri> getAll() {
        return lichSuDieuTriRepository.findAll();
    }

    @Override
    public Optional<LichSuDieuTri> getById(Integer id) {
        return lichSuDieuTriRepository.findById(id);
    }

    @Override
    public LichSuDieuTri save(LichSuDieuTri lichSuDieuTri) {
        return lichSuDieuTriRepository.save(lichSuDieuTri);
    }

    @Override
    public void delete(Integer id) {
        lichSuDieuTriRepository.findById(id).ifPresent(lichSuDieuTriRepository::delete);
    }
}