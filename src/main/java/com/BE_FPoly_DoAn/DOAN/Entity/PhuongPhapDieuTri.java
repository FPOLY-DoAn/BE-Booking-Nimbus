package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "PHUONG_PHAP_DIEU_TRI")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhuongPhapDieuTri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ppdieutri_id", columnDefinition = "INT")
    private Integer ppdieutriId;

    @ManyToOne
    @JoinColumn(name = "lsdieutri_id", referencedColumnName = "lsdieutri_id", nullable = false)
    @NotNull(message = "Lịch sử điều trị không được để trống")
    private LichSuDieuTri lichSuDieuTri;

    @Column(name = "ten_phuong_phap", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotBlank(message = "Tên phương pháp không được để trống")
    @Size(max = 100, message = "Tên phương pháp không được vượt quá 100 ký tự")
    private String tenPhuongPhap;

    @Column(name = "hieu_qua", length = 1, columnDefinition = "CHAR(1)")
    @NotBlank(message = "Hiệu quả không được để trống")
    @Size(min = 1, max = 1, message = "Hiệu quả chỉ được 1 ký tự")
    private String hieuQua;

    @OneToMany(mappedBy = "phuongPhapDieuTri", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<DonThuoc> donThuocs;
}