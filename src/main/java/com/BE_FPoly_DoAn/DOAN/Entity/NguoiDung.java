package com.BE_FPoly_DoAn.DOAN.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "NGUOI_DUNG", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "soDienThoai")
})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nguoidung_id", columnDefinition = "INT")
    private Integer nguoiDungId;

    @Column(name = "hoten", nullable = false, length = 50, columnDefinition = "NVARCHAR(50)")
    @NotBlank(message = "Họ tên không được để trống")
    @Size(max = 50, message = "Họ tên không vượt quá 50 ký tự")
    private String hoTen;

    @Column(name = "gioi_tinh", length = 10, columnDefinition = "NVARCHAR(10)")
    private String gioiTinh;

    @Column(name = "email", length = 225, columnDefinition = "NVARCHAR(225)")
    @Email(message = "Email không hợp lệ")
    private String email;

    @Column(name = "so_dien_thoai", length = 15, columnDefinition = "VARCHAR(15)")
    @Size(max = 15, message = "Số điện thoại không vượt quá 15 ký tự")
    private String soDienThoai;

    @Column(name = "mat_khau", nullable = false, length = 225, columnDefinition = "VARCHAR(225)")
    @NotBlank(message = "Mật khẩu không được để trống")
    private String matKhau;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATETIME", updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATETIME")
    private LocalDateTime ngayCapNhat;

    @OneToMany(mappedBy = "nguoiDung", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<PhanQuyen> phanQuyens;

    @OneToMany(mappedBy = "nguoiDung", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<BacSi> bacSis;

    @OneToMany(mappedBy = "nguoiDung", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<BenhNhan> benhNhans;

    @OneToMany(mappedBy = "nguoiDungLapHoaDon", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoaDon> hoaDonsLap;
}