package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.ChuyenKhoaRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChuyenKhoaServiceImpl implements InterfaceService<ChuyenKhoa> {

    private final ChuyenKhoaRepository chuyenKhoaRepository;

    public ChuyenKhoaServiceImpl(ChuyenKhoaRepository chuyenKhoaRepository) {
        this.chuyenKhoaRepository = chuyenKhoaRepository;
    }

    @Override
    public List<ChuyenKhoa> getAll() {
        return chuyenKhoaRepository.findAll();
    }

    @Override
    public Optional<ChuyenKhoa> getById(Integer id) {
        return chuyenKhoaRepository.findById(id);
    }

    @Override
    public ChuyenKhoa save(ChuyenKhoa chuyenKhoa) {
        return chuyenKhoaRepository.save(chuyenKhoa);
    }

    @Override
    public void delete(ChuyenKhoa chuyenKhoa) {
        chuyenKhoaRepository.deleteById(chuyenKhoa.getChuyenKhoaId());
    }
}