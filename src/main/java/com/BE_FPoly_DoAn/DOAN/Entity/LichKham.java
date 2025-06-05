package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "LICH_KHAM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichKham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lichkham_id", columnDefinition = "INT")
    private Integer lichkhamId;

    @ManyToOne
    @JoinColumn(name = "bacsi_id", referencedColumnName = "bacsi_id", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Bác sĩ không được để trống")
    private BacSi bacSi;

    @ManyToOne
    @JoinColumn(name = "benhnhan_id", referencedColumnName = "benhnhan_id", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Bệnh nhân không được để trống")
    private BenhNhan benhNhan;

    @Column(name = "thoi_gian_hen", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "Thời gian hẹn không được để trống")
    private LocalDateTime thoiGianHen;

    @Column(name = "thoi_gian_den", columnDefinition = "DATETIME")
    private LocalDateTime thoiGianDen;

    @Enumerated(EnumType.STRING)
    @Column(name = "kieu_lich_kham", length = 1, columnDefinition = "CHAR(1)", nullable = false)
    @NotNull(message = "Kiểu lịch khám không được để trống")
    private KieuLichKham kieuLichKham;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai", length = 1, columnDefinition = "CHAR(1)", nullable = false)
    @NotNull(message = "Trạng thái không được để trống")
    private TrangThaiLichKham trangThai;

    @Column(name = "ghi_chu", length = 250, columnDefinition = "NVARCHAR(250)")
    private String ghiChu;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATETIME", nullable = false, updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATETIME")
    private LocalDateTime ngayCapNhat;

    @OneToOne(mappedBy = "lichKham", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private BenhAn benhAn;

    public enum KieuLichKham {
        H, T, D
    }

    public enum TrangThaiLichKham {
        A, C, P
    }
}