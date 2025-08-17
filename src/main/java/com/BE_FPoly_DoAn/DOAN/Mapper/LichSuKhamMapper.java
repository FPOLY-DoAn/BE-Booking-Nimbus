package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan.LichSuKhamDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;

public class LichSuKhamMapper {
    public static LichSuKhamDTO toDTO(LichKham lichKham) {
        return LichSuKhamDTO.builder()
                .lichKhamId(lichKham.getLichkhamId())
                .thoiGianTu(lichKham.getThoiGianTu())
                .thoiGianDen(lichKham.getThoiGianDen())
                .loaiHinhKham(lichKham.getLoaiHinhKham())
                .trangThai(lichKham.getTrangThai())
                .ghiChu(lichKham.getGhiChu())
                .ngayKham(lichKham.getNgayKham() != null ? lichKham.getNgayKham().toString() : null)
                .caKham(lichKham.getCaKham())

                .tenBacSi(
                        lichKham.getBacSi() != null && lichKham.getBacSi().getNguoiDung() != null
                                ? lichKham.getBacSi().getNguoiDung().getHoTen()
                                : null
                )
                .tenBenhNhan(
                        lichKham.getBenhNhan() != null && lichKham.getBenhNhan().getNguoiDung() != null
                                ? lichKham.getBenhNhan().getNguoiDung().getHoTen()
                                : null
                )
                .tenChuyenKhoa(
                        lichKham.getBacSi() != null && lichKham.getBacSi().getChuyenKhoa() != null
                                ? lichKham.getBacSi().getChuyenKhoa().getTenKhoa()
                                : null
                )
                .build();
    }
}

