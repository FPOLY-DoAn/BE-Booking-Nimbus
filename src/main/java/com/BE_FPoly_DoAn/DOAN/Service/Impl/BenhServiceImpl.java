package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.BenhRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.Benh;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenhServiceImpl implements InterfaceService<Benh> {

    private final BenhRepository benhRepository;

    public BenhServiceImpl(BenhRepository benhRepository) {
        this.benhRepository = benhRepository;
    }

    @Override
    public List<Benh> getAll() {
        return benhRepository.findAll();
    }

    @Override
    public Optional<Benh> getById(Integer id) {
        return benhRepository.findById(id);
    }

    @Override
    public Benh save(Benh Benh) {
        return benhRepository.save(Benh);
    }

    @Override
    public void delete(Benh id) {

    }

}