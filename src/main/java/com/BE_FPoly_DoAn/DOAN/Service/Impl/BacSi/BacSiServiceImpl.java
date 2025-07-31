package com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSiRequestDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.BacSiResponseDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.BacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Mapper.BacSiMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.ChuyenKhoaServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.NguoiDungServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.PhanQuyenServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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

    public BacSiServiceImpl(ChuyenKhoaServiceImpl chuyenKhoaServiceImpl,
                            PhanQuyenServiceImpl phanQuyenServiceImpl,
                            VaiTroRepository vaiTroRepository,
                            BacSiRepository bacSiRepository,
                            NguoiDungServiceImpl nguoiDungService) {
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

    public Optional<BacSi> getByNguoiDungId(Integer nguoiDungId) {
        return bacSiRepository.findByNguoiDungId(nguoiDungId);
    }

    public ServiceResponse<?> getAllResponse() {
        try {
            List<BacSiResponseDTO> list = bacSiRepository.findAll().stream()
                    .map(BacSiMapper::toResponseDto)
                    .toList();
            return ServiceResponse.success(NotificationCode.DOCTOR_LIST_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getByIdResponse(Integer id) {
        try {
            return bacSiRepository.findById(id)
                    .map(BacSiMapper::toResponseDto)
                    .map(dto -> ServiceResponse.success(NotificationCode.DOCTOR_FOUND, dto))
                    .orElse(ServiceResponse.error(NotificationCode.DOCTOR_NOT_FOUND));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> create(BacSiRequestDTO dto) {
        try {
            ChuyenKhoa ck = chuyenKhoaServiceImpl.getByTen(dto.getTenKhoa())
                    .orElseThrow(() -> new IllegalArgumentException("Chuyên khoa không tồn tại"));

            BacSi entity = BacSiMapper.toEntity(dto, ck);
            BacSi saved = bacSiRepository.save(entity);

            return ServiceResponse.success(NotificationCode.DOCTOR_CREATE_SUCCESS, BacSiMapper.toResponseDto(saved));
        } catch (IllegalArgumentException e) {
            return ServiceResponse.error(NotificationCode.SPECIALTY_NOT_FOUND);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> update(Integer id, BacSiRequestDTO dto) {
        try {
            BacSi existing = bacSiRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Bác sĩ không tồn tại"));

            ChuyenKhoa ck = chuyenKhoaServiceImpl.getByTen(dto.getTenKhoa())
                    .orElseThrow(() -> new IllegalArgumentException("Chuyên khoa không tồn tại"));

            BacSiMapper.updateEntity(existing, dto, ck);
            BacSi saved = bacSiRepository.save(existing);

            return ServiceResponse.success(NotificationCode.DOCTOR_UPDATE_SUCCESS, BacSiMapper.toResponseDto(saved));
        } catch (IllegalArgumentException e) {
            return ServiceResponse.error(NotificationCode.SPECIALTY_NOT_FOUND);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> createNguoiDungAndBacSi(@Valid BacSiDTO bacSiDTO) {
        try {
            NguoiDung nguoiDung = NguoiDung.builder()
                    .hoTen(bacSiDTO.getHoTen())
                    .email(bacSiDTO.getEmail())
                    .soDienThoai(bacSiDTO.getSoDienThoai())
                    .gioiTinh(bacSiDTO.getGioiTinh())
                    .build();

            nguoiDungService.save(nguoiDung);

            BacSi bacSi = BacSi.builder()
                    .nguoiDung(nguoiDung)
                    .chungChi(bacSiDTO.getChungChi())
                    .trinhDo(bacSiDTO.getTrinhDo())
                    .kinhNghiem(bacSiDTO.getKinhNghiem())
                    .ngayTuyenDung(bacSiDTO.getNgayTuyenDung())
                    .ghiChu(bacSiDTO.getGhiChu())
                    .trangThaiHoatDong(bacSiDTO.getTrangThaiHoatDong())
                    .chuyenKhoa(chuyenKhoaServiceImpl.getById(bacSiDTO.getChuyenKhoaId()).get())
                    .build();

            bacSiRepository.save(bacSi);

            VaiTro vaiTro = vaiTroRepository.findById(1)
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));

            phanQuyenServiceImpl.save(new PhanQuyen(vaiTro, nguoiDung));

            return ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS);
        } catch (RuntimeException e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }
}