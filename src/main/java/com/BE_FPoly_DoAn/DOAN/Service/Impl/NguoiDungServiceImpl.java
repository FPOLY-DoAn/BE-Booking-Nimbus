package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Override
    public NguoiDung findBySoDienThoai(String soDienThoai) {
        return nguoiDungRepository.findBySoDienThoai(soDienThoai).get();
    }

    @Override
    public UserDetails loadUserByUsername(String soDienThoai) throws UsernameNotFoundException {
        Optional<NguoiDung> nguoiDungOption = nguoiDungRepository.findBySoDienThoai(soDienThoai);
        if (nguoiDungOption.isEmpty()) {
            throw new UsernameNotFoundException("tài khoản không được tìm thấy");
        }
        User user = new User(nguoiDungOption.get().getSoDienThoai(), nguoiDungOption.get().getMatKhau(),toRolesAuthories(nguoiDungOption.get().getPhanQuyens()) );
        return user;
    }

    private Collection<? extends GrantedAuthority> toRolesAuthories(List<PhanQuyen> phanQuyens) {
        return phanQuyens.stream()
                .map(quyen -> new SimpleGrantedAuthority(quyen.getVaiTro().getTenVaiTro()))
                .collect(Collectors.toList());
    }


    @Override
    public List<NguoiDung> getAll() {
        return nguoiDungRepository.findAll();
    }

    @Override
    public Optional<NguoiDung> getById(Integer id) {
        return nguoiDungRepository.findById(id);
    }

    @Override
    public NguoiDung save(NguoiDung nguoiDung) {
        return nguoiDungRepository.save(nguoiDung);
    }

    @Override
    public void delete(Integer id) {
        nguoiDungRepository.findById(id).ifPresent(nguoiDungRepository::delete);
    }

    public Optional<NguoiDung> findByHoTen(String hoTen) {
        return nguoiDungRepository.findByHoTen(hoTen);
    }
}