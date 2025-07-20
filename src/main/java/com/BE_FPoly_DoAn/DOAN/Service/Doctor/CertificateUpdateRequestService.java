package com.BE_FPoly_DoAn.DOAN.Service.Doctor;

public interface CertificateUpdateRequestService {
    boolean approveRequest(Integer requestId);
    boolean rejectRequest(Integer requestId, String reason);
    boolean submitRequest(String email, String newCertificate, String reason);
}