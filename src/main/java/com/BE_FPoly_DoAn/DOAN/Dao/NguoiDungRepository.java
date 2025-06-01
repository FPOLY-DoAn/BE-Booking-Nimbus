package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
    Optional<NguoiDung> findByHoten(String name);
}