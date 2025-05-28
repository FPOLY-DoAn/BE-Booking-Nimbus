package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CHI_TIET_DON_THUOC")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietDonThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ctdonthuoc_id;

    @ManyToOne
    @JoinColumn(name = "donthuoc_id")
    private DonThuoc donThuoc;

    @Column(length = 50)
    private String ten_thuoc;

    private Integer lieu_dung;

    private Integer tinh_thuong_xuyen;

    private Integer khoan_thoi_gian;
}