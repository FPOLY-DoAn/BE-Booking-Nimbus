package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;

public class GioKhamChiTietMapper {

    public static GioKhamChiTietDto toDto(GioKhamChiTiet entity) {
        return GioKhamChiTietDto.builder()
                .gioKhamId(entity.getGioKhamId())
                .lichLamViecId(entity.getLichLamViecBacSi().getLichlvId())
                .thoiGian(entity.getThoiGian())
                .trangThai(entity.getTrangThai())
                .build();
    }

    public static GioKhamChiTiet toEntity(GioKhamChiTietDto dto, LichLamViecBacSi lich) {
        return GioKhamChiTiet.builder()
                .gioKhamId(dto.getGioKhamId())
                .lichLamViecBacSi(lich)
                .thoiGian(dto.getThoiGian())
                .trangThai(dto.getTrangThai())
                .build();
    }
}