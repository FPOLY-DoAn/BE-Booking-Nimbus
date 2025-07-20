package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BacSiRepository extends JpaRepository<BacSi, Integer> {

    Optional<BacSi> findByNguoiDung_Email(String email);
}