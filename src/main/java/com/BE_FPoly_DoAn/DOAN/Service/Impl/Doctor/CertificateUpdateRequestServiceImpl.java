package com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.CertificateRequestResponseDto;
import com.BE_FPoly_DoAn.DOAN.Dao.BacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.CertificateUpdateRequestRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.CertificateUpdateRequest;
import com.BE_FPoly_DoAn.DOAN.Service.Doctor.CertificateUpdateRequestService;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CertificateUpdateRequestServiceImpl implements CertificateUpdateRequestService {

    private final CertificateUpdateRequestRepository requestRepo;
    private final BacSiRepository bacSiRepo;

    public CertificateUpdateRequestServiceImpl(CertificateUpdateRequestRepository requestRepo,
                                               BacSiRepository bacSiRepo) {
        this.requestRepo = requestRepo;
        this.bacSiRepo = bacSiRepo;
    }

    @Override
    public boolean approveRequest(Integer requestId) {
        Optional<CertificateUpdateRequest> opt = requestRepo.findById(requestId);
        if (opt.isEmpty()) return false;

        CertificateUpdateRequest req = opt.get();
        if (req.getStatus() != CertificateUpdateRequest.Status.PENDING) return false;

        BacSi doctor = req.getBacSi();
        doctor.setChungChi(req.getNewCertificate());

        req.setStatus(CertificateUpdateRequest.Status.APPROVED);
        req.setApprovedAt(LocalDateTime.now());

        bacSiRepo.save(doctor);
        requestRepo.save(req);
        return true;
    }

    @Override
    public boolean rejectRequest(Integer requestId, String reason) {
        Optional<CertificateUpdateRequest> opt = requestRepo.findById(requestId);
        if (opt.isEmpty()) return false;

        CertificateUpdateRequest req = opt.get();
        if (req.getStatus() != CertificateUpdateRequest.Status.PENDING) return false;

        req.setStatus(CertificateUpdateRequest.Status.REJECTED);
        req.setReason(reason);
        requestRepo.save(req);
        return true;
    }

    @Override
    public boolean submitRequest(String email, String newCertificate, String reason) {
        Optional<BacSi> doctor = bacSiRepo.findByNguoiDung_Email(email);
        if (doctor.isEmpty()) return false;

        CertificateUpdateRequest request = new CertificateUpdateRequest();
        request.setBacSi(doctor.get());
        request.setNewCertificate(newCertificate);
        request.setReason(reason);
        request.setStatus(CertificateUpdateRequest.Status.PENDING);
        request.setRequestedAt(LocalDateTime.now());

        requestRepo.save(request);
        return true;
    }

    public List<CertificateRequestResponseDto> getPendingRequests() {
        return requestRepo.findByStatus(CertificateUpdateRequest.Status.PENDING)
                .stream()
                .map(req -> CertificateRequestResponseDto.builder()
                        .id(req.getId())
                        .doctorName(req.getBacSi().getNguoiDung().getHoTen())
                        .doctorEmail(req.getBacSi().getNguoiDung().getEmail())
                        .newCertificate(req.getNewCertificate())
                        .reason(req.getReason())
                        .requestedAt(req.getRequestedAt())
                        .build())
                .collect(Collectors.toList());
    }
}