package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.PhongKham;

import java.util.List;
import java.util.Optional;

public interface PhongKhamService {
    List<PhongKham> getAll();

    Optional<PhongKham> getById(Integer id);

    PhongKham save(PhongKham phongKham);

    void delete(Integer id);
}