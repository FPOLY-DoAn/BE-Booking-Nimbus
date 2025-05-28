package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "HO_SO_BENH_AN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoSoBenhAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hoso_id;

    @ManyToOne
    @JoinColumn(name = "benhan_id")
    private BenhAn benhAn;

    @ManyToOne
    @JoinColumn(name = "benh_id")
    private Benh benh;
}