package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {



    @Autowired
    private NguoiDungRepository nguoiDungRepository;

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

    public Optional<NguoiDung> findByName(String hoTen){
       return nguoiDungRepository.findByHoten(hoTen);
    }
}