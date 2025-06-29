package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.DonThuocRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.DonThuoc;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonThuocServiceImpl implements InterfaceService<DonThuoc> {

    @Autowired
    private DonThuocRepository donThuocRepository;

    @Override
    public List<DonThuoc> getAll() {
        return donThuocRepository.findAll();
    }

    @Override
    public Optional<DonThuoc> getById(Integer id) {
        return donThuocRepository.findById(id);
    }

    @Override
    public DonThuoc save(DonThuoc DonThuoc) {
        return donThuocRepository.save(DonThuoc);
    }

    @Override
    public void delete(DonThuoc id) {

    }

}