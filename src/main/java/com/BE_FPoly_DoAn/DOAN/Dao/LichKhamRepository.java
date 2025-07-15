package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface LichKhamRepository extends JpaRepository<LichKham, Integer>, JpaSpecificationExecutor<LichKham> {

    boolean existsByNgayKhamAndCaKhamAndBacSi_BacSiIdAndTrangThai(
            LocalDate ngay, String ca, Integer bacSiId, LichKham.TrangThaiLichKham trangThai);

    @Query("SELECT MONTH(l.ngayKham) as thang, COUNT(l) as soLuong " +
            "FROM LichKham l " +
            "GROUP BY MONTH(l.ngayKham)")
    List<Object[]> thongKeTheoThang();

    @Query("SELECT l.bacSi.bacSiId as bacSiId, COUNT(l) as soLuong " +
            "FROM LichKham l " +
            "GROUP BY l.bacSi.bacSiId")
    List<Object[]> thongKeTheoBacSi();
}