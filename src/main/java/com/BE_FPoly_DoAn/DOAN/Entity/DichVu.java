package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DICH_VU")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dichvu_id;

    @ManyToOne
    @JoinColumn(name = "benhan_id")
    private BenhAn benhAn;

    @Column(length = 100)
    private String ten_dich_vu;

    @Column(length = 250)
    private String mo_ta;

    private Double gia;
}