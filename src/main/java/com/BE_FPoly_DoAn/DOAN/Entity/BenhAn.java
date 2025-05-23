package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BENH_AN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BenhAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer benhan_id;

    @ManyToOne
    @JoinColumn(name = "lichkham_id")
    private LichKham lichKham;

    @Column(length = 100)
    private String tom_tat;

    @Column(length = 250)
    private String ghi_chu;
}