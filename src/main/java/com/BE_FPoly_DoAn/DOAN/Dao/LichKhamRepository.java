package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface LichKhamRepository extends JpaRepository<LichKham, Integer>, JpaSpecificationExecutor<LichKham> {

    @Query(value = """
    SELECT CASE WHEN COUNT(*) > 0 THEN CAST(1 AS BIT) ELSE CAST(0 AS BIT) END
    FROM LICH_KHAM
    WHERE bacsi_id = :bacSiId
    AND ngay_kham = :ngayKham
    AND (:excludeId IS NULL OR lichkham_id != :excludeId)
    AND (CAST(:start AS time) < thoi_gian_den AND CAST(:end AS time) > thoi_gian_tu)
    """, nativeQuery = true)
    boolean existsLichKhamTrung(
            @Param("bacSiId") Integer bacSiId,
            @Param("ngayKham") LocalDate ngayKham,
            @Param("start") LocalTime start,
            @Param("end") LocalTime end,
            @Param("excludeId") Integer excludeId
    );

    @Query("SELECT MONTH(l.ngayKham) as thang, COUNT(l) as soLuong FROM LichKham l GROUP BY MONTH(l.ngayKham)")
    List<Object[]> thongKeTheoThang();

    @Query("SELECT l.bacSi.bacSiId as bacSiId, COUNT(l) as soLuong FROM LichKham l GROUP BY l.bacSi.bacSiId")
    List<Object[]> thongKeTheoBacSi();

    @Query("SELECT MONTH(l.ngayKham), COUNT(l) FROM LichKham l " +
            "WHERE MONTH(l.ngayKham) = :month AND YEAR(l.ngayKham) = :year GROUP BY MONTH(l.ngayKham)")
    List<Object[]> thongKeTheoThang(@Param("month") int month, @Param("year") int year);

    @Query("SELECT COUNT(l) FROM LichKham l " +
            "WHERE l.bacSi.bacSiId = :bacSiId AND l.ngayKham = :ngayKham AND l.caKham = :caKham")
    int countLichKhamByBacSiAndNgayAndCa(@Param("bacSiId") Long bacSiId,
                                         @Param("ngayKham") LocalDate ngayKham,
                                         @Param("caKham") String caKham);
}