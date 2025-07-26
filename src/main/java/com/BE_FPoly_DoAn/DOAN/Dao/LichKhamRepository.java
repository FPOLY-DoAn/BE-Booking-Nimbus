package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Repository quản lý các thao tác với bảng LichKham trong CSDL.
 * Bao gồm các truy vấn tùy chỉnh phục vụ kiểm tra trùng lịch, thống kê lịch khám,...
 */
public interface LichKhamRepository extends JpaRepository<LichKham, Integer>, JpaSpecificationExecutor<LichKham> {

    /**
     * Kiểm tra lịch khám có bị trùng hay không (dựa theo bác sĩ, ngày khám và khoảng thời gian).
     * Sử dụng để kiểm tra khi tạo mới hoặc cập nhật lịch khám, có thể bỏ qua lịch hiện tại khi cập nhật.
     *
     * @param bacSiId    ID bác sĩ
     * @param ngayKham   Ngày khám
     * @param start      Thời gian bắt đầu hẹn mới
     * @param end        Thời gian kết thúc hẹn mới
     * @param excludeId  ID lịch khám muốn loại trừ (dùng khi update, truyền null khi create)
     * @return true nếu có lịch trùng; false nếu không
     */
    @Query("""
        SELECT CASE WHEN COUNT(lk) > 0 THEN true ELSE false END
        FROM LichKham lk
        WHERE lk.bacSi.id = :bacSiId
          AND lk.ngayKham = :ngayKham
          AND (:excludeId IS NULL OR lk.id != :excludeId)
          AND (:start < lk.thoiGianDen AND :end > lk.thoiGianHen)
    """)
    boolean existsLichKhamTrung(
            @Param("bacSiId") Integer bacSiId,
            @Param("ngayKham") LocalDate ngayKham,
            @Param("start") LocalDateTime start,
            @Param("end") LocalDateTime end,
            @Param("excludeId") Integer excludeId
    );

    /**
     * Thống kê số lượng lịch khám theo tháng (tổng hợp toàn bộ các năm).
     *
     * @return Danh sách gồm tháng và số lượng lịch khám tương ứng.
     */
    @Query("SELECT MONTH(l.ngayKham) as thang, COUNT(l) as soLuong FROM LichKham l GROUP BY MONTH(l.ngayKham)")
    List<Object[]> thongKeTheoThang();

    /**
     * Thống kê số lượng lịch khám theo bác sĩ.
     *
     * @return Danh sách gồm ID bác sĩ và số lượng lịch khám tương ứng.
     */
    @Query("SELECT l.bacSi.bacSiId as bacSiId, COUNT(l) as soLuong FROM LichKham l GROUP BY l.bacSi.bacSiId")
    List<Object[]> thongKeTheoBacSi();

    /**
     * Thống kê số lượng lịch khám trong một tháng cụ thể và một năm cụ thể.
     *
     * @param month Tháng cần thống kê
     * @param year  Năm cần thống kê
     * @return Danh sách chứa tháng và số lượng lịch khám (chỉ có 1 dòng nếu có dữ liệu)
     */
    @Query("SELECT MONTH(l.ngayKham), COUNT(l) FROM LichKham l " +
            "WHERE MONTH(l.ngayKham) = :month AND YEAR(l.ngayKham) = :year GROUP BY MONTH(l.ngayKham)")
    List<Object[]> thongKeTheoThang(@Param("month") int month, @Param("year") int year);

    /**
     * Đếm số lịch khám đã đặt trong 1 ca khám của bác sĩ trong 1 ngày.
     * Dùng để kiểm tra giới hạn số lượng lịch trong 1 ca (ví dụ: giới hạn 5 lịch mỗi ca).
     *
     * @param bacSiId  ID bác sĩ
     * @param ngayKham Ngày khám
     * @param caKham   Ca khám (SANG/CHIEU)
     * @return Số lượng lịch khám đã được đặt
     */
    @Query("SELECT COUNT(l) FROM LichKham l " +
            "WHERE l.bacSi.bacSiId = :bacSiId AND l.ngayKham = :ngayKham AND l.caKham = :caKham")
    int countLichKhamByBacSiAndNgayAndCa(@Param("bacSiId") Long bacSiId,
                                         @Param("ngayKham") LocalDate ngayKham,
                                         @Param("caKham") String caKham);
}