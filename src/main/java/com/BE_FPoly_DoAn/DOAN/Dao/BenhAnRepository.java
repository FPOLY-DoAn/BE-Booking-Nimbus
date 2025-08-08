package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.BenhAn;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BenhAnRepository extends JpaRepository<BenhAn, Integer> {
    Optional<BenhAn> findByLichKham_LichkhamId(Integer lichkhamId);

    List<BenhAn> findByLichKham_BenhNhan_BenhNhanId(Integer benhNhanId);
}