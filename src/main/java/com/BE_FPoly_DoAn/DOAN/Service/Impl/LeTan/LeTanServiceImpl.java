package com.BE_FPoly_DoAn.DOAN.Service.Impl.LeTan;

import com.BE_FPoly_DoAn.DOAN.DTO.LeTanDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.LeTanRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LeTan;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import com.BE_FPoly_DoAn.DOAN.Entity.VaiTro;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.PhanQuyenServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LeTanServiceImpl implements InterfaceService<LeTan> {

    private final LeTanRepository leTanRepository;
    private final PhanQuyenServiceImpl phanQuyenService;
    private final NguoiDungRepository nguoiDungRepository;
    private final VaiTroRepository vaiTroRepository;

    public LeTanServiceImpl( PhanQuyenServiceImpl phanQuyenService, VaiTroRepository vaiTroRepository, LeTanRepository leTanRepository, NguoiDungRepository nguoiDungRepository) {
        this.leTanRepository = leTanRepository;
        this.nguoiDungRepository = nguoiDungRepository;
        this.vaiTroRepository = vaiTroRepository;
        this.phanQuyenService = phanQuyenService;
    }

    @Override
    public List<LeTan> getAll() {
        return leTanRepository.findAll();
    }

    @Override
    public Optional<LeTan> getById(Integer id) {
        return leTanRepository.findById(id);
    }

    @Override
    public LeTan save(LeTan leTan) {
        return leTanRepository.save(leTan);
    }

    @Override
    public void delete(LeTan leTan) {
        leTanRepository.delete(leTan);
    }


    @Transactional
    public ServiceResponse<?> createNguoiDungAndLeTan(LeTanDTO leTanDTO) {
        try {
            NguoiDung nguoiDung = NguoiDung.builder().hoTen(leTanDTO.getHoTen())
                    .email(leTanDTO.getEmail()).matKhau(new BCryptPasswordEncoder().encode(leTanDTO.getMatKhau()))
                    .soDienThoai(leTanDTO.getSoDienThoai())
                    .gioiTinh(leTanDTO.getGioiTinh()).build();
            nguoiDungRepository.save(nguoiDung);
            LeTan leTan = LeTan.builder().nguoiDung(nguoiDung).
                    ghiChu(leTanDTO.getGhiChu()).trangThaiHoatDong(leTanDTO.getTrangThaiHoatDong())
                    .chucVu(leTanDTO.getChucVu())
                    .ngayTuyenDung(leTanDTO.getNgayTuyenDung()).build();
            leTanRepository.save(leTan);
            VaiTro vaiTro = vaiTroRepository.findById(4)
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));

            phanQuyenService.save(new PhanQuyen(vaiTro, nguoiDung));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return ServiceResponse.success("200", "Tạo tài khoản thành công");
    }


}