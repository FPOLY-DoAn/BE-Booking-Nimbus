package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.PhongKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.PhongKham;
import com.BE_FPoly_DoAn.DOAN.Service.PhongKhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongKhamServiceImpl implements PhongKhamService {

    @Autowired
    private PhongKhamRepository phongKhamRepository;

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
    public void delete(Integer id) {
        phongKhamRepository.findById(id).ifPresent(phongKhamRepository::delete);
    }
}