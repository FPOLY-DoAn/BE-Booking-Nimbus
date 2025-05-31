package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LICH_PHONG_KHAM")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LichPhongKham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lichphongkham_id", columnDefinition = "INT")
    private Integer lichPhongKhamId;

    @ManyToOne
    @JoinColumn(name = "lichlv_id", referencedColumnName = "lichlv_id", columnDefinition = "INT")
    private LichLamViecBacSi lichLamViecBacSi;

    @ManyToOne
    @JoinColumn(name = "phongkham_id", referencedColumnName = "phongkham_id", columnDefinition = "INT")
    private PhongKham phongKham;
}