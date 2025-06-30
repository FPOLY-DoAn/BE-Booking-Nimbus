package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.ChiTietDonThuocRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.ChiTietDonThuoc;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChiTietDonThuocServiceImpl implements InterfaceService<ChiTietDonThuoc> {

    private final ChiTietDonThuocRepository chiTietDonThuocRepository;

    public ChiTietDonThuocServiceImpl(ChiTietDonThuocRepository chiTietDonThuocRepository) {
        this.chiTietDonThuocRepository = chiTietDonThuocRepository;
    }

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
    public void delete(ChiTietDonThuoc id) {

    }


}