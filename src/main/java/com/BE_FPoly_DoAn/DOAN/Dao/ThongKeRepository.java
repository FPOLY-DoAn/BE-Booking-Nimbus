package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ThongKeRepository extends JpaRepository<LichKham, Integer>, JpaSpecificationExecutor<LichKham> {

    @Query("""
        SELECT nd.gioiTinh, COUNT(bn)
        FROM BenhNhan bn
        JOIN NguoiDung nd ON bn.nguoiDung.nguoiDungId = nd.nguoiDungId
        GROUP BY nd.gioiTinh
    """)
    List<Object[]> thongKeBenhNhanTheoGioiTinh();

    @Query("""
        SELECT MONTH(lk.thoiGianHen), YEAR(lk.thoiGianHen), COUNT(lk)
        FROM LichKham lk
        GROUP BY YEAR(lk.thoiGianHen), MONTH(lk.thoiGianHen)
        ORDER BY YEAR(lk.thoiGianHen), MONTH(lk.thoiGianHen)
    """)
    List<Object[]> thongKeLuotKhamTheoThang();

    @Query("""
        SELECT bs.bacSiId, nd.hoTen, COUNT(lk)
        FROM LichKham lk
        JOIN BacSi bs ON lk.bacSi.bacSiId = bs.bacSiId
        JOIN NguoiDung nd ON bs.nguoiDung.nguoiDungId = nd.nguoiDungId
        GROUP BY bs.bacSiId, nd.hoTen
        ORDER BY COUNT(lk) DESC
    """)
    List<Object[]> thongKeLuotKhamTheoBacSi();

    @Query("""
        SELECT YEAR(hd.ngayTao), MONTH(hd.ngayTao), SUM(hd.tongTienThanhToan)
        FROM HoaDon hd
        GROUP BY YEAR(hd.ngayTao), MONTH(hd.ngayTao)
        ORDER BY YEAR(hd.ngayTao), MONTH(hd.ngayTao)
    """)
    List<Object[]> thongKeDoanhThuTheoThang();

    @Query("""
        SELECT YEAR(dt.ngayPhatHanh), MONTH(dt.ngayPhatHanh), COUNT(dt)
        FROM DonThuoc dt
        GROUP BY YEAR(dt.ngayPhatHanh), MONTH(dt.ngayPhatHanh)
        ORDER BY YEAR(dt.ngayPhatHanh), MONTH(dt.ngayPhatHanh)
    """)
    List<Object[]> thongKeDonThuocTheoThang();

    @Query("""
        SELECT b.tenBenh, COUNT(h)
        FROM HoSoBenhAn h
        JOIN Benh b ON h.benh.benhId = b.benhId
        GROUP BY b.tenBenh
        ORDER BY COUNT(h) DESC
    """)
    List<Object[]> thongKeSoLuongBenhTheoTen();

    @Query("""
        SELECT dv.tenDichVu, SUM(ct.soLuong), SUM(ct.tongGia)
        FROM ChiTietHoaDon ct
        JOIN DichVu dv ON ct.dichVu.dichVuId = dv.dichVuId
        GROUP BY dv.tenDichVu
        ORDER BY SUM(ct.tongGia) DESC
    """)
    List<Object[]> thongKeHoaDonTheoDichVu();
}