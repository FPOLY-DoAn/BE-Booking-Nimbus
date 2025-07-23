package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "certificate_update_request")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DuyetChungChi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "new_certificate", length = 255, columnDefinition = "NVARCHAR(255)")
    private String newCertificate;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDING;

    @Column(length = 200, columnDefinition = "NVARCHAR(200)")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private BacSi bacSi;

    private LocalDateTime requestedAt;
    private LocalDateTime approvedAt;

    public enum Status {
        PENDING, APPROVED, REJECTED
    }
}