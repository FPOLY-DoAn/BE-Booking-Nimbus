package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "LICH_PHONG_KHAM")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LichPhongKham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lichphongkham_id;

    @ManyToOne
    @JoinColumn(name = "lichlv_id")
    private LichLamViecBacSi lichLamViecBacSi;

    @ManyToOne
    @JoinColumn(name = "phongkham_id")
    private PhongKham phongKham;
}