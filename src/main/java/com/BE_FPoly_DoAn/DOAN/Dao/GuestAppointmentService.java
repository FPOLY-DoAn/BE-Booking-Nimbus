package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;

import java.time.LocalDate;

public interface GuestAppointmentService {
    ServiceResponse<?> getAllChuyenKhoa();
    ServiceResponse<?> getBacSiTheoChuyenKhoa(String tenKhoa);
    ServiceResponse<?> getNgayLamViec(Integer bacSiId);
    ServiceResponse<?> getCaLamViec(Integer bacSiId, LocalDate ngay);
    ServiceResponse<?> getGioTrongTheoCa(Integer bacSiId, LocalDate ngay, String ca);

    ServiceResponse<?> getLichKhamTrongTheoChuyenKhoa(String tenKhoa);

    ServiceResponse<?> getGioTrongTheoChuyenKhoa(String tenKhoa, LocalDate ngay, String ca);
}