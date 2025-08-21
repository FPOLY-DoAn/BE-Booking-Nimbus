package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;

import java.time.LocalTime;

public class GioKhamChiTietMapper {

    public static GioKhamChiTietDto toDto(GioKhamChiTiet entity) {
        LocalTime batDau = entity.getThoiGian();
        LocalTime ketThuc = batDau.plusMinutes(15);

        return GioKhamChiTietDto.builder()
                .gioKhamId(entity.getGioKhamId())
                .lichLamViecId(entity.getLichLamViecBacSi().getLichlvId())
                .batDau(batDau)
                .ketThuc(ketThuc)
                .daDat(entity.getTrangThai())
                .build();
    }

    public static GioKhamChiTiet toEntity(GioKhamChiTietDto dto, LichLamViecBacSi lich) {
        return GioKhamChiTiet.builder()
                .gioKhamId(dto.getGioKhamId())
                .lichLamViecBacSi(lich)
                .thoiGian(dto.getBatDau())
                .trangThai(dto.getDaDat())
                .build();
    }
}