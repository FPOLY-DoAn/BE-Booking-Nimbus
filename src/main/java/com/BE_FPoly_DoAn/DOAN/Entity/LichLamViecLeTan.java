package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "LICH_LAM_VIEC_LE_TAN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichLamViecLeTan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lichlt_id")
    private Integer lichLamViecId;

    @ManyToOne
    @JoinColumn(name = "letan_id", referencedColumnName = "letan_id")
    private LeTan leTan;

    @Column(name = "ngay", nullable = false)
    @NotNull(message = "Ngày làm việc không được để trống")
    private LocalDate ngay;

    @Column(name = "ca_lam", columnDefinition = "NVARCHAR(50)")
    @Pattern(regexp = "[SCT]", message = "Ca làm phải là SANG (Sáng), CHIEU (Chiều)")
    private String caLam;

    @Column(name = "ghi_chu", length = 225, columnDefinition = "NVARCHAR(225)")
    private String ghiChu;
}