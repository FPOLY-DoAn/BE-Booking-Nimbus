package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Entity.ThanhToan;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThanhToanServiceImpl implements InterfaceService<ThanhToan> {

    @Override
    public List<ThanhToan> getAll() {
        return List.of();
    }

    @Override
    public Optional<ThanhToan> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public ThanhToan save(ThanhToan thanhToan) {
        return null;
    }

    @Override
    public void delete(ThanhToan id) {

    }
}