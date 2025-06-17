package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.List;
import java.util.Optional;

public interface NguoiDungService extends UserDetailsService {

    public NguoiDung findBySoDienThoai(String soDienThoai);

    List<NguoiDung> getAll();

    Optional<NguoiDung> getById(Integer id);

    ServiceResponse<?> save(int otp);

    ServiceResponse<?> delete(Integer id);
}