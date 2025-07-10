package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.DTO.ThongKeNgayNghiDTO;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Dao.DonNghiPhepRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThongKeDonNghiPhepService {

    private final DonNghiPhepRepository repository;

    public ThongKeDonNghiPhepService(DonNghiPhepRepository repository) {
        this.repository = repository;
    }

    public ServiceResponse<?> thongKeChoQuanLy(int nam) {
        try {
            List<ThongKeNgayNghiDTO> result = repository.thongKeSoDonNghiTheoNam(nam);
            return ServiceResponse.success(NotificationCode.SERVICE_LIST, result);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVICE_UNAVAILABLE);
        }
    }

    public ServiceResponse<?> thongKeCaNhanBacSi(int bacSiId, int nam) {
        try {
            long tongSoDon = repository.findByBacSiAndNam(bacSiId, nam).size();
            ThongKeNgayNghiDTO dto = ThongKeNgayNghiDTO.builder()
                    .bacSiId(bacSiId)
                    .soDonNghi(tongSoDon)
                    .build();
            return ServiceResponse.success(NotificationCode.SERVICE_LIST, dto);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVICE_UNAVAILABLE);
        }
    }
}