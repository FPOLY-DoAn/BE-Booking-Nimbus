package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;

import java.util.List;

public class BenhAnMapper {

    public static BenhAn toEntity(BenhAnDTO dto, LichKham lichKham, BacSi bacSi, DichVu dichVu) {
        BenhAn entity = new BenhAn();
        entity.setBenhAnId(dto.getBenhAnId());
        entity.setLichKham(lichKham);
        entity.setBacSiKetLuan(bacSi);
        entity.setTomTat(dto.getTomTat());
        entity.setKetLuan(dto.getKetLuan());
        entity.setGhiChu(dto.getGhiChu());
        entity.setThoiGian(dto.getThoiGian());

        return entity;
    }

    public static BenhAnDTO toDto(BenhAn entity, List<Integer> benhIds) {
        BenhAnDTO dto = new BenhAnDTO();
        dto.setBenhAnId(entity.getBenhAnId());
        dto.setLichKhamId(entity.getLichKham().getLichkhamId());
        dto.setBacSiKetLuanId(entity.getBacSiKetLuan().getBacSiId());
        dto.setTomTat(entity.getTomTat());
        dto.setKetLuan(entity.getKetLuan());
        dto.setGhiChu(entity.getGhiChu());
        dto.setThoiGian(entity.getThoiGian());
        dto.setBenhIds(benhIds);

        return dto;
    }

    public static BenhAnDTO toDTO(BenhAn entity) {
        List<Integer> benhIds = entity.getHoSoBenhAns()
                .stream()
                .map(hoso -> hoso.getBenh().getBenhId())
                .toList();
        return toDto(entity, benhIds);
    }
}