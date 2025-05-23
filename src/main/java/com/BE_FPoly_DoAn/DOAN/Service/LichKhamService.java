package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;

import java.util.List;
import java.util.Optional;

public interface LichKhamService {
    List<LichKham> getAll();

    Optional<LichKham> getById(Integer id);

    LichKham save(LichKham lichKham);

    void delete(Integer id);
}