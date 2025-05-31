package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "HO_SO_BENH_AN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoSoBenhAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hoso_id", columnDefinition = "INT")
    private Integer hoSoId;

    @ManyToOne
    @JoinColumn(name = "benhan_id", referencedColumnName = "benhan_id", columnDefinition = "INT")
    private BenhAn benhAn;

    @ManyToOne
    @JoinColumn(name = "benh_id", referencedColumnName = "benh_id", columnDefinition = "INT")
    private Benh benh;
}