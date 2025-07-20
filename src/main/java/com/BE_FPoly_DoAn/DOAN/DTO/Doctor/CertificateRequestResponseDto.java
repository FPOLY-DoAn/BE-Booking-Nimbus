package com.BE_FPoly_DoAn.DOAN.DTO.Doctor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class CertificateRequestResponseDto {
    private Integer id;
    private String doctorName;
    private String doctorEmail;
    private String newCertificate;
    private String reason;
    private LocalDateTime requestedAt;
}
