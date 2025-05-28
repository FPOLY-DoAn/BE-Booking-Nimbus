package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.ThanhToanRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.ThanhToan;
import com.BE_FPoly_DoAn.DOAN.Service.ThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThanhToanServiceImpl implements ThanhToanService {

    @Autowired
    private ThanhToanRepository thanhToanRepository;

    @Override
    public List<ThanhToan> getAll() {
        return thanhToanRepository.findAll();
    }

    @Override
    public Optional<ThanhToan> getById(Integer id) {
        return thanhToanRepository.findById(id);
    }

    @Override
    public ThanhToan save(ThanhToan thanhToan) {
        return thanhToanRepository.save(thanhToan);
    }

    @Override
    public void delete(Integer id) {
        thanhToanRepository.findById(id).ifPresent(thanhToanRepository::delete);
    }
}