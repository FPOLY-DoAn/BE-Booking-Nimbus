package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "LICH_LAM_VIEC_BAC_SI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LichLamViecBacSi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lichlv_id;

    @ManyToOne
    @JoinColumn(name = "bacsi_id")
    private BacSi bacSi;

    private LocalDate ngay;

    private LocalDate ngay_tao;

    private LocalDate ngay_cap_nhat;
}