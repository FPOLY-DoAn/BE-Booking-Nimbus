package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;

import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BacSiRepository extends JpaRepository<BacSi, Integer> {

    Optional<BacSi> findByNguoiDung_Email(String email);

    @Query("SELECT b FROM BacSi b WHERE b.nguoiDung.nguoiDungId = :userId")
    Optional<BacSi> findByNguoiDungId(@Param("userId") Integer userId);

    List<BacSi> findByChuyenKhoa_TenKhoa(String tenKhoa);

    Optional<BacSi> findByNguoiDung_NguoiDungId(Integer nguoiDungId);
}