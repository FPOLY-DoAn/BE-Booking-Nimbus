package com.BE_FPoly_DoAn.DOAN.DTO.BacSi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class DuyetChungChiDTO {
    private Integer id;
    private String doctorName;
    private String doctorEmail;
    private String newCertificate;
    private String reason;
    private LocalDateTime requestedAt;
}
