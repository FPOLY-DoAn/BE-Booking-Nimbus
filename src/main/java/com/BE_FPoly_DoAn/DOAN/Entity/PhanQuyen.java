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
    private Integer phanquyen_id;

    @ManyToOne
    @JoinColumn(name = "vaitro_id")
    private VaiTro vaiTro;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id")
    private NguoiDung nguoiDung;
}