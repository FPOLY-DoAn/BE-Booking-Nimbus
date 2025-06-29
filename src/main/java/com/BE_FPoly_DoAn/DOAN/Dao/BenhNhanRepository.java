package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BenhNhanRepository extends JpaRepository<BenhNhan, Integer> {
    Optional<BenhNhan> getByNguoiDung(NguoiDung nguoiDung);
}