package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.Doctor.CertificateRequestDto;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.Doctor.CertificateUpdateRequestServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/certificate-requests")
public class CertificateApprovalController {

    private final CertificateUpdateRequestServiceImpl service;

    public CertificateApprovalController(CertificateUpdateRequestServiceImpl service) {
        this.service = service;
    }

    @PutMapping("/{id}/approve")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> approve(@PathVariable Integer id) {
        boolean result = service.approveRequest(id);

        if (result) {
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.CERTIFICATE_APPROVED));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(ServiceResponse.error(NotificationCode.CERTIFICATE_APPROVE_FAIL));
        }
    }

    @PutMapping("/{id}/reject")
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
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(ServiceResponse.error(NotificationCode.CERTIFICATE_REJECT_FAIL));
        }
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_BACSI')")
    public ResponseEntity<?> submitRequest(@RequestBody @Valid CertificateRequestDto dto) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        boolean success = service.submitRequest(email, dto.getNewCertificate(), dto.getReason());

        if (success) {
            return ResponseEntity.ok(ServiceResponse.success(NotificationCode.CERTIFICATE_REQUEST_SUBMITTED));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(ServiceResponse.error(NotificationCode.CERTIFICATE_REQUEST_FAIL));
        }
    }

    @GetMapping("/pending")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> getPendingRequests() {
        return ResponseEntity.ok(
                ServiceResponse.success(NotificationCode.WAITING_LIST, service.getPendingRequests())
        );
    }
}