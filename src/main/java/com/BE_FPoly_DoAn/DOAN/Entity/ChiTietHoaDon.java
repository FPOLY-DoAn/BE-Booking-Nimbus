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
    private Integer cthoadon_id;

    @ManyToOne
    @JoinColumn(name = "hoadon_id")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "dichvu_id")
    private DichVu dichVu;

    private Integer so_luong;

    private BigDecimal don_gia;

    private BigDecimal tong_gia;
}