package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;

import java.util.List;
import java.util.Optional;

public interface BenhNhanService {
    List<BenhNhan> getAll();

    Optional<BenhNhan> getById(Integer id);

    BenhNhan save(BenhNhan benhNhan);

    void delete(Integer id);
}