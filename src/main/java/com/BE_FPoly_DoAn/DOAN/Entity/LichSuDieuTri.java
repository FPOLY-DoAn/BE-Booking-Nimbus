package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "LICH_SU_DIEU_TRI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LichSuDieuTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lsdieutri_id;

    @ManyToOne
    @JoinColumn(name = "benhan_id")
    private BenhAn benhAn;

    @Temporal(TemporalType.DATE)
    private Date ngay_dieu_tri;

    @Column(length = 250)
    private String ghi_chu;
}