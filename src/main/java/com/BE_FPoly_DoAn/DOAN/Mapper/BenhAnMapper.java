package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;

import java.time.LocalDateTime;
import java.util.List;

public class BenhAnMapper {

    public static BenhAn toEntity(BenhAnDTO dto, LichKham lichKham, BacSi bacSi, DichVu dichVu) {
        BenhAn entity = new BenhAn();
        entity.setLichKham(lichKham);
        entity.setBacSiKetLuan(bacSi);
        entity.setDichVu(dichVu);
        entity.setTomTat(dto.getTomTat());
        entity.setKetLuan(dto.getKetLuan());
        entity.setGhiChu(dto.getGhiChu());
        entity.setThoiGian(LocalDateTime.now());
        return entity;
    }

    public static BenhAnDTO toDTO(BenhAn entity, List<Integer> benhIds) {
        BenhAnDTO dto = new BenhAnDTO();
        dto.setBenhAnId(entity.getBenhAnId());
        dto.setLichKhamId(entity.getLichKham().getLichkhamId());
        dto.setBacSiKetLuanId(entity.getBacSiKetLuan().getBacSiId());
        dto.setDichVuId(entity.getDichVu().getDichVuId());
        dto.setTomTat(entity.getTomTat());
        dto.setKetLuan(entity.getKetLuan());
        dto.setGhiChu(entity.getGhiChu());
        dto.setThoiGian(entity.getThoiGian());
        dto.setBenhIds(benhIds);
        return dto;
    }
}