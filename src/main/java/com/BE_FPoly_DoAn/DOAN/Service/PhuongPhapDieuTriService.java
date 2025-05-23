package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.PhuongPhapDieuTri;

import java.util.List;
import java.util.Optional;

public interface PhuongPhapDieuTriService {
    List<PhuongPhapDieuTri> getAll();

    Optional<PhuongPhapDieuTri> getById(Integer id);

    PhuongPhapDieuTri save(PhuongPhapDieuTri phuongPhapDieuTri);

    void delete(Integer id);
}