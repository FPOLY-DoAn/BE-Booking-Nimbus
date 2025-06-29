package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.ChiTietHoaDonRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.ChiTietHoaDon;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChiTietHoaDonServiceImpl implements InterfaceService<ChiTietHoaDon> {

    @Autowired
    private ChiTietHoaDonRepository chiTietHoaDonRepository;

    @Override
    public List<ChiTietHoaDon> getAll() {
        return chiTietHoaDonRepository.findAll();
    }

    @Override
    public Optional<ChiTietHoaDon> getById(Integer id) {
        return chiTietHoaDonRepository.findById(id);
    }

    @Override
    public ChiTietHoaDon save(ChiTietHoaDon ChiTietHoaDon) {
        return chiTietHoaDonRepository.save(ChiTietHoaDon);
    }

    @Override
    public void delete(ChiTietHoaDon id) {

    }


}