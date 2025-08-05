package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamShortDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;

import java.sql.Time;
import java.time.LocalDateTime;

/**
 * Mapper hỗ trợ chuyển đổi giữa Entity <-> DTO cho đối tượng LichKham.
 */
public class LichKhamMapper {

    /**
     * Chuyển từ DTO sang Entity để lưu vào database.
     *
     * @param dto       DTO chứa thông tin lịch khám từ phía client gửi lên
     * @param bacSi     Entity bác sĩ đã được load từ DB
     * @param benhNhan  Entity bệnh nhân đã được load từ DB
     * @return          Đối tượng LichKham đã được ánh xạ
     */
    public static LichKham toEntity(LichKhamDTO dto, BacSi bacSi, BenhNhan benhNhan) {
        LichKham entity = new LichKham();
        entity.setLichkhamId(dto.getLichkhamId());
        entity.setBacSi(bacSi);
        entity.setBenhNhan(benhNhan);
        entity.setThoiGianHen(dto.getThoiGianHen());
        entity.setThoiGianDen(dto.getThoiGianDen());
        entity.setKieuLichKham(dto.getKieuLichKham());
        entity.setTrangThai(dto.getTrangThai());
        entity.setGhiChu(dto.getGhiChu());
        entity.setNgayKham(dto.getNgayKham());
        entity.setCaKham(dto.getCaKham());
        return entity;
    }


    /**
     * Chuyển từ Entity sang DTO để trả về cho client.
     *
     * @param entity    Entity LichKham từ database
     * @return          Đối tượng DTO chứa thông tin lịch khám
     */
    public static LichKhamDTO toDTO(LichKham entity) {
        LichKhamDTO dto = new LichKhamDTO();
        dto.setLichkhamId(entity.getLichkhamId());
        dto.setBacSiId(entity.getBacSi().getBacSiId());
        dto.setBenhNhanId(entity.getBenhNhan().getBenhNhanId());
        dto.setThoiGianHen(entity.getThoiGianHen());
        dto.setThoiGianDen(entity.getThoiGianDen());
        dto.setKieuLichKham(entity.getKieuLichKham());
        dto.setTrangThai(entity.getTrangThai());
        dto.setGhiChu(entity.getGhiChu());
        dto.setNgayKham(entity.getNgayKham());
        dto.setCaKham(entity.getCaKham());
        dto.setNgayCapNhat(entity.getNgayCapNhat());
        return dto;
    }

    /**
     * Chuyển từ Entity sang ShortDTO – chứa thông tin rút gọn (chỉ vài trường cơ bản).
     *
     * @param entity    Entity LichKham từ database
     * @return          DTO rút gọn, phục vụ hiển thị danh sách nhanh
     */
    public static LichKhamShortDTO toShortDTO(LichKham entity) {
        if (entity == null) return null;

        return LichKhamShortDTO.builder()
                .lichkhamId(entity.getLichkhamId())
                .bacSiId(entity.getBacSi().getBacSiId())
                .thoiGianHen(entity.getThoiGianHen())
                .trangThai(entity.getTrangThai())
                .ngayKham(entity.getNgayKham())
                .build();
    }
}