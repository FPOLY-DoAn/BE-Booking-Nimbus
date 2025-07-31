package com.BE_FPoly_DoAn.DOAN.Dao;


import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChuyenKhoaRepository extends JpaRepository<ChuyenKhoa, Integer> {
    boolean existsByTenKhoaIgnoreCase(String tenKhoa);

    Optional<ChuyenKhoa> findByTenKhoaIgnoreCase(String tenKhoa);
}