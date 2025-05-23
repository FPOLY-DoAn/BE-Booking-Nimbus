package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.Benh;

import java.util.List;
import java.util.Optional;

public interface BenhService {
    List<Benh> getAll();

    Optional<Benh> getById(Integer id);

    Benh save(Benh benh);

    void delete(Integer id);
}