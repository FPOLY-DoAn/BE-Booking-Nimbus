package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LoaiHinhKham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoaiHinhKhamRepository extends JpaRepository<LoaiHinhKham, Integer> {
    Optional<LoaiHinhKham> findByTenLoai(String tenLoai);

    boolean existsByTenLoai(String tenLoai);
}