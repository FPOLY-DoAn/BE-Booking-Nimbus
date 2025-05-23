package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.DonThuoc;

import java.util.List;
import java.util.Optional;

public interface DonThuocService {
    List<DonThuoc> getAll();

    Optional<DonThuoc> getById(Integer id);

    DonThuoc save(DonThuoc donThuoc);

    void delete(Integer id);
}