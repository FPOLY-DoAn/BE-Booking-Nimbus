package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "PHONG_KHAM")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhongKham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phongkham_id", columnDefinition = "INT")
    private Integer phongKhamId;

    @Column(name = "so_phong", length = 4, columnDefinition = "NVARCHAR(4)")
    private String soPhong;

    @Column(name = "loai_phong", length = 1, columnDefinition = "CHAR(1)")
    private String loaiPhong;

    @Column(name = "mo_ta", length = 250, columnDefinition = "NVARCHAR(250)")
    private String moTa;

    @OneToMany(mappedBy = "phongKham", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichPhongKham> lichPhongKhams;
}