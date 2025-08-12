package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.LeTanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LeTanResponseDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.LeTan;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;

public class LeTanMapper {

    public static LeTanResponseDTO toResponseDto(LeTan entity) {
        LeTanResponseDTO dto = new LeTanResponseDTO();
        dto.setLeTanId(entity.getLeTanId());

        NguoiDung nd = entity.getNguoiDung();
        if (nd != null) {
            dto.setHoTen(nd.getHoTen());
            dto.setGioiTinh(nd.getGioiTinh());
            dto.setEmail(nd.getEmail());
            dto.setSoDienThoai(nd.getSoDienThoai());
        }

        dto.setNgayTuyenDung(entity.getNgayTuyenDung());
        dto.setChucVu(entity.getChucVu());
        dto.setGhiChu(entity.getGhiChu());
        dto.setTrangThaiHoatDong(entity.getTrangThaiHoatDong());
        dto.setNgayTao(entity.getNgayTao());
        dto.setNgayCapNhat(entity.getNgayCapNhat());

        return dto;
    }

    public static LeTan toEntity(LeTanRequestDTO dto) {
        NguoiDung nd = NguoiDung.builder()
                .hoTen(dto.getHoTen())
                .gioiTinh(dto.getGioiTinh())
                .email(dto.getEmail())
                .soDienThoai(dto.getSoDienThoai())
                .matKhau(dto.getMatKhau())
                .build();

        return LeTan.builder()
                .nguoiDung(nd)
                .ngayTuyenDung(dto.getNgayTuyenDung())
                .chucVu(dto.getChucVu())
                .ghiChu(dto.getGhiChu())
                .trangThaiHoatDong(dto.getTrangThaiHoatDong() != null ? dto.getTrangThaiHoatDong() : false)
                .build();
    }

    public static void updateEntity(LeTan entity, LeTanRequestDTO dto, boolean updatePassword) {
        NguoiDung nd = entity.getNguoiDung();
        if (nd != null) {
            nd.setHoTen(dto.getHoTen());
            nd.setGioiTinh(dto.getGioiTinh());
            nd.setEmail(dto.getEmail());
            nd.setSoDienThoai(dto.getSoDienThoai());

            if (updatePassword && dto.getMatKhau() != null && !dto.getMatKhau().isBlank()) {
                nd.setMatKhau(dto.getMatKhau());
            }
        }

        entity.setNgayTuyenDung(dto.getNgayTuyenDung());
        entity.setChucVu(dto.getChucVu());
        entity.setGhiChu(dto.getGhiChu());
        entity.setTrangThaiHoatDong(dto.getTrangThaiHoatDong() != null ? dto.getTrangThaiHoatDong() : entity.getTrangThaiHoatDong());
    }
}
