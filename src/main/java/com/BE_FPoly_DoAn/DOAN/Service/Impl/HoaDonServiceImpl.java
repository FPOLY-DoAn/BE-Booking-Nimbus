package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.HoaDonRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.HoaDon;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoaDonServiceImpl implements InterfaceService<HoaDon> {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Override
    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }

    @Override
    public Optional<HoaDon> getById(Integer id) {
        return hoaDonRepository.findById(id);
    }

    @Override
    public HoaDon save(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public void delete(HoaDon id) {

    }

}