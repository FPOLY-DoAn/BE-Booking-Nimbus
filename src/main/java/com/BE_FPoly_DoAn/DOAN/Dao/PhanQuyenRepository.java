package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

 public interface PhanQuyenRepository extends JpaRepository<PhanQuyen, Integer> {
    public List<PhanQuyen> findByNguoiDung(NguoiDung nguoiDung);
}