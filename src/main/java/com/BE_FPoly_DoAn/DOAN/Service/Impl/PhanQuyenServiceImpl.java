package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.PhanQuyenRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import com.BE_FPoly_DoAn.DOAN.Service.PhanQuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhanQuyenServiceImpl implements PhanQuyenService {

    @Autowired
    private PhanQuyenRepository phanQuyenRepository;

    @Override
    public List<PhanQuyen> getAll() {
        return phanQuyenRepository.findAll();
    }

    @Override
    public Optional<PhanQuyen> getById(Integer id) {
        return phanQuyenRepository.findById(id);
    }

    @Override
    public PhanQuyen save(PhanQuyen phanQuyen) {
        return phanQuyenRepository.save(phanQuyen);
    }

    @Override
    public void delete(Integer id) {
        phanQuyenRepository.findById(id).ifPresent(phanQuyenRepository::delete);
    }
}