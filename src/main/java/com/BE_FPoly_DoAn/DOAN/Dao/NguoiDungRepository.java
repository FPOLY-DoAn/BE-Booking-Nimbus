package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
    Optional<NguoiDung> findByEmail(String email);
    Optional<NguoiDung> findByHoTen(String hoTen);
    Optional<NguoiDung>  findBySoDienThoai(String soDienThoai);
    boolean existsByEmail(String email);
    boolean existsBySoDienThoai(String soDienThoai);
}