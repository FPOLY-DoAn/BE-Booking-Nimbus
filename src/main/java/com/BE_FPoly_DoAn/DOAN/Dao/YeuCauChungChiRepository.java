package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.DuyetChungChi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YeuCauChungChiRepository  extends JpaRepository<DuyetChungChi, Integer> {
    List<DuyetChungChi> findByStatus(DuyetChungChi.Status status);
    List<DuyetChungChi> findByBacSi_BacSiId(Integer bacSiId);
    boolean existsByBacSi_NguoiDung_EmailAndStatus(String email, DuyetChungChi.Status status);
}