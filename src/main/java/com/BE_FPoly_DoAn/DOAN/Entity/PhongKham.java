package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;

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
}