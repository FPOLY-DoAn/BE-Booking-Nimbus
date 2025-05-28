package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.LichPhongKham;

import java.util.List;
import java.util.Optional;

public interface LichPhongKhamService {
    List<LichPhongKham> getAll();

    Optional<LichPhongKham> getById(Integer id);

    LichPhongKham save(LichPhongKham lichPhongKham);

    void delete(Integer id);
}