package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "THANH_TOAN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer thanhtoan_id;

    @ManyToOne
    @JoinColumn(name = "hoadon_id")
    private HoaDon hoaDon;

    @Temporal(TemporalType.DATE)
    private Date ngay_thanh_toan;

    private Double so_tien_thanh_toan;

    @Column(length = 1)
    private String phuong_thuc_thanh_toan;

    @Column(length = 1)
    private String trang_thai;
}