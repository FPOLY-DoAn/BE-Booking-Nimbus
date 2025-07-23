package com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.BacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.ChuyenKhoaServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.PhanQuyenServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BacSiServiceImpl implements InterfaceService<BacSi> {

    private final BacSiRepository bacSiRepository;
    private final NguoiDungServiceImpl nguoiDungService;
    private final VaiTroRepository vaiTroRepository;
    private final PhanQuyenServiceImpl phanQuyenServiceImpl;
    private final ChuyenKhoaServiceImpl chuyenKhoaServiceImpl;


    public BacSiServiceImpl(ChuyenKhoaServiceImpl chuyenKhoaServiceImpl, PhanQuyenServiceImpl phanQuyenServiceImpl, VaiTroRepository vaiTroRepository, BacSiRepository bacSiRepository, NguoiDungServiceImpl nguoiDungService) {
        this.bacSiRepository = bacSiRepository;
        this.nguoiDungService = nguoiDungService;
        this.vaiTroRepository = vaiTroRepository;
        this.phanQuyenServiceImpl = phanQuyenServiceImpl;
        this.chuyenKhoaServiceImpl = chuyenKhoaServiceImpl;
    }

    @Override
    public List<BacSi> getAll() {
        return bacSiRepository.findAll();
    }

    @Override
    public Optional<BacSi> getById(Integer id) {
        return bacSiRepository.findById(id);
    }

    @Override
    public BacSi save(BacSi bacSi) {
        return bacSiRepository.save(bacSi);
    }

    @Override
    @Transactional
    public void delete(BacSi bacSi) {
        if (bacSi == null) {
            throw new IllegalArgumentException("Bác sĩ không được null");
        }
        if (bacSi.getLichKhams() == null || bacSi.getLichKhams().isEmpty()) {
            NguoiDung nguoiDung = bacSi.getNguoiDung();
            if (nguoiDung != null) {
                phanQuyenServiceImpl.deleteByNguoiDung(nguoiDung);
                nguoiDungService.delete(nguoiDung);
            }
        }
        bacSiRepository.delete(bacSi);
    }

    public ServiceResponse<?> createNguoiDungAndBacSi(@Valid BacSiDTO bacSiDTO) {
        try {
            NguoiDung nguoiDung = NguoiDung.builder().hoTen(bacSiDTO.getHoTen())
                    .email(bacSiDTO.getEmail()).soDienThoai(bacSiDTO.getSoDienThoai())
                    .gioiTinh(bacSiDTO.getGioiTinh()).build();
            nguoiDungService.save(nguoiDung);
            BacSi bacSi = BacSi.builder().nguoiDung(nguoiDung).
                    chungChi(bacSiDTO.getChungChi()).trinhDo(bacSiDTO.getTrinhDo())
                    .chuyenKhoa(chuyenKhoaServiceImpl.getById(bacSiDTO.getChuyenKhoaId()).get())
                    .kinhNghiem(bacSiDTO.getKinhNghiem())
                    .ngayTuyenDung(bacSiDTO.getNgayTuyenDung())
                    .ghiChu(bacSiDTO.getGhiChu())
                    .trangThaiHoatDong(bacSiDTO.getTrangThaiHoatDong())
                    .build();
            bacSiRepository.save(bacSi);
            VaiTro vaiTro = vaiTroRepository.findById(1)
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));

            phanQuyenServiceImpl.save(new PhanQuyen(vaiTro, nguoiDung));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS.code(),NotificationCode.USER_REGISTER_SUCCESS.message());
    }

    public Optional<BacSi> getByNguoiDungId(Integer nguoiDungId) {
        return bacSiRepository.findByNguoiDungId(nguoiDungId);
    }
}