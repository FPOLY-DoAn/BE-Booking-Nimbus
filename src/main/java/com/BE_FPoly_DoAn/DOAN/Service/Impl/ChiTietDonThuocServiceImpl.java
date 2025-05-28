package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.ChiTietDonThuocRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.ChiTietDonThuoc;
import com.BE_FPoly_DoAn.DOAN.Service.ChiTietDonThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChiTietDonThuocServiceImpl implements ChiTietDonThuocService {

    @Autowired
    private ChiTietDonThuocRepository chiTietDonThuocRepository;

    @Override
    public List<ChiTietDonThuoc> getAll() {
        return chiTietDonThuocRepository.findAll();
    }

    @Override
    public Optional<ChiTietDonThuoc> getById(Integer id) {
        return chiTietDonThuocRepository.findById(id);
    }

    @Override
    public ChiTietDonThuoc save(ChiTietDonThuoc ChiTietDonThuoc) {
        return chiTietDonThuocRepository.save(ChiTietDonThuoc);
    }

    @Override
    public void delete(Integer id) {
        chiTietDonThuocRepository.findById(id).ifPresent(chiTietDonThuocRepository::delete);
    }
}