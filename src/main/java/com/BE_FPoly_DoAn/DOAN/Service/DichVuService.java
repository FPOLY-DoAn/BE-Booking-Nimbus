package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;

import java.util.List;
import java.util.Optional;

public interface DichVuService {
    List<DichVu> getAll();

    Optional<DichVu> getById(Integer id);

    DichVu save(DichVu dichVu);

    void delete(Integer id);
}