package com.BE_FPoly_DoAn.DOAN.Service;

import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface NguoiDungService {


    List<NguoiDung> getAll();

    Optional<NguoiDung> getById(Integer id);


    NguoiDung save(NguoiDung nguoiDung);

    void delete(Integer id);
}