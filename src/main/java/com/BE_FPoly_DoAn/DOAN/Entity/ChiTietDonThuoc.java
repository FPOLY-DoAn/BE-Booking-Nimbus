package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CHI_TIET_DON_THUOC")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietDonThuoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ctdonthuoc_id", columnDefinition = "INT")
    private Integer ctDonThuocId;

    @ManyToOne
    @JoinColumn(name = "donthuoc_id", referencedColumnName = "donthuoc_id", nullable = false, columnDefinition = "INT")
    private DonThuoc donThuoc;

    @Column(name = "ten_thuoc", length = 50, columnDefinition = "NVARCHAR(50)")
    private String tenThuoc;

    @Column(name = "lieu_dung", columnDefinition = "INT")
    private Integer lieuDung;

    @Column(name = "tinh_thuong_xuyen", columnDefinition = "INT")
    private Integer tinhThuongXuyen;

    @Column(name = "khoan_thoi_gian", columnDefinition = "INT")
    private Integer khoanThoiGian;
}