package com.BE_FPoly_DoAn.DOAN.Service.Impl.Guest;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecResponseDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.Guest.LichKhamTrongDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.*;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.ChuyenKhoa.ChuyenKhoaDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.Guest.BacSiGuestDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Mapper.LichLamViecMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Dao.GuestAppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class GuestAppointmentServiceImpl implements GuestAppointmentService {

    private final ChuyenKhoaRepository chuyenKhoaRepo;
    private final BacSiRepository bacSiRepo;
    private final LichLamViecBacSiRepository lichLamViecRepo;
    private final GioKhamChiTietRepository gioKhamRepo;

    @Override
    public ServiceResponse<?> getAllChuyenKhoa() {
        try {
            List<ChuyenKhoaDTO> list = chuyenKhoaRepo.findAll().stream()
                    .map(ck -> new ChuyenKhoaDTO(ck.getChuyenKhoaId(), ck.getTenKhoa(), ck.getMoTa()))
                    .toList();
            return ServiceResponse.success(NotificationCode.SPECIALTY_LIST_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    @Override
    public ServiceResponse<?> getBacSiTheoChuyenKhoa(String tenKhoa) {
        try {
            List<BacSiGuestDTO> list = bacSiRepo.findByChuyenKhoa_TenKhoa(tenKhoa).stream()
                    .map(bs -> {
                        var nd = bs.getNguoiDung();
                        return new BacSiGuestDTO(
                                bs.getBacSiId(),
                                nd.getHoTen(),
                                nd.getGioiTinh(),
                                nd.getSoDienThoai(),
                                nd.getEmail(),
                                bs.getTrinhDo(),
                                bs.getKinhNghiem(),
                                bs.getChungChi(),
                                bs.getChuyenKhoa().getTenKhoa()
                        );
                    }).toList();
            return ServiceResponse.success(NotificationCode.DOCTOR_LIST_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    @Override
    public ServiceResponse<?> getNgayLamViec(Integer bacSiId) {
        try {
            List<LichLamViecResponseDTO> list = lichLamViecRepo.findByBacSi_BacSiId(bacSiId)
                    .stream()
                    .map(LichLamViecMapper::toDto)
                    .toList();
            return ServiceResponse.success(NotificationCode.WORKING_DAYS_FETCH_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    @Override
    public ServiceResponse<?> getCaLamViec(Integer bacSiId, LocalDate ngay) {
        try {
            List<String> list = lichLamViecRepo.findByBacSi_BacSiIdAndNgay(bacSiId, ngay).stream()
                    .map(LichLamViecBacSi::getCaTruc)
                    .distinct()
                    .toList();

            if (list.isEmpty()) {
                return ServiceResponse.error(NotificationCode.SHIFT_NOT_FOUND, "Bác sĩ không có ca làm việc vào ngày này.");
            }

            return ServiceResponse.success(NotificationCode.SHIFT_FETCH_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }


    @Override
    public ServiceResponse<?> getGioTrongTheoCa(Integer bacSiId, LocalDate ngay, String ca) {
        try {
            List<GioKhamChiTietDto> list = gioKhamRepo
                    .findByLichLamViecBacSi_BacSi_BacSiIdAndLichLamViecBacSi_NgayAndLichLamViecBacSi_CaTruc(bacSiId, ngay, ca)
                    .stream()
                    .filter(GioKhamChiTiet::getTrangThai)
                    .map(GioKhamChiTietMapper::toDto)
                    .toList();

            if (list.isEmpty()) {
                return ServiceResponse.error(NotificationCode.AVAILABLE_TIME_NOT_FOUND, "Không có giờ trống trong ca làm việc này.");
            }

            return ServiceResponse.success(NotificationCode.AVAILABLE_TIME_FETCH_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getLichKhamTrongTheoChuyenKhoa(String tenKhoa) {
        try {
            List<BacSi> bacSiList = bacSiRepo.findByChuyenKhoa_TenKhoa(tenKhoa);

            if (bacSiList.isEmpty()) {
                return ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND, "Không có bác sĩ cho chuyên khoa này.");
            }

            List<LichLamViecBacSi> lichList = lichLamViecRepo.findByBacSiIn(bacSiList);

            List<LichKhamTrongDTO> result = lichList.stream()
                    .flatMap(lich -> {
                        long soGioTrong = gioKhamRepo
                                .findByLichLamViecBacSi(lich)
                                .stream()
                                .filter(GioKhamChiTiet::getTrangThai)
                                .count();
                        if (soGioTrong > 0) {
                            LichKhamTrongDTO dto = new LichKhamTrongDTO();
                            dto.setNgay(lich.getNgay());
                            dto.setCaTruc(lich.getCaTruc());
                            dto.setSoGioTrong((int) soGioTrong);
                            return Stream.of(dto);
                        }
                        return Stream.empty();
                    })
                    .toList();

            if (result.isEmpty()) {
                return ServiceResponse.error(NotificationCode.AVAILABLE_TIME_NOT_FOUND, "Không có lịch trống cho chuyên khoa này.");
            }

            return ServiceResponse.success(NotificationCode.AVAILABLE_TIME_FETCH_SUCCESS, result);

        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getGioTrongTheoChuyenKhoa(String tenKhoa, LocalDate ngay, String ca) {
        try {
            List<BacSi> bacSiList = bacSiRepo.findByChuyenKhoa_TenKhoa(tenKhoa);

            if (bacSiList.isEmpty()) {
                return ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND, "Không có bác sĩ cho chuyên khoa này.");
            }

            List<LichLamViecBacSi> lichList = lichLamViecRepo.findByBacSiInAndNgayAndCaTruc(bacSiList, ngay, ca);

            List<GioKhamChiTietDto> gioTrongList = lichList.stream()
                    .flatMap(lich -> gioKhamRepo.findByLichLamViecBacSi(lich).stream())
                    .filter(GioKhamChiTiet::getTrangThai)
                    .map(GioKhamChiTietMapper::toDto)
                    .toList();

            if (gioTrongList.isEmpty()) {
                return ServiceResponse.error(NotificationCode.AVAILABLE_TIME_NOT_FOUND, "Không có giờ trống cho chuyên khoa này.");
            }

            return ServiceResponse.success(NotificationCode.AVAILABLE_TIME_FETCH_SUCCESS, gioTrongList);

        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }
}