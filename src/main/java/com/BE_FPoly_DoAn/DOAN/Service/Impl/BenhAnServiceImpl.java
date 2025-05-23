package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.BenhAnRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhAn;
import com.BE_FPoly_DoAn.DOAN.Service.BenhAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenhAnServiceImpl implements BenhAnService {

    @Autowired
    private BenhAnRepository benhAnRepository;

    @Override
    public List<BenhAn> getAll() {
        return benhAnRepository.findAll();
    }

    @Override
    public Optional<BenhAn> getById(Integer id) {
        return benhAnRepository.findById(id);
    }

    @Override
    public BenhAn save(BenhAn BenhAn) {
        return benhAnRepository.save(BenhAn);
    }

    @Override
    public void delete(Integer id) {
        benhAnRepository.findById(id).ifPresent(benhAnRepository::delete);
    }
}