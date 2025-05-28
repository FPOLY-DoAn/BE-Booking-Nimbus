package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "VAI_TRO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaiTro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vaitro_id;

    @Column(nullable = false, length = 50)
    private String ten_vai_tro;

    @Column(length = 250)
    private String mo_ta;
}