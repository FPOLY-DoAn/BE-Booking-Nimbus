package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "LICH_KHAM")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LichKham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lichkham_id;

    @ManyToOne
    @JoinColumn(name = "bacsi_id")
    private BacSi bacSi;

    @ManyToOne
    @JoinColumn(name = "benhnhan_id")
    private BenhNhan benhNhan;

    @Temporal(TemporalType.DATE)
    private Date ngay_hen;

    @Temporal(TemporalType.TIMESTAMP)
    private Date thoi_gian_hen;

    @Column(length = 1)
    private String trang_thai;
}