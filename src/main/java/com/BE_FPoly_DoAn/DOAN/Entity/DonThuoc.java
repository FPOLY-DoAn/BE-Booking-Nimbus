package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "DON_THUOC")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer donthuoc_id;

    @ManyToOne
    @JoinColumn(name = "ppdieutri_id")
    private PhuongPhapDieuTri phuongPhapDieuTri;

    @Column(length = 1)
    private String ngay_phat_hanh;
}