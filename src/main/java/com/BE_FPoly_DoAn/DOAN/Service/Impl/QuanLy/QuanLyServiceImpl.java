package com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy;

import com.BE_FPoly_DoAn.DOAN.DTO.QuanLyDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.QuanLyRequestDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.QuanLyResponseDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.QuanLyRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import com.BE_FPoly_DoAn.DOAN.Entity.QuanLy;
import com.BE_FPoly_DoAn.DOAN.Entity.VaiTro;
import com.BE_FPoly_DoAn.DOAN.Mapper.QuanLyMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.PhanQuyenServiceImpl;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuanLyServiceImpl implements InterfaceService<QuanLy> {

    private final QuanLyRepository quanLyRepository;
    private final NguoiDungRepository nguoiDungService;
    private final VaiTroRepository vaiTroRepository;
    private final PhanQuyenServiceImpl phanQuyenServiceImpl;
    private final BCryptPasswordEncoder passwordEncoder;

    public QuanLyServiceImpl(
            QuanLyRepository quanLyRepository,
            NguoiDungRepository nguoiDungService,
            VaiTroRepository vaiTroRepository,
            PhanQuyenServiceImpl phanQuyenServiceImpl,
            BCryptPasswordEncoder passwordEncoder
    ) {
        this.quanLyRepository = quanLyRepository;
        this.nguoiDungService = nguoiDungService;
        this.vaiTroRepository = vaiTroRepository;
        this.phanQuyenServiceImpl = phanQuyenServiceImpl;
        this.passwordEncoder = passwordEncoder;
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
    @Transactional
    public void delete(QuanLy quanLy) {
        if (quanLy == null) {
            throw new IllegalArgumentException("Quản lý không được null");
        }

        NguoiDung nguoiDung = quanLy.getNguoiDung();
        if (nguoiDung != null) {
            phanQuyenServiceImpl.deleteByNguoiDung(nguoiDung);
            nguoiDungService.delete(nguoiDung);
        }

        quanLyRepository.delete(quanLy);
    }

    public ServiceResponse<?> getAllResponse() {
        try {
            List<QuanLyResponseDTO> list = quanLyRepository.findAll().stream()
                    .map(QuanLyMapper::toResponseDto)
                    .toList();
            return ServiceResponse.success(NotificationCode.MANAGER_LIST_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getByIdResponse(Integer nguoiDungId) {
        try {
            return quanLyRepository.findById(nguoiDungId)
                    .map(QuanLyMapper::toResponseDto)
                    .map(dto -> ServiceResponse.success(NotificationCode.MANAGER_FOUND, dto))
                    .orElse(ServiceResponse.error(NotificationCode.MANAGER_NOT_FOUND));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> create(QuanLyRequestDTO dto) {
        try {

            if (nguoiDungService.existsByEmail(dto.getEmail())) {
                return ServiceResponse.error(NotificationCode.EMAIL_DUPLICATE);
            }

            if (nguoiDungService.existsBySoDienThoai(dto.getSoDienThoai())) {
                return ServiceResponse.error(NotificationCode.PHONE_DUPLICATE);
            }

            QuanLy entity = QuanLyMapper.toEntity(dto);

            if (dto.getMatKhau() != null && !dto.getMatKhau().isBlank()) {
                String encoded = passwordEncoder.encode(dto.getMatKhau());
                if (entity.getNguoiDung() != null) {
                    entity.getNguoiDung().setMatKhau(encoded);
                }
            }

            QuanLy saved = quanLyRepository.save(entity);

            VaiTro vaiTro = vaiTroRepository.findByTenVaiTro("Quản lý")
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));
            phanQuyenServiceImpl.save(new PhanQuyen(vaiTro, saved.getNguoiDung()));

            return ServiceResponse.success(NotificationCode.MANAGER_CREATE_SUCCESS, QuanLyMapper.toResponseDto(saved));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> update(Integer id, QuanLyRequestDTO dto) {
        try {
            QuanLy existing = quanLyRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Quản lý không tồn tại"));

            if (!existing.getNguoiDung().getEmail().equals(dto.getEmail())
                    && nguoiDungService.existsByEmail(dto.getEmail())) {
                return ServiceResponse.error(NotificationCode.EMAIL_DUPLICATE);
            }

            QuanLyMapper.updateEntity(existing, dto, false);

            QuanLy saved = quanLyRepository.save(existing);

            return ServiceResponse.success(NotificationCode.MANAGER_UPDATE_SUCCESS, QuanLyMapper.toResponseDto(saved));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> createNguoiDungAndQuanLy(@Valid QuanLyDTO dto) {
        try {
            NguoiDung nguoiDung = NguoiDung.builder()
                    .hoTen(dto.getHoTen())
                    .email(dto.getEmail())
                    .soDienThoai(dto.getSoDienThoai())
                    .gioiTinh(dto.getGioiTinh())
                    .matKhau(passwordEncoder.encode(dto.getMatKhau()))
                    .build();
            nguoiDungService.save(nguoiDung);

            QuanLy quanLy = QuanLy.builder()
                    .nguoiDung(nguoiDung)
                    .ghiChu(dto.getGhiChu())
                    .build();
            quanLyRepository.save(quanLy);

            VaiTro vaiTro = vaiTroRepository.findByTenVaiTro("Quản lý")
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));

            phanQuyenServiceImpl.save(new PhanQuyen(vaiTro, nguoiDung));

            return ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS);
        } catch (RuntimeException e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }
}