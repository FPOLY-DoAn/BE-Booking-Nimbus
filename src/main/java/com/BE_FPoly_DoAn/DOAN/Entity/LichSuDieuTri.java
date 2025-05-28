package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

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

    private LocalDate ngay_dieu_tri;

    @Column(length = 250)
    private String ghi_chu;
}