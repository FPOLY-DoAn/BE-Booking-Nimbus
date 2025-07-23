package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.ThanhToanDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.HoaDon;
import com.BE_FPoly_DoAn.DOAN.Entity.ThanhToan;

public class ThanhToanMapper {

    public static ThanhToan toEntity(ThanhToanDTO dto, HoaDon hoaDon) {
        return new ThanhToan(
                dto.getThanhToanId(),
                hoaDon,
                dto.getNgayThanhToan(),
                dto.getSoTienThanhToan(),
                dto.getPhuongThucThanhToan(),
                dto.getTrangThai(),
                dto.getMaGiaoDich(),
                dto.getGhiChu()
        );
    }

    public static ThanhToanDTO toDto(ThanhToan entity) {
        return ThanhToanDTO.builder()
                .thanhToanId(entity.getThanhToanId())
                .hoaDonId(entity.getHoaDon().getHoaDonId())
                .ngayThanhToan(entity.getNgayThanhToan())
                .soTienThanhToan(entity.getSoTienThanhToan())
                .phuongThucThanhToan(entity.getPhuongThucThanhToan())
                .trangThai(entity.getTrangThai())
                .maGiaoDich(entity.getMaGiaoDich())
                .ghiChu(entity.getGhiChu())
                .build();
    }
}