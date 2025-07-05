package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.CertificateUpdateRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CertificateUpdateRequestRepository extends JpaRepository<CertificateUpdateRequest, Integer> {
    List<CertificateUpdateRequest> findByStatus(CertificateUpdateRequest.Status status);
    List<CertificateUpdateRequest> findByBacSi_BacSiId(Integer bacSiId);
}