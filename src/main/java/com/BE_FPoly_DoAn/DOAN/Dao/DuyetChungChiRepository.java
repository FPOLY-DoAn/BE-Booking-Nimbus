package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DuyetChungChiDTO;
import java.util.List;

public interface DuyetChungChiRepository {
    boolean approveRequest(Integer requestId);
    boolean rejectRequest(Integer requestId, String reason);
    boolean submitRequest(String email, String newCertificate, String reason);
    List<DuyetChungChiDTO> getPendingRequests();
}