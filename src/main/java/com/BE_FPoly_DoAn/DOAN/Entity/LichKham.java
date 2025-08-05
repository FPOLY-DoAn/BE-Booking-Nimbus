package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Entity đại diện cho bảng LIC_HKHAM trong cơ sở dữ liệu.
 * Lưu trữ thông tin chi tiết về các lịch hẹn khám giữa bệnh nhân và bác sĩ.
 */
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

    @Column(name = "thoi_gian_hen", columnDefinition = "TIME")
    private LocalTime thoiGianHen;

    @Column(name = "thoi_gian_den", columnDefinition = "TIME")
    private LocalTime thoiGianDen;

    @Column(name = "ghi_chu", length = 250, columnDefinition = "NVARCHAR(250)")
    private String ghiChu;

    @Column(name = "ngay_kham")
    private LocalDate ngayKham;

    @Column(name = "ca_kham")
    private String caKham;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATETIME", nullable = false, updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATETIME")
    private LocalDateTime ngayCapNhat;

    @OneToOne(mappedBy = "lichKham", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private BenhAn benhAn;

    @Column(name = "kieu_lich_kham", columnDefinition = "NVARCHAR(50)")
    private String kieuLichKham;

    @Column(name = "trang_thai", columnDefinition = "NVARCHAR(50)")
    private String trangThai;
}