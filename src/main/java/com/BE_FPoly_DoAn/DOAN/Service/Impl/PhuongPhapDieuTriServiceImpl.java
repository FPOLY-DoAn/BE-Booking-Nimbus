package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.PhuongPhapDieuTriRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.PhuongPhapDieuTri;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhuongPhapDieuTriServiceImpl implements InterfaceService<PhuongPhapDieuTri> {

    private final PhuongPhapDieuTriRepository phuongPhapDieuTriRepository;

    public PhuongPhapDieuTriServiceImpl(PhuongPhapDieuTriRepository phuongPhapDieuTriRepository) {
        this.phuongPhapDieuTriRepository = phuongPhapDieuTriRepository;
    }

    @Override
    public List<PhuongPhapDieuTri> getAll() {
        return phuongPhapDieuTriRepository.findAll();
    }

    @Override
    public Optional<PhuongPhapDieuTri> getById(Integer id) {
        return phuongPhapDieuTriRepository.findById(id);
    }

    @Override
    public PhuongPhapDieuTri save(PhuongPhapDieuTri phuongPhapDieuTri) {
        return phuongPhapDieuTriRepository.save(phuongPhapDieuTri);
    }

    @Override
    public void delete(PhuongPhapDieuTri id) {

    }
}