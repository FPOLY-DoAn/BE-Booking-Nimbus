package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "DICH_VU")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dichvu_id", columnDefinition = "INT")
    private Integer dichvu_id;

    @ManyToOne
    @JoinColumn(name = "benhan_id", referencedColumnName = "benhan_id", columnDefinition = "INT")
    private BenhAn benhAn;

    @Column(name = "ten_dich_vu", length = 100, columnDefinition = "NVARCHAR(100)")
    private String ten_dich_vu;

    @Column(name = "mo_ta", length = 250, columnDefinition = "NVARCHAR(250)")
    private String mo_ta;

    @Column(name = "gia", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    private BigDecimal gia;

    @OneToMany(mappedBy = "dichVu", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ChiTietHoaDon> chiTietHoaDons;
}