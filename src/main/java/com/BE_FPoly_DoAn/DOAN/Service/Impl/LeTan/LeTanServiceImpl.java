package com.BE_FPoly_DoAn.DOAN.Service.Impl.LeTan;

import com.BE_FPoly_DoAn.DOAN.DTO.LeTanDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LeTanRequestDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LeTanResponseDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.LeTanRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Mapper.LeTanMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
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
    private final BCryptPasswordEncoder passwordEncoder;

    public LeTanServiceImpl(PhanQuyenServiceImpl phanQuyenService, VaiTroRepository vaiTroRepository, LeTanRepository leTanRepository, NguoiDungRepository nguoiDungRepository, BCryptPasswordEncoder passwordEncoder) {
        this.leTanRepository = leTanRepository;
        this.nguoiDungRepository = nguoiDungRepository;
        this.vaiTroRepository = vaiTroRepository;
        this.phanQuyenService = phanQuyenService;
        this.passwordEncoder = passwordEncoder;
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

    public ServiceResponse<?> getAllResponse() {
        try {
            List<LeTanResponseDTO> list = leTanRepository.findAll().stream()
                    .map(LeTanMapper::toResponseDto)
                    .toList();
            return ServiceResponse.success(NotificationCode.RECEPTIONIST_LIST_SUCCESS, list);
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> getByIdResponse(Integer nguoiDungId) {
        try {
            return leTanRepository.findById(nguoiDungId)
                    .map(LeTanMapper::toResponseDto)
                    .map(dto -> ServiceResponse.success(NotificationCode.RECEPTIONIST_FOUND, dto))
                    .orElse(ServiceResponse.error(NotificationCode.RECEPTIONIST_NOT_FOUND));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> create(LeTanRequestDTO dto) {
        try {

            if (nguoiDungRepository.existsByEmail(dto.getEmail())) {
                return ServiceResponse.error(NotificationCode.EMAIL_DUPLICATE);
            }

            if (nguoiDungRepository.existsBySoDienThoai(dto.getSoDienThoai())) {
                return ServiceResponse.error(NotificationCode.PHONE_DUPLICATE);
            }

            LeTan entity = LeTanMapper.toEntity(dto);

            if (dto.getMatKhau() != null && !dto.getMatKhau().isBlank()) {
                String encoded = passwordEncoder.encode(dto.getMatKhau());
                if (entity.getNguoiDung() != null) {
                    entity.getNguoiDung().setMatKhau(encoded);
                }
            }

            LeTan saved = leTanRepository.save(entity);

            VaiTro vaiTro = vaiTroRepository.findByTenVaiTro("Lễ tân")
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));
            phanQuyenService.save(new PhanQuyen(vaiTro, saved.getNguoiDung()));

            return ServiceResponse.success(NotificationCode.RECEPTIONIST_CREATE_SUCCESS, LeTanMapper.toResponseDto(saved));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    public ServiceResponse<?> update(Integer nguoiDungId, LeTanRequestDTO dto) {
        try {

            LeTan existing = leTanRepository.findById(nguoiDungId)
                    .orElseThrow(() -> new RuntimeException("Lễ tân không tồn tại"));

            if (!existing.getNguoiDung().getEmail().equals(dto.getEmail())
                    && nguoiDungRepository.existsByEmail(dto.getEmail())) {
                return ServiceResponse.error(NotificationCode.EMAIL_DUPLICATE);
            }

            LeTanMapper.updateEntity(existing, dto, false);

            LeTan saved = leTanRepository.save(existing);

            return ServiceResponse.success(NotificationCode.RECEPTIONIST_UPDATE_SUCCESS, LeTanMapper.toResponseDto(saved));
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }

    @Transactional
    public ServiceResponse<?> createNguoiDungAndLeTan(LeTanDTO leTanDTO) {
        try {
            NguoiDung nguoiDung = NguoiDung.builder()
                    .hoTen(leTanDTO.getHoTen())
                    .email(leTanDTO.getEmail())
                    .matKhau(passwordEncoder.encode(leTanDTO.getMatKhau()))
                    .soDienThoai(leTanDTO.getSoDienThoai())
                    .gioiTinh(leTanDTO.getGioiTinh())
                    .build();
            nguoiDungRepository.save(nguoiDung);

            LeTan leTan = LeTan.builder()
                    .nguoiDung(nguoiDung)
                    .ghiChu(leTanDTO.getGhiChu())
                    .trangThaiHoatDong(leTanDTO.getTrangThaiHoatDong())
                    .chucVu(leTanDTO.getChucVu())
                    .ngayTuyenDung(leTanDTO.getNgayTuyenDung())
                    .build();
            leTanRepository.save(leTan);

            VaiTro vaiTro = vaiTroRepository.findByTenVaiTro("Lễ tân")
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));

            phanQuyenService.save(new PhanQuyen(vaiTro, nguoiDung));

            return ServiceResponse.success("200", "Tạo tài khoản thành công");
        } catch (Exception e) {
            return ServiceResponse.error(NotificationCode.SERVER_ERROR, e.getMessage());
        }
    }
}