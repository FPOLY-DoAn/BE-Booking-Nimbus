package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface LichKhamRepository extends JpaRepository<LichKham, Integer> {
    boolean existsByNgayKhamAndCaKhamAndBacSi_BacSiIdAndTrangThai(
            LocalDate ngay, String ca, Integer bacSiId, LichKham.TrangThaiLichKham trangThai);
}
