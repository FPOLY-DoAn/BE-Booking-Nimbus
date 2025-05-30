package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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

    private LocalDateTime thoi_gian_hen;

    private LocalDateTime thoi_gian_den;

    @Column(length = 1)
    private String kieu_lich_kham; // H, T, D

    @Column(length = 1)
    private String trang_thai;

    @Column(length = 250)
    private String ghi_chu;

    private LocalDateTime ngay_tao;

    private LocalDateTime ngay_cap_nhat;

    @OneToOne(mappedBy = "lichKham",cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private BenhAn benhAn;
}