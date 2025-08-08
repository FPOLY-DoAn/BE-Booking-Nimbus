package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhan.BenhNhanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;

import java.util.stream.Collectors;

public class BenhNhanMapper {
    public static BenhNhanDTO toDTO(BenhNhan entity) {
        if (entity == null) return null;

        return BenhNhanDTO.builder()
                .benhNhanId(entity.getBenhNhanId())
                .hoTen(entity.getNguoiDung().getHoTen())
                .gioiTinh(String.valueOf(entity.getNguoiDung().getGioiTinh()))
                .email(entity.getNguoiDung().getEmail())
                .soDienThoai(entity.getNguoiDung().getSoDienThoai())
                .baoHiem(entity.getBaoHiem())
                .lienHeKhanCap(entity.getLienHeKhanCap())
                .ngayTao(entity.getNgayTao())
                .ngayCapNhat(entity.getNgayCapNhat())
                .diaChi(entity.getDiaChi())
                .canCuocCongDan(entity.getCanCuocCongDan())
                .danToc(entity.getDanToc())
//                .lichKhams(entity.getLichKhams() != null
//                        ? entity.getLichKhams().stream()
//                        .map(LichKhamMapper::toShortDTO)
//                        .collect(Collectors.toList())
//                        : null)
//                .hoaDons(entity.getHoaDons() != null
//                        ? entity.getHoaDons().stream()
//                        .map(HoaDonMapper::toShortDTO)
//                        .collect(Collectors.toList())
//                        : null)
                .build();
    }

    public static BenhNhan toEntity(BenhNhanDTO dto, com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung nguoiDung) {
        return BenhNhan.builder()
                .nguoiDung(nguoiDung)
                .baoHiem(dto.getBaoHiem())
                .lienHeKhanCap(dto.getLienHeKhanCap())
                .build();
    }

    public static BenhNhanRequestDTO toRequestDTO(BenhNhan entity) {
        if (entity == null) return null;

        return new BenhNhanRequestDTO(
                entity.getBenhNhanId(),
                entity.getBaoHiem(),
                entity.getDiaChi(),
                entity.getLienHeKhanCap(),
                entity.getCanCuocCongDan(),
                entity.getDanToc(),
                entity.getNgayTao(),
                entity.getNgayCapNhat()
        );
    }
}