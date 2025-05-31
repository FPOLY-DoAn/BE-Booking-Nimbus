package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PHAN_QUYEN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhanQuyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phanquyen_id", columnDefinition = "INT")
    private Integer phanquyen_id;

    @ManyToOne
    @JoinColumn(name = "vaitro_id", referencedColumnName = "vaitro_id", nullable = false)
    private VaiTro vaiTro;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", nullable = false)
    private NguoiDung nguoiDung;
}