package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.HoSoBenhAnRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.HoSoBenhAn;
import com.BE_FPoly_DoAn.DOAN.Service.HoSoBenhAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoSoBenhAnServiceImpl implements HoSoBenhAnService {

    @Autowired
    private HoSoBenhAnRepository hoSoBenhAnRepository;

    @Override
    public List<HoSoBenhAn> getAll() {
        return hoSoBenhAnRepository.findAll();
    }

    @Override
    public Optional<HoSoBenhAn> getById(Integer id) {
        return hoSoBenhAnRepository.findById(id);
    }

    @Override
    public HoSoBenhAn save(HoSoBenhAn hoSoBenhAn) {
        return hoSoBenhAnRepository.save(hoSoBenhAn);
    }

    @Override
    public void delete(Integer id) {
        hoSoBenhAnRepository.findById(id).ifPresent(hoSoBenhAnRepository::delete);
    }
}