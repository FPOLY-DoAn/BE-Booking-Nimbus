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
    private Integer benh_id;

    @Column(name = "ten_benh", length = 50, columnDefinition = "NVARCHAR(50)")
    private String ten_benh;

    @Column(name = "trieu_chung", length = 100, columnDefinition = "NVARCHAR(100)")
    private String trieu_chung;

    @Column(name = "nguyen_nhan", length = 100, columnDefinition = "NVARCHAR(100)")
    private String nguyen_nhan;

    @Column(name = "phong_ngua", length = 100, columnDefinition = "NVARCHAR(100)")
    private String phong_ngua;

    @Column(name = "huong_dieu_tri", length = 100, columnDefinition = "NVARCHAR(100)")
    private String huong_dieu_tri;

    @Column(name = "ghi_chu", length = 100, columnDefinition = "NVARCHAR(100)")
    private String ghi_chu;

    @OneToMany(mappedBy = "benh", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoSoBenhAn> hoSoBenhAns;
}