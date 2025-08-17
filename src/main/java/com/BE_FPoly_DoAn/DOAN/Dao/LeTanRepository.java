package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.LeTan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LeTanRepository extends JpaRepository<LeTan, Integer> {
    Optional<LeTan> findByNguoiDung_NguoiDungId(Integer nguoiDungId);

}