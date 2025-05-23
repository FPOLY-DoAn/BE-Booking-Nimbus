package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.LichSuDieuTri;

import java.util.List;
import java.util.Optional;

public interface LichSuDieuTriService {
    List<LichSuDieuTri> getAll();

    Optional<LichSuDieuTri> getById(Integer id);

    LichSuDieuTri save(LichSuDieuTri lichSuDieuTri);

    void delete(Integer id);
}