package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DuyetChungChiDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.YeuCauChungChiDTO;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Dao.DuyetChungChiRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/certificate-requests")
public class DuyetChungChiController {

    private final DuyetChungChiRepository service;

    public DuyetChungChiController(DuyetChungChiRepository service) {
        this.service = service;
    }

    @PostMapping("/NopYeuCauChungChi")
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public ResponseEntity<?> submitRequest(@RequestBody @Valid YeuCauChungChiDTO dto) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        boolean success = service.submitRequest(email, dto.getNewCertificate(), dto.getReason());

        if (success) {
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.CERTIFICATE_REQUEST_SUBMITTED));
        } else {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.CERTIFICATE_REQUEST_DUPLICATE));
        }
    }

    @PutMapping("/DuyetYeuCauChungChi/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> approve(@PathVariable Integer id) {
        boolean result = service.approveRequest(id);

        if (result) {
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.CERTIFICATE_APPROVED));
        } else {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.CERTIFICATE_REQUEST_NOT_FOUND_OR_PROCESSED));
        }
    }

    @PutMapping("/TuChoiYeuCauChungChi/{id}")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> reject(@PathVariable Integer id, @RequestBody Map<String, String> body) {
        String reason = body.get("reason");
        if (reason == null || reason.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(ServiceResponse.error(NotificationCode.VALIDATION_KHANCAP_REQUIRED));
        }

        boolean result = service.rejectRequest(id, reason);

        if (result) {
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.CERTIFICATE_REJECTED));
        } else {
            return ResponseEntity.ok(ServiceResponse.error(NotificationCode.CERTIFICATE_REQUEST_NOT_FOUND_OR_PROCESSED));
        }
    }

    @GetMapping("/LayDanhSachYeuCauChoDuyet")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> getPendingRequests() {
        List<DuyetChungChiDTO> pendingRequests = service.getPendingRequests();

        if (pendingRequests == null || pendingRequests.isEmpty()) {
            return ResponseEntity.ok(
                    ServiceResponse.success(NotificationCode.NO_PENDING_REQUESTS, List.of())
            );
        }

        return ResponseEntity.ok(
                ServiceResponse.success(NotificationCode.WAITING_LIST, pendingRequests)
        );
    }
}