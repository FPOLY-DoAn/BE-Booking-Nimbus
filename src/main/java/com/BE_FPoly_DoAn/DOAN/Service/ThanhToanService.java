package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.ThanhToan;

import java.util.List;
import java.util.Optional;

public interface ThanhToanService {
    List<ThanhToan> getAll();

    Optional<ThanhToan> getById(Integer id);

    ThanhToan save(ThanhToan thanhToan);

    void delete(Integer id);
}