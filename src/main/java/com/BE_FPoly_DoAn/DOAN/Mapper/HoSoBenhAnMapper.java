package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.HoSoBenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;

public class HoSoBenhAnMapper {

    public static HoSoBenhAn toEntity(HoSoBenhAnDTO dto, BenhAn benhAn, Benh benh) {
        HoSoBenhAn entity = new HoSoBenhAn();
        entity.setHoSoId(dto.getHoSoBenhAnId());
        entity.setBenhAn(benhAn);
        entity.setBenh(benh);
        return entity;
    }

    public static HoSoBenhAnDTO toDto(HoSoBenhAn entity) {
        HoSoBenhAnDTO dto = new HoSoBenhAnDTO();
        dto.setHoSoBenhAnId(entity.getHoSoId());
        dto.setBenhAnId(entity.getBenhAn().getBenhAnId());
        dto.setBenhId(entity.getBenh().getBenhId());
        return dto;
    }
}