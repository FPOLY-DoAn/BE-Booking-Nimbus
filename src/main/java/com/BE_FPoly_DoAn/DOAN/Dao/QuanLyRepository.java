package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.QuanLy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuanLyRepository extends JpaRepository<QuanLy, Integer> {
    Optional<QuanLy> findByNguoiDung_NguoiDungId(Integer nguoiDungId);

}