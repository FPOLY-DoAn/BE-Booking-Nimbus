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
    @Column(name = "lichkham_id", columnDefinition = "INT")
    private Integer lichkham_id;

    @ManyToOne
    @JoinColumn(name = "bacsi_id", referencedColumnName = "bacsi_id", columnDefinition = "INT")
    private BacSi bacSi;

    @ManyToOne
    @JoinColumn(name = "benhnhan_id", referencedColumnName = "benhnhan_id", columnDefinition = "INT")
    private BenhNhan benhNhan;

    @Column(name = "thoi_gian_hen", columnDefinition = "DATETIME")
    private LocalDateTime thoi_gian_hen;

    @Column(name = "thoi_gian_den", columnDefinition = "DATETIME")
    private LocalDateTime thoi_gian_den;

    @Column(name = "kieu_lich_kham", length = 1, columnDefinition = "CHAR(1)")
    private char kieu_lich_kham; // H, T, D

    @Column(name = "trang_thai", length = 1, columnDefinition = "CHAR(1)")
    private char trang_thai;

    @Column(name = "ghi_chu", length = 250, columnDefinition = "NVARCHAR(250)")
    private String ghi_chu;

    @Column(name = "ngay_tao", columnDefinition = "DATETIME")
    private LocalDateTime ngay_tao;

    @Column(name = "ngay_cap_nhat", columnDefinition = "DATETIME")
    private LocalDateTime ngay_cap_nhat;

    @OneToOne(mappedBy = "lichKham", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private BenhAn benhAn;
}