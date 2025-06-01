package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "VAI_TRO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaiTro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vaitro_id", columnDefinition = "INT")
    private Integer vaitro_id;

    @Column(name = "ten_vai_tro", nullable = false, length = 50, columnDefinition = "NVARCHAR(50)")
    private String ten_vai_tro;

    @Column(name = "mo_ta", length = 250, columnDefinition = "NVARCHAR(250)")
    private String mo_ta;

    @OneToMany(mappedBy = "vaiTro", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<PhanQuyen> phanQuyens;
}