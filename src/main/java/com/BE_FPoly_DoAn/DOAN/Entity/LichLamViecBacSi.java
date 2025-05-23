package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    @Temporal(TemporalType.DATE)
    private Date ngay;

    @Temporal(TemporalType.DATE)
    private Date ngay_tao;

    @Temporal(TemporalType.DATE)
    private Date ngay_cap_nhat;
}