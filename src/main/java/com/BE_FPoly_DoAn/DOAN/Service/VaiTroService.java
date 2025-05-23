package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.VaiTro;

import java.util.List;
import java.util.Optional;

public interface VaiTroService {
    List<VaiTro> getAll();

    Optional<VaiTro> getById(Integer id);

    VaiTro save(VaiTro vaiTro);

    void delete(Integer id);
}