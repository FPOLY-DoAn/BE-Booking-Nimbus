package com.BE_FPoly_DoAn.DOAN.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "BENH_NHAN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BenhNhan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benhnhan_id", columnDefinition = "INT")
    private Integer benhNhanId;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", columnDefinition = "INT")
    @NotNull(message = "Người dùng không được để trống")
    @Schema(hidden = true)
    private NguoiDung nguoiDung;

    @Column(name = "bao_hiem", length = 25, columnDefinition = "NVARCHAR(25)")
    @NotBlank(message = "Bảo hiểm không được để trống")
    @Schema(hidden = true)
    private String baoHiem;

    @Column(name = "lien_he_khan_cap", length = 50, columnDefinition = "NVARCHAR(50)")
    @NotBlank(message = "Liên hệ khẩn cấp không được để trống")
    @Pattern(regexp = "^\\+?[0-9\\-\\s]{7,15}$", message = "Số điện thoại không hợp lệ")
    @Schema(hidden = true)
    private String lienHeKhanCap;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATE", updatable = false)
    private LocalDate ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATE")
    private LocalDate ngayCapNhat;

    @OneToMany(mappedBy = "benhNhan", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichKham> lichKhams;

    @OneToMany(mappedBy = "benhNhan", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoaDon> hoaDons;
}