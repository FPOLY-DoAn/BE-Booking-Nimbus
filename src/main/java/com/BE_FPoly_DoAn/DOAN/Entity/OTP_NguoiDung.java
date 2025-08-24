package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Otp_NguoiDung")
public class OTP_NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "otp_code")
    private String otpCode;
    private String email;
    @Column(name = "ho_ten", columnDefinition = "NVARCHAR(50)")
    private String hoTen;
    @Column(name = "gioi_tinh", columnDefinition = "NVARCHAR(50)")
    private String gioiTinh;
    private String soDienThoai;
    private String matKhau;
    private LocalDateTime createdAt;
    private LocalDateTime expireAt;

    @Column(name = "is_reset_password")
    private boolean resetPassword = false;

    @Column(name = "verified")
    private boolean verified = false;

    public OTP_NguoiDung(String otpCode, String email, String hoTen, String gioiTinh, String soDienThoai, String matKhau) {
        this.otpCode = otpCode;
        this.email = email;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.matKhau = matKhau;
        this.createdAt = LocalDateTime.now();
        this.expireAt = this.createdAt.plusMinutes(5);
    }
}
