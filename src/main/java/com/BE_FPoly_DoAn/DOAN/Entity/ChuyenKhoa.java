package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CHUYEN_KHOA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenKhoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chuyenkhoa_id;

    @Column(length = 50)
    private String ten_khoa;

    @Column(length = 250)
    private String mo_ta;
}