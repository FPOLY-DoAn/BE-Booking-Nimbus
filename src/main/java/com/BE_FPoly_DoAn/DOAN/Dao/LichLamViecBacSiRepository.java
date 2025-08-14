package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface LichLamViecBacSiRepository extends JpaRepository<LichLamViecBacSi, Integer> {
    List<LichLamViecBacSi> findByBacSi_BacSiId(Integer bacSiId);
    List<LichLamViecBacSi> findByBacSi_BacSiIdAndNgay(Integer bacSiId, LocalDate ngay);

    List<LichLamViecBacSi> findByBacSiAndNgayBetween(BacSi bacSi, @NotNull(message = "Ngày bắt đầu không được để trống") @FutureOrPresent(message = "Ngày bắt đầu phải là hiện tại hoặc tương lai") LocalDate ngayBatDau, @NotNull(message = "Ngày kết thúc không được để trống") @FutureOrPresent(message = "Ngày kết thúc phải là hiện tại hoặc tương lai") LocalDate ngayKetThuc);

    boolean existsByBacSi_BacSiIdAndNgayAndCaTruc(Integer bacSiId, LocalDate ngay, String caTruc);

    List<LichLamViecBacSi> findByBacSiIn(List<BacSi> bacSiList);

    List<LichLamViecBacSi> findByBacSiInAndNgayAndCaTruc(List<BacSi> bacSiList, LocalDate ngay, String caTruc);

    List<LichLamViecBacSi> findByNgay(LocalDate ngay);
}