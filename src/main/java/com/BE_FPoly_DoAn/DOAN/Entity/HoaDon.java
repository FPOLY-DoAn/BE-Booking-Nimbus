package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "HOA_DON")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hoadon_id;

    @ManyToOne
    @JoinColumn(name = "benhnhan_id")
    private BenhNhan benhNhan;

    @Temporal(TemporalType.DATE)
    private Date ngay_tao;

    private Double tong_tien;
}