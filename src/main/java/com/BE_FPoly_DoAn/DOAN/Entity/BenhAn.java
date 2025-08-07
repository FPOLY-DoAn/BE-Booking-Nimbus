package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "BENH_AN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BenhAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benhan_id", columnDefinition = "INT")
    private Integer benhAnId;

    @ManyToOne
    @JoinColumn(name = "lichkham_id", referencedColumnName = "lichkham_id", columnDefinition = "INT")
    @NotNull(message = "Lịch khám không được để trống")
    private LichKham lichKham;

    @ManyToOne
    @JoinColumn(name = "bacsi_ket_luan_id", referencedColumnName = "bacsi_id", columnDefinition = "INT")
    @NotNull(message = "Bác sĩ kết luận không được để trống")
    private BacSi bacSiKetLuan;

    @Column(name = "tom_tat", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotBlank(message = "Tóm tắt không được để trống")
    private String tomTat;

    @Column(name = "ket_luan", length = 225, columnDefinition = "NVARCHAR(225)")
    @NotBlank(message = "Kết luận không được để trống")
    private String ketLuan;

    @Column(name = "ghi_chu", length = 225, columnDefinition = "NVARCHAR(225)")
    @NotBlank(message = "Ghi chú không được để trống")
    private String ghiChu;

    @Column(name = "thoi_gian", columnDefinition = "DATETIME")
    @NotNull(message = "Thời gian không được để trống")
    private LocalDateTime thoiGian;

    @OneToMany(mappedBy = "benhAn", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoSoBenhAn> hoSoBenhAns;

    @OneToMany(mappedBy = "benhAn", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichSuDieuTri> lichSuDieuTris;
}