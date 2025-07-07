package com.BE_FPoly_DoAn.DOAN.Dao;

public interface DuyetChungChiRepository {
    boolean approveRequest(Integer requestId);
    boolean rejectRequest(Integer requestId, String reason);
    boolean submitRequest(String email, String newCertificate, String reason);
    Object getPendingRequests();

}