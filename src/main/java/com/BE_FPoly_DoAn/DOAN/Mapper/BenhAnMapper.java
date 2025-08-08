package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhAnDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BenhAn.BenhInfoDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;

import java.time.LocalDateTime;
import java.util.List;

public class BenhAnMapper {

    public static BenhAn toEntity(BenhAnDTO dto, LichKham lichKham, BacSi bacSi) {
        BenhAn entity = new BenhAn();
        entity.setLichKham(lichKham);
        entity.setBacSiKetLuan(bacSi);
        entity.setTomTat(dto.getTomTat());
        entity.setKetLuan(dto.getKetLuan());
        entity.setGhiChu(dto.getGhiChu());
        entity.setThoiGian(LocalDateTime.now());
        return entity;
    }

    public static BenhAnDTO toDTO(BenhAn entity, List<BenhInfoDTO> benhInfoList) {
        BenhAnDTO dto = new BenhAnDTO();
        dto.setBenhAnId(entity.getBenhAnId());
        dto.setLichKhamId(entity.getLichKham().getLichkhamId());
        dto.setTomTat(entity.getTomTat());
        dto.setKetLuan(entity.getKetLuan());
        dto.setGhiChu(entity.getGhiChu());
        dto.setThoiGian(entity.getThoiGian());
        List<String> benhTenList = benhInfoList.stream().map(BenhInfoDTO::getTenBenh).toList();
        dto.setBenhTenList(benhTenList);
        return dto;
    }
}