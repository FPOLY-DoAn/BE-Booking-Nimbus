package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BENH")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Benh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer benh_id;

    @Column(length = 50)
    private String ten_benh;

    @Column(length = 100)
    private String ghi_chu;
}