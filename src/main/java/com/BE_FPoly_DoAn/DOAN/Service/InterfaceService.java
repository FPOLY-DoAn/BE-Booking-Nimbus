package com.BE_FPoly_DoAn.DOAN.Service;


import java.util.List;
import java.util.Optional;

public interface InterfaceService<T> {
    List<T> getAll();

    Optional<T> getById(Integer id);

    T save(T thanhToan);

    void delete(T id);
}