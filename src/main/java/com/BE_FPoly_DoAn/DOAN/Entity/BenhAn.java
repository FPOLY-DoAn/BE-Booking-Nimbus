package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "BENH_AN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BenhAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer benhan_id;

    @ManyToOne
    @JoinColumn(name = "lichkham_id", referencedColumnName = "lichkham_id")
    private LichKham lichKham;

    @ManyToOne
    @JoinColumn(name = "bacsi_ket_luan_id")
    private BacSi bacSiKetLuan;

    @Column(length = 100)
    private String tom_tat;

    @Column(length = 250)
    private String ket_luan;

    @Column(length = 250)
    private String ghi_chu;

    private LocalDateTime thoi_gian;

    @OneToMany(mappedBy = "benhAn",cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoSoBenhAn> hoSoBenhAns;

    @OneToMany(mappedBy = "benhAn",cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichSuDieuTri> lichSuDieuTris;
}