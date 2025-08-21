package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.KhungGioRanhDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.CaKham;
import com.BE_FPoly_DoAn.DOAN.DTO.TaoGioNhieuLichDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.GioKhamChiTietRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecBacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.GioKhamChiTiet;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.*;

@Service
public class GioKhamChiTietServiceImpl {

    private final GioKhamChiTietRepository repository;
    private final LichLamViecBacSiRepository lichLamViecRepo;
    
    public GioKhamChiTietServiceImpl(GioKhamChiTietRepository repository, LichLamViecBacSiRepository lichLamViecRepo) {
        this.repository = repository;
        this.lichLamViecRepo = lichLamViecRepo;
    }

    public ServiceResponse<?> generateTheoCa(TaoGioNhieuLichDTO req) {
        try {
            Map<Integer, List<GioKhamChiTietDto>> result = new HashMap<>();

            if (req.getLichLamViecIds() == null || req.getLichLamViecIds().isEmpty()) {
                return ServiceResponse.error(NotificationCode.CREATE_FAIL, "Danh sách lichLamViecIds trống");
            }

            for (Integer lichId : req.getLichLamViecIds()) {
                LichLamViecBacSi lich = lichLamViecRepo.findById(lichId).orElse(null);
                if (lich == null) continue;

                CaKham ca = CaKham.fromViet(lich.getCaTruc());

                List<LocalTime> gioTonTai = repository.findByLichLamViecBacSi_LichlvId(lichId)
                        .stream().map(GioKhamChiTiet::getThoiGian).toList();

                List<GioKhamChiTiet> taoMoi = new ArrayList<>();
                LocalTime start = ca.getStart();
                LocalTime end = ca.getEnd();
                int buocNhay = 15;

                while (!start.isAfter(end.minusMinutes(buocNhay))) {
                    if (!gioTonTai.contains(start)) {
                        taoMoi.add(GioKhamChiTiet.builder()
                                .lichLamViecBacSi(lich)
                                .thoiGian(start)
                                .trangThai(true)
                                .build());
                    }
                    start = start.plusMinutes(buocNhay);
                }

                repository.saveAll(taoMoi);

                List<GioKhamChiTietDto> ketQua = repository.findByLichLamViecBacSi_LichlvId(lichId)
                        .stream()
                        .map(GioKhamChiTietMapper::toDto)
                        .toList();

                result.put(lichId, ketQua);
            }

            return ServiceResponse.success(NotificationCode.CREATED_SUCCESS, result);

        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.CREATE_FAIL, "Lỗi khi tạo tự động: " + e.getMessage());
        }
    }

    public ServiceResponse<?> getByLichId(Integer lichId) {
        List<GioKhamChiTiet> slotList = repository.findByLichLamViecBacSi_LichlvId(lichId)
                .stream()
                .sorted(Comparator.comparing(GioKhamChiTiet::getThoiGian))
                .toList();

        List<KhungGioRanhDTO> khungList = new ArrayList<>();

        for (int i = 0; i < slotList.size(); i++) {
            GioKhamChiTiet slot = slotList.get(i);

            khungList.add(KhungGioRanhDTO.builder()
                    .batDau(slot.getThoiGian())
                    .ketThuc(slot.getThoiGian().plusMinutes(15))
                    .daDat(!Boolean.FALSE.equals(slot.getTrangThai()))
                    .build());
        }

        return ServiceResponse.success(NotificationCode.SERVICE_ID, khungList);
    }
}