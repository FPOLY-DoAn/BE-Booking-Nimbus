package com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy;

import com.BE_FPoly_DoAn.DOAN.Dao.ThongKeRepository;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ThongKeServiceImpl {

    private final ThongKeRepository thongKeRepo;

    public ThongKeServiceImpl(ThongKeRepository thongKeRepo) {
        this.thongKeRepo = thongKeRepo;
    }

    public ServiceResponse<?> thongKeBenhNhanTheoGioiTinh() {
        var raw = thongKeRepo.thongKeBenhNhanTheoGioiTinh();
        if (raw.isEmpty()) return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);

        List<Map<String, Object>> result = raw.stream().map(r -> {
            Map<String, Object> m = new HashMap<>();
            m.put("gioiTinh", r[0]);
            m.put("soLuong", r[1]);
            return m;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_BY_GENDER, result);
    }

    public ServiceResponse<?> thongKeDoanhThuTheoThang() {
        var raw = thongKeRepo.thongKeDoanhThuTheoThang();
        if (raw.isEmpty()) return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);

        List<Map<String, Object>> result = raw.stream().map(r -> {
            Map<String, Object> m = new HashMap<>();
            m.put("nam", r[0]);
            m.put("thang", r[1]);
            m.put("doanhThu", r[2]);
            return m;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_REVENUE_BY_MONTH, result);
    }

    public ServiceResponse<?> thongKeDonThuocTheoThang() {
        var raw = thongKeRepo.thongKeDonThuocTheoThang();
        if (raw.isEmpty()) return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);

        List<Map<String, Object>> result = raw.stream().map(r -> {
            Map<String, Object> m = new HashMap<>();
            m.put("nam", r[0]);
            m.put("thang", r[1]);
            m.put("soDonThuoc", r[2]);
            return m;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_PRESCRIPTIONS_BY_MONTH, result);
    }

    public ServiceResponse<?> thongKeSoLuongBenhTheoTen() {
        var raw = thongKeRepo.thongKeSoLuongBenhTheoTen();
        if (raw.isEmpty()) return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);

        List<Map<String, Object>> result = raw.stream().map(r -> {
            Map<String, Object> m = new HashMap<>();
            m.put("tenBenh", r[0]);
            m.put("soLuong", r[1]);
            return m;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_DISEASES, result);
    }

    public ServiceResponse<?> thongKeHoaDonTheoDichVu() {
        var raw = thongKeRepo.thongKeHoaDonTheoDichVu();
        if (raw.isEmpty()) return ServiceResponse.error(NotificationCode.STATISTICS_EMPTY);

        List<Map<String, Object>> result = raw.stream().map(r -> {
            Map<String, Object> m = new HashMap<>();
            m.put("tenDichVu", r[0]);
            m.put("tongSoLuong", r[1]);
            m.put("tongDoanhThu", r[2]);
            return m;
        }).toList();

        return ServiceResponse.success(NotificationCode.STATISTICS_SERVICE_REVENUE, result);
    }
}