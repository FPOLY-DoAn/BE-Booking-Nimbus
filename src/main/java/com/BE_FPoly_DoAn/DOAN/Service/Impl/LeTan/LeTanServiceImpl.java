package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LeTanRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LeTan;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeTanServiceImpl implements InterfaceService<LeTan> {

    @Autowired
    private LeTanRepository leTanRepository;

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
}