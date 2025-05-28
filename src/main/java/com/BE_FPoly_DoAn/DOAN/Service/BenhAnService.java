package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.BenhAn;

import java.util.List;
import java.util.Optional;

public interface BenhAnService {
    List<BenhAn> getAll();

    Optional<BenhAn> getById(Integer id);

    BenhAn save(BenhAn benhAn);

    void delete(Integer id);
}