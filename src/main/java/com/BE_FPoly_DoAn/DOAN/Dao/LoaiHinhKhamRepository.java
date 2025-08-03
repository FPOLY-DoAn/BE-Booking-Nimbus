package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LoaiHinhKham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaiHinhKhamRepository extends JpaRepository<LoaiHinhKham, Integer> {
    boolean existsByTenLoai(String tenLoai);
}