package com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DuyetChungChiDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.BacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.DuyetChungChi;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class DuyetChungChiRepository implements com.BE_FPoly_DoAn.DOAN.Dao.DuyetChungChiRepository {

    private final com.BE_FPoly_DoAn.DOAN.Dao.YeuCauChungChiRepository requestRepo;
    private final BacSiRepository bacSiRepo;

    public DuyetChungChiRepository(com.BE_FPoly_DoAn.DOAN.Dao.YeuCauChungChiRepository requestRepo,
                                   BacSiRepository bacSiRepo) {
        this.requestRepo = requestRepo;
        this.bacSiRepo = bacSiRepo;
    }

    @Override
    public boolean approveRequest(Integer requestId) {
        Optional<DuyetChungChi> opt = requestRepo.findById(requestId);
        if (opt.isEmpty()) return false;

        DuyetChungChi req = opt.get();
        if (req.getStatus() != DuyetChungChi.Status.PENDING) return false;

        BacSi doctor = req.getBacSi();
        doctor.setChungChi(req.getNewCertificate());

        req.setStatus(DuyetChungChi.Status.APPROVED);
        req.setApprovedAt(LocalDateTime.now());

        bacSiRepo.save(doctor);
        requestRepo.save(req);
        return true;
    }

    @Override
    public boolean rejectRequest(Integer requestId, String reason) {
        Optional<DuyetChungChi> opt = requestRepo.findById(requestId);
        if (opt.isEmpty()) return false;

        DuyetChungChi req = opt.get();
        if (req.getStatus() != DuyetChungChi.Status.PENDING) return false;

        req.setStatus(DuyetChungChi.Status.REJECTED);
        req.setReason(reason);
        requestRepo.save(req);
        return true;
    }

    @Override
    public boolean submitRequest(String email, String newCertificate, String reason) {
        Optional<BacSi> doctor = bacSiRepo.findByNguoiDung_Email(email);
        if (doctor.isEmpty()) return false;

        DuyetChungChi request = new DuyetChungChi();
        request.setBacSi(doctor.get());
        request.setNewCertificate(newCertificate);
        request.setReason(reason);
        request.setStatus(DuyetChungChi.Status.PENDING);
        request.setRequestedAt(LocalDateTime.now());

        requestRepo.save(request);
        return true;
    }

    public List<DuyetChungChiDTO> getPendingRequests() {
        return requestRepo.findByStatus(DuyetChungChi.Status.PENDING)
                .stream()
                .map(req -> DuyetChungChiDTO.builder()
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