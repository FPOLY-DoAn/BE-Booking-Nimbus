package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.ChiTietHoaDon;

import java.util.List;
import java.util.Optional;

public interface ChiTietHoaDonService {
    List<ChiTietHoaDon> getAll();

    Optional<ChiTietHoaDon> getById(Integer id);

    ChiTietHoaDon save(ChiTietHoaDon chiTietHoaDon);

    void delete(Integer id);
}