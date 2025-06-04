package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    private String tenBenh;

    @Column(name = "trieu_chung", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotBlank
    private String trieuChung;

    @Column(name = "nguyen_nhan", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotBlank
    private String nguyenNhan;

    @Column(name = "phong_ngua", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotNull
    private String phongNgua;

    @Column(name = "huong_dieu_tri", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotNull
    private String huongDieuTri;

    @Column(name = "ghi_chu", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotNull
    private String ghiChu;

    @OneToMany(mappedBy = "benh", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoSoBenhAn> hoSoBenhAns;
}