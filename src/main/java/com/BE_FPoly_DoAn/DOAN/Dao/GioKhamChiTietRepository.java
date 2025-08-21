package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface GioKhamChiTietRepository extends JpaRepository<GioKhamChiTiet, Integer> {

    List<GioKhamChiTiet> findByLichLamViecBacSi_LichlvId(Integer lichlvId);

    List<GioKhamChiTiet> findByLichLamViecBacSiAndTrangThaiTrue(LichLamViecBacSi lichLamViecBacSi);

    List<GioKhamChiTiet> findByLichLamViecBacSi_BacSi_BacSiIdAndLichLamViecBacSi_NgayAndLichLamViecBacSi_CaTruc(
            Integer bacSiId, LocalDate ngayKham, String caTruc);

    List<GioKhamChiTiet> findByLichLamViecBacSi(LichLamViecBacSi lich);
}