package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "CHUYEN_KHOA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenKhoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chuyenkhoa_id", columnDefinition = "INT")
    private Integer chuyenkhoa_id;

    @Column(name = "ten_khoa", length = 50, columnDefinition = "NVARCHAR(50)")
    private String ten_khoa;

    @Column(name = "mo_ta", length = 250, columnDefinition = "NVARCHAR(250)")
    private String mo_ta;

    @OneToMany(mappedBy = "chuyenKhoa", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<BacSi> bacSis;
}