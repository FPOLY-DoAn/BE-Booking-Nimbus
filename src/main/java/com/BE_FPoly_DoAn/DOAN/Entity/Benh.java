package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "BENH")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Benh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benh_id", columnDefinition = "INT")
    private Integer benhId;

    @Column(name = "ten_benh", length = 50, columnDefinition = "NVARCHAR(50)")
    private String tenBenh;

    @Column(name = "trieu_chung", length = 100, columnDefinition = "NVARCHAR(100)")
    private String trieuChung;

    @Column(name = "nguyen_nhan", length = 100, columnDefinition = "NVARCHAR(100)")
    private String nguyenNhan;

    @Column(name = "phong_ngua", length = 100, columnDefinition = "NVARCHAR(100)")
    private String phongNgua;

    @Column(name = "huong_dieu_tri", length = 100, columnDefinition = "NVARCHAR(100)")
    private String huongDieuTri;

    @Column(name = "ghi_chu", length = 100, columnDefinition = "NVARCHAR(100)")
    private String ghiChu;

    @OneToMany(mappedBy = "benh", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoSoBenhAn> hoSoBenhAns;
}