package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.DichVuRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;
import com.BE_FPoly_DoAn.DOAN.Service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuService {

    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public List<DichVu> getAll() {
        return dichVuRepository.findAll();
    }

    @Override
    public Optional<DichVu> getById(Integer id) {
        return dichVuRepository.findById(id);
    }

    @Override
    public DichVu save(DichVu DichVu) {
        return dichVuRepository.save(DichVu);
    }

    @Override
    public void delete(Integer id) {
        dichVuRepository.findById(id).ifPresent(dichVuRepository::delete);
    }
}