package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;

import java.util.List;
import java.util.Optional;

public interface LichLamViecBacSiService {
    List<LichLamViecBacSi> getAll();

    Optional<LichLamViecBacSi> getById(Integer id);

    LichLamViecBacSi save(LichLamViecBacSi lichLamViecBacSi);

    void delete(Integer id);
}