package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "CHI_TIET_HOA_DON")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietHoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cthoadon_id", columnDefinition = "INT")
    private Integer cthoadon_id;

    @ManyToOne
    @JoinColumn(name = "hoadon_id", referencedColumnName = "hoadon_id", nullable = false, columnDefinition = "INT")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "dichvu_id", referencedColumnName = "dichvu_id", nullable = false, columnDefinition = "INT")
    private DichVu dichVu;

    @Column(name = "so_luong", columnDefinition = "INT")
    private Integer so_luong;

    @Column(name = "don_gia", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    private BigDecimal don_gia;

    @Column(name = "tong_gia", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    private BigDecimal tong_gia;
}