package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.ChiTietDonThuoc;

import java.util.List;
import java.util.Optional;

public interface ChiTietDonThuocService {
    List<ChiTietDonThuoc> getAll();

    Optional<ChiTietDonThuoc> getById(Integer id);

    ChiTietDonThuoc save(ChiTietDonThuoc chiTietDonThuoc);

    void delete(Integer id);
}