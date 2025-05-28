package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.ChuyenKhoaRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;
import com.BE_FPoly_DoAn.DOAN.Service.ChuyenKhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChuyenKhoaServiceImpl implements ChuyenKhoaService {

    @Autowired
    private ChuyenKhoaRepository chuyenKhoaRepository;

    @Override
    public List<ChuyenKhoa> getAll() {
        return chuyenKhoaRepository.findAll();
    }

    @Override
    public Optional<ChuyenKhoa> getById(Integer id) {
        return chuyenKhoaRepository.findById(id);
    }

    @Override
    public ChuyenKhoa save(ChuyenKhoa ChuyenKhoa) {
        return chuyenKhoaRepository.save(ChuyenKhoa);
    }

    @Override
    public void delete(Integer id) {
        chuyenKhoaRepository.findById(id).ifPresent(chuyenKhoaRepository::delete);
    }
}