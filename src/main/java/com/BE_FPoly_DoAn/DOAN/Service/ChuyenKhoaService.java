package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;

import java.util.List;
import java.util.Optional;

public interface ChuyenKhoaService {
    List<ChuyenKhoa> getAll();

    Optional<ChuyenKhoa> getById(Integer id);

    ChuyenKhoa save(ChuyenKhoa chuyenKhoa);

    void delete(Integer id);
}