package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.PhongKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.PhongKham;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongKhamServiceImpl implements InterfaceService<PhongKham> {

    private final PhongKhamRepository phongKhamRepository;

    public PhongKhamServiceImpl(PhongKhamRepository phongKhamRepository) {
        this.phongKhamRepository = phongKhamRepository;
    }

    @Override
    public List<PhongKham> getAll() {
        return phongKhamRepository.findAll();
    }

    @Override
    public Optional<PhongKham> getById(Integer id) {
        return phongKhamRepository.findById(id);
    }

    @Override
    public PhongKham save(PhongKham phongKham) {
        return phongKhamRepository.save(phongKham);
    }

    @Override
    public void delete(PhongKham id) {

    }

}