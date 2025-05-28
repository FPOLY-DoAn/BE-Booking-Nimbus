package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;

import java.util.List;
import java.util.Optional;

public interface BacSiService {
    List<BacSi> getAll();

    Optional<BacSi> getById(Integer id);

    BacSi save(BacSi bacSi);

    void delete(Integer id);
}