package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;

import java.util.List;
import java.util.Optional;

public interface PhanQuyenService {
    List<PhanQuyen> getAll();

    Optional<PhanQuyen> getById(Integer id);

    PhanQuyen save(PhanQuyen phanQuyen);

    void delete(Integer id);
}