package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface LichLamViecBacSiRepository extends JpaRepository<LichLamViecBacSi, Integer> {
    List<LichLamViecBacSi> findByBacSi_BacSiId(Integer bacSiId);
    List<LichLamViecBacSi> findByBacSi_BacSiIdAndNgay(Integer bacSiId, LocalDate ngay);
}