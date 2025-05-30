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
    private Integer phongkham_id;

    @Column(length = 4)
    private String so_phong;

    @Column(length = 1)
    private String loai_phong;

    @Column(length = 250)
    private String mo_ta;

    @OneToMany(mappedBy = "phongKham", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichPhongKham> lichPhongKhams;
}