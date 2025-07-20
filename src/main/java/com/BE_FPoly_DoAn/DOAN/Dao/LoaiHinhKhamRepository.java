package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaiHinhKhamRepository extends JpaRepository<DichVu, Integer> {
    boolean existsByTenDichVu(String tenDichVu);
}