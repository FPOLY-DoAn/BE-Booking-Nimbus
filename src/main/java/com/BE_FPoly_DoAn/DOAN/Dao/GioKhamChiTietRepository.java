package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GioKhamChiTietRepository extends JpaRepository<GioKhamChiTiet, Integer> {
    List<GioKhamChiTiet> findByLichLamViecBacSi_LichlvId(Integer lichlvId);
}