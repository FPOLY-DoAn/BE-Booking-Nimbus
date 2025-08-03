package com.BE_FPoly_DoAn.DOAN.Service.Impl.Guest;

import com.BE_FPoly_DoAn.DOAN.Dao.*;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.ChuyenKhoa.ChuyenKhoaDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.Guest.BacSiGuestDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Dao.GuestAppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

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
            List<LocalDate> list = lichLamViecRepo.findByBacSi_BacSiId(bacSiId).stream()
                    .map(LichLamViecBacSi::getNgay)
                    .distinct()
                    .sorted()
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
            return ServiceResponse.success(NotificationCode.AVAILABLE_TIME_FETCH_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }
}