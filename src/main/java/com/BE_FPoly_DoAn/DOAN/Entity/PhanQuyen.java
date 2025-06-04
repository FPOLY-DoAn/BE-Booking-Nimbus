package com.BE_FPoly_DoAn.DOAN.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PHAN_QUYEN")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class PhanQuyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phanquyen_id", columnDefinition = "INT")
    private Integer phanQuyenId;

    @ManyToOne
    @JoinColumn(name = "vaitro_id", referencedColumnName = "vaitro_id", nullable = false)
    @JsonIgnore
    @ToString.Exclude
    private VaiTro vaiTro;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", nullable = false)
    @JsonIgnore
    @ToString.Exclude
    private NguoiDung nguoiDung;
}