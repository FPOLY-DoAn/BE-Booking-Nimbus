package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecHomNayChiTietDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;

import java.util.List;

public class LichLamViecHomNayChiTietMapper {

    public static LichLamViecHomNayChiTietDTO toDto(
            LichLamViecBacSi lich,
            List<GioKhamChiTietDto> gioKhamList
    ) {
        return LichLamViecHomNayChiTietDTO.builder()
                .bacSiId(lich.getBacSi().getBacSiId())
                .hoTen(lich.getBacSi().getNguoiDung().getHoTen())
                .ngay(lich.getNgay())
                .caTruc(lich.getCaTruc())
                .lyDoNghi(lich.getLyDoNghi())
                .gioKhamChiTiet(gioKhamList)
                .build();
    }
}