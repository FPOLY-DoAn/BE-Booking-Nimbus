package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.HoaDonShortDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.HoaDon;

public class HoaDonMapper {

    public static HoaDonShortDTO toShortDTO(HoaDon entity) {
        if (entity == null) return null;

        return HoaDonShortDTO.builder()
                .hoaDonId(entity.getHoaDonId())
                .tongTien(entity.getTongTien())
                .trangThai(entity.getTrangThai() != null ? entity.getTrangThai().name() : null)
                .ngayThanhToan(entity.getNgayTao().toLocalDate())
                .build();
    }
}