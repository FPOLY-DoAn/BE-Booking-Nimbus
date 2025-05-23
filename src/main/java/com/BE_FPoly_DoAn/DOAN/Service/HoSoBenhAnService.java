package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.HoSoBenhAn;

import java.util.List;
import java.util.Optional;

public interface HoSoBenhAnService {
    List<HoSoBenhAn> getAll();

    Optional<HoSoBenhAn> getById(Integer id);

    HoSoBenhAn save(HoSoBenhAn benhAn);

    void delete(Integer id);
}