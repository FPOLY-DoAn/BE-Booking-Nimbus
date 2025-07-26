package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.GioKhamChiTietDto;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.*;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Fillter.LichKhamSpecification;
import com.BE_FPoly_DoAn.DOAN.Mapper.GioKhamChiTietMapper;
import com.BE_FPoly_DoAn.DOAN.Mapper.LichKhamMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LichKhamServiceImpl {

    // Inject các repository cần thiết cho các thao tác với DB
    private final LichKhamRepository lichKhamRepo;
    private final BacSiRepository bacSiRepo;
    private final BenhNhanRepository benhNhanRepo;
    private final LichLamViecBacSiRepository lichLamViecBacSiRepo;
    private final GioKhamChiTietRepository gioKhamChiTietRepo;

    public LichKhamServiceImpl(LichKhamRepository lichKhamRepo,
                               BacSiRepository bacSiRepo,
                               BenhNhanRepository benhNhanRepo,
                               LichLamViecBacSiRepository lichLamViecBacSiRepo,
                               GioKhamChiTietRepository gioKhamChiTietRepo) {
        this.lichKhamRepo = lichKhamRepo;
        this.bacSiRepo = bacSiRepo;
        this.benhNhanRepo = benhNhanRepo;
        this.lichLamViecBacSiRepo = lichLamViecBacSiRepo;
        this.gioKhamChiTietRepo = gioKhamChiTietRepo;
    }

    /**
     * Tạo mới lịch khám cho bệnh nhân
     * - Kiểm tra dữ liệu đầu vào (ngày, giờ)
     * - Kiểm tra bác sĩ có làm việc trong ca đó không
     * - Kiểm tra trùng lịch, quá số lượng lịch cho phép
     * - Kiểm tra giờ hẹn hợp lệ với ca
     * - Lưu lịch và cập nhật trạng thái giờ khám chi tiết
     *
     * @param dto Thông tin lịch khám từ client
     * @return ServiceResponse phản hồi thành công hoặc thất bại
     */
    @Transactional
    public ServiceResponse<?> create(LichKhamDTO dto) {
        // ===== 1. Kiểm tra hợp lệ dữ liệu đầu vào =====

        // Thời gian hẹn, đến và ngày khám không được null
        if (dto.getThoiGianHen() == null || dto.getThoiGianDen() == null || dto.getNgayKham() == null) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian khám không được để trống");
        }

        // Thời gian hẹn phải trước thời gian đến
        if (!dto.getThoiGianHen().isBefore(dto.getThoiGianDen())) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian hẹn phải trước thời gian đến");
        }

        // Ngày khám không được là ngày quá khứ
        if (dto.getNgayKham().isBefore(LocalDate.now())) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Không thể đặt lịch cho ngày trong quá khứ");
        }

        // ===== 2. Kiểm tra bác sĩ có lịch làm việc trong ca đó không =====
        boolean isBacSiRanh = lichLamViecBacSiRepo.existsByBacSi_BacSiIdAndNgayAndCaTruc(
                dto.getBacSiId(), dto.getNgayKham(), dto.getCaKham()
        );
        if (!isBacSiRanh) {
            return ServiceResponse.error("APP_015",
                    "Bác sĩ không có lịch làm việc trong ca này");
        }

        // ===== 3. Kiểm tra có bị trùng lịch khám hay không =====
        boolean daTrungLich = lichKhamRepo.existsLichKhamTrung(
                dto.getBacSiId(), dto.getNgayKham(),
                dto.getThoiGianHen(), dto.getThoiGianDen(), null);
        if (daTrungLich) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_CONFLICT);
        }

        // ===== 4. Kiểm tra số lượng lịch trong ca có vượt quá giới hạn =====
        int soLich = lichKhamRepo.countLichKhamByBacSiAndNgayAndCa(
                Long.valueOf(dto.getBacSiId()), dto.getNgayKham(), dto.getCaKham()
        );
        int gioiHanLich = 5;
        if (soLich >= gioiHanLich) {
            return ServiceResponse.error("APP_014",
                    "Bác sĩ đã đủ lịch trong ca " + dto.getCaKham());
        }

        // ===== 5. Kiểm tra giờ hẹn có phù hợp với ca khám đã chọn không =====
        LocalTime thoiGianHen = dto.getThoiGianHen().toLocalTime();
        String caKham = dto.getCaKham();
        if (!isThoiGianHopLeTheoCa(thoiGianHen, caKham)) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Giờ hẹn không phù hợp với ca khám đã chọn: " + caKham);
        }

        // ===== 6. Tiến hành tạo lịch khám =====
        try {
            // Lấy thông tin bác sĩ và bệnh nhân từ DB
            BacSi bacSi = bacSiRepo.findById(dto.getBacSiId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));
            BenhNhan benhNhan = benhNhanRepo.findById(dto.getBenhNhanId())
                    .orElseThrow(() -> new RuntimeException("Bệnh nhân không tồn tại"));

            // Mapping DTO sang entity và lưu lịch khám
            LichKham lichKham = LichKhamMapper.toEntity(dto, bacSi, benhNhan);
            lichKhamRepo.save(lichKham);

            // ===== 7. Cập nhật trạng thái các khung giờ chi tiết thành đã đặt =====

            List<GioKhamChiTiet> gioKhamChiTietList = gioKhamChiTietRepo
                    .findByLichLamViecBacSi_BacSi_BacSiIdAndLichLamViecBacSi_NgayAndLichLamViecBacSi_CaTruc(
                            dto.getBacSiId(), dto.getNgayKham(), dto.getCaKham()
                    );

            LocalTime from = dto.getThoiGianHen().toLocalTime();
            LocalTime to = dto.getThoiGianDen().toLocalTime();

            gioKhamChiTietList.stream()
                    .filter(slot -> !slot.getThoiGian().isBefore(from)
                            && !slot.getThoiGian().isAfter(to))
                    .forEach(slot -> slot.setTrangThai(false)); // Đánh dấu khung giờ đã bị đặt

            gioKhamChiTietRepo.saveAll(gioKhamChiTietList); // Lưu cập nhật

            // ===== 8. Trả về kết quả thành công =====
            return ServiceResponse.success(NotificationCode.APPOINTMENT_CREATE_SUCCESS);
        } catch (Exception e) {
            // Nếu có lỗi trong quá trình lưu, trả về thông báo lỗi
            return ServiceResponse.error(NotificationCode.APPOINTMENT_CREATE_FAIL, e.getMessage());
        }
    }

    /**
     * Lấy danh sách tất cả lịch khám có trong hệ thống.
     *
     * @return ServiceResponse chứa danh sách lịch khám hoặc lỗi nếu có.
     */
    public ServiceResponse<?> getAll() {
        try {
            List<LichKhamDTO> list = lichKhamRepo.findAll().stream()
                    .map(LichKhamMapper::toDTO)
                    .toList();
            return ServiceResponse.success(NotificationCode.APPOINTMENT_LIST_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    /**
     * Lấy chi tiết lịch khám theo ID.
     *
     * @param id ID lịch khám
     * @return ServiceResponse chứa thông tin lịch khám nếu tìm thấy, ngược lại báo lỗi.
     */
    public ServiceResponse<?> getById(Integer id) {
        return lichKhamRepo.findById(id)
                .map(lk -> ServiceResponse.success(NotificationCode.APPOINTMENT_DETAIL_SUCCESS, LichKhamMapper.toDTO(lk)))
                .orElseGet(() -> ServiceResponse.error(NotificationCode.APPOINTMENT_NOT_FOUND));
    }

    /**
     * Cập nhật thông tin lịch khám theo ID.
     * Kiểm tra ràng buộc thời gian, trùng lịch, bác sĩ làm việc, và giờ hợp lệ với ca.
     *
     * @param id  ID lịch khám cần cập nhật
     * @param dto Dữ liệu mới từ client
     * @return ServiceResponse thông báo kết quả
     */
    @Transactional
    public ServiceResponse<?> update(Integer id, LichKhamDTO dto) {
        // Kiểm tra thời gian hợp lệ
        if (dto.getThoiGianHen() == null || dto.getThoiGianDen() == null || dto.getNgayKham() == null) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian khám không được để trống");
        }

        if (!dto.getThoiGianHen().isBefore(dto.getThoiGianDen())) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Thời gian hẹn phải trước thời gian đến");
        }

        if (dto.getNgayKham().isBefore(LocalDate.now())) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Không thể cập nhật lịch cho ngày đã qua");
        }

        // Kiểm tra bác sĩ có lịch làm việc trong ca đó không
        boolean isBacSiRanh = lichLamViecBacSiRepo.existsByBacSi_BacSiIdAndNgayAndCaTruc(
                dto.getBacSiId(), dto.getNgayKham(), dto.getCaKham()
        );
        if (!isBacSiRanh) {
            return ServiceResponse.error("APP_015",
                    "Bác sĩ không có lịch làm việc trong ca này");
        }

        // Kiểm tra trùng lịch
        if (lichKhamRepo.existsLichKhamTrung(
                dto.getBacSiId(), dto.getNgayKham(),
                dto.getThoiGianHen(), dto.getThoiGianDen(), id)) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_CONFLICT);
        }

        // Kiểm tra giờ hẹn có hợp lệ theo ca khám không
        LocalTime thoiGianHen = dto.getThoiGianHen().toLocalTime();
        String caKham = dto.getCaKham();
        if (!isThoiGianHopLeTheoCa(thoiGianHen, caKham)) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_INVALID_TIME,
                    "Giờ hẹn không phù hợp với ca khám đã chọn: " + caKham);
        }

        try {
            // Tìm lịch khám theo ID
            LichKham existing = lichKhamRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy lịch khám"));

            // Lấy thông tin bác sĩ và bệnh nhân
            BacSi bacSi = bacSiRepo.findById(dto.getBacSiId())
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));
            BenhNhan benhNhan = benhNhanRepo.findById(dto.getBenhNhanId())
                    .orElseThrow(() -> new RuntimeException("Bệnh nhân không tồn tại"));

            // Gán thông tin mới cho entity cũ
            existing.setBacSi(bacSi);
            existing.setBenhNhan(benhNhan);
            existing.setThoiGianHen(dto.getThoiGianHen());
            existing.setThoiGianDen(dto.getThoiGianDen());
            existing.setKieuLichKham(dto.getKieuLichKham());
            existing.setTrangThai(dto.getTrangThai());
            existing.setGhiChu(dto.getGhiChu());
            existing.setNgayKham(dto.getNgayKham());
            existing.setCaKham(dto.getCaKham());

            lichKhamRepo.save(existing);
            return ServiceResponse.success(NotificationCode.APPOINTMENT_UPDATE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_UPDATE_FAIL, e.getMessage());
        }
    }

    /**
     * Xóa lịch khám theo ID.
     *
     * @param id ID lịch khám cần xóa
     * @return ServiceResponse thông báo kết quả xóa
     */
    @Transactional
    public ServiceResponse<?> delete(Integer id) {
        try {
            LichKham lk = lichKhamRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy lịch khám"));

            lichKhamRepo.delete(lk);
            return ServiceResponse.success(NotificationCode.APPOINTMENT_DELETE_SUCCESS);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_DELETE_FAIL, e.getMessage());
        }
    }

    /**
     * Tìm kiếm lịch khám theo các tiêu chí lọc như bác sĩ, ngày, ca, trạng thái,...
     *
     * @param filter DTO chứa điều kiện lọc
     * @return ServiceResponse chứa danh sách kết quả hoặc thông báo không tìm thấy
     */
    public ServiceResponse<?> searchLichKham(LichKhamFilterDTO filter) {
        List<LichKham> result = lichKhamRepo.findAll(LichKhamSpecification.filterBy(filter));

        if (result.isEmpty()) {
            return ServiceResponse.error(NotificationCode.APPOINTMENT_NOT_FOUND);
        }

        List<LichKhamDTO> dtoList = result.stream()
                .map(LichKhamMapper::toDTO)
                .toList();

        return ServiceResponse.success(NotificationCode.APPOINTMENT_LIST_SUCCESS, dtoList);
    }

    /**
     * Thống kê số lượng lịch khám theo từng tháng của một năm.
     *
     * @param month tháng cần thống kê
     * @param year  năm cần thống kê
     * @return ServiceResponse chứa dữ liệu thống kê hoặc báo lỗi nếu không có dữ liệu
     */
    public ServiceResponse<?> thongKeTheoThang(int month, int year) {
        var raw = lichKhamRepo.thongKeTheoThang(month, year);
        if (raw.isEmpty()) {
            return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);
        }

        List<Map<String, Object>> result = raw.stream().map(row -> {
            Map<String, Object> map = new HashMap<>();
            map.put("thang", row[0]);
            map.put("soLuong", row[1]);
            return map;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_MONTHLY, result);
    }

    /**
     * Thống kê số lượng lịch khám theo từng bác sĩ.
     *
     * @return ServiceResponse chứa dữ liệu thống kê
     */
    public ServiceResponse<?> thongKeTheoBacSi() {
        var raw = lichKhamRepo.thongKeTheoBacSi();
        if (raw.isEmpty()) {
            return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);
        }

        List<Map<String, Object>> result = raw.stream().map(row -> {
            Map<String, Object> map = new HashMap<>();
            map.put("bacSiId", row[0]);
            map.put("soLuong", row[1]);
            return map;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_DOCTOR, result);
    }

    /**
     * Kiểm tra giờ hẹn có hợp lệ với ca khám đã chọn không.
     *
     * @param time   Giờ hẹn
     * @param caKham Ca khám ("SANG", "CHIEU")
     * @return true nếu giờ hợp lệ, false nếu không
     */
    private boolean isThoiGianHopLeTheoCa(LocalTime time, String caKham) {
        if ("SANG".equalsIgnoreCase(caKham)) {
            return !time.isBefore(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(12, 0));
        } else if ("CHIEU".equalsIgnoreCase(caKham)) {
            return !time.isBefore(LocalTime.of(13, 0)) && time.isBefore(LocalTime.of(18, 0));
        }
        return false;
    }

    /**
     * Lấy danh sách khung giờ còn trống của bác sĩ theo ngày và ca.
     *
     * @param bacSiId  ID bác sĩ
     * @param ngayKham Ngày khám
     * @param caKham   Ca khám ("SANG", "CHIEU")
     * @return Danh sách các khung giờ rảnh (DTO)
     */
    public List<GioKhamChiTietDto> getKhungGioRanh(Integer bacSiId, LocalDate ngayKham, String caKham) {
        List<GioKhamChiTiet> list = gioKhamChiTietRepo
                .findByLichLamViecBacSi_BacSi_BacSiIdAndLichLamViecBacSi_NgayAndLichLamViecBacSi_CaTruc(
                        bacSiId, ngayKham, caKham)
                .stream()
                .filter(GioKhamChiTiet::getTrangThai) // Chỉ lấy khung giờ có trạng thái còn trống
                .toList();

        return list.stream().map(GioKhamChiTietMapper::toDto).toList();
    }
}