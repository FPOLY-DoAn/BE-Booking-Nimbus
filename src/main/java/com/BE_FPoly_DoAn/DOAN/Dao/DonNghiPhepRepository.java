package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.DTO.ThongKeNgayNghiDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.DonNghiPhep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonNghiPhepRepository extends JpaRepository<DonNghiPhep, Integer> {
    List<DonNghiPhep> findByBacSi_BacSiId(Integer bacSiId);

    List<DonNghiPhep> findByTrangThai(DonNghiPhep.TrangThai trangThai);

    @Query("SELECT d FROM DonNghiPhep d WHERE d.bacSi.bacSiId = :bacSiId AND YEAR(d.ngayBatDau) = :nam")
    List<DonNghiPhep> findByBacSiAndNam(Integer bacSiId, int nam);

    @Query("""
    SELECT new com.BE_FPoly_DoAn.DOAN.DTO.ThongKeNgayNghiDTO(
        d.bacSi.bacSiId, COUNT(d)
    )
    FROM DonNghiPhep d
    WHERE YEAR(d.ngayBatDau) = :nam
    GROUP BY d.bacSi.bacSiId
""")
    List<ThongKeNgayNghiDTO> thongKeSoDonNghiTheoNam(int nam);
}