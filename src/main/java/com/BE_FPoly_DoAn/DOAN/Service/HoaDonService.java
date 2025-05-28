package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.HoaDon;

import java.util.List;
import java.util.Optional;

public interface HoaDonService {
    List<HoaDon> getAll();

    Optional<HoaDon> getById(Integer id);

    HoaDon save(HoaDon hoaDon);

    void delete(Integer id);
}