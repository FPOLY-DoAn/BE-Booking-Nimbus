package com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy;

import com.BE_FPoly_DoAn.DOAN.DTO.QuanLyDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.QuanLyRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.PhanQuyenServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import jakarta.validation.Valid;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class QuanLyServiceImpl implements InterfaceService<QuanLy> {

    private final NguoiDungRepository nguoiDungService;
    private final QuanLyRepository quanLyRepository;
    private final PhanQuyenServiceImpl phanQuyenService;
    private final VaiTroRepository vaiTroRepository;
    public QuanLyServiceImpl(NguoiDungRepository nguoiDungService, QuanLyRepository quanLyRepository, PhanQuyenServiceImpl phanQuyenService, VaiTroRepository vaiTroRepository) {
        this.nguoiDungService = nguoiDungService;
        this.quanLyRepository = quanLyRepository;
        this.phanQuyenService = phanQuyenService;
        this.vaiTroRepository = vaiTroRepository;
    }

    @Override
    public List<QuanLy> getAll() {
        return quanLyRepository.findAll();
    }

    @Override
    public Optional<QuanLy> getById(Integer id) {
        return quanLyRepository.findById(id);
    }

    @Override
    public QuanLy save(QuanLy quanLy) {
        return quanLyRepository.save(quanLy);
    }

    @Override
    public void delete(QuanLy quanLy) {
        quanLyRepository.delete(quanLy);
    }

    public ServiceResponse<?> createNguoiDungAndQuanLy(@Valid QuanLyDTO quanLyDTO) {
        try {
            NguoiDung nguoiDung = NguoiDung.builder().hoTen(quanLyDTO.getHoTen())
                    .email(quanLyDTO.getEmail()).soDienThoai(quanLyDTO.getSoDienThoai()).matKhau(new BCryptPasswordEncoder().encode(quanLyDTO.getMatKhau()))
                    .gioiTinh(quanLyDTO.getGioiTinh()).build();
            nguoiDungService.save(nguoiDung);
            QuanLy quanLy = QuanLy.builder().nguoiDung(nguoiDung)
                    .chucVu(quanLyDTO.getChucVu()).ghiChu(quanLyDTO.getGhiChu())
                    .ngayTao(LocalDate.now())
                    .ngayCapNhat(LocalDate.now())
                    .build();
            quanLyRepository.save(quanLy);
            VaiTro vaiTro = vaiTroRepository.findById(1)
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));

            phanQuyenService.save(new PhanQuyen(vaiTro, nguoiDung));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS.code(),NotificationCode.USER_REGISTER_SUCCESS.message());
    }
}