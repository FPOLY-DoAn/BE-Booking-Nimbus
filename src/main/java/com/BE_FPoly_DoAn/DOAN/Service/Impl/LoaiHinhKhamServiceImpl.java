package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LoaiHinhKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LoaiHinhKham;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiHinhKhamServiceImpl implements InterfaceService<LoaiHinhKham> {

    private final LoaiHinhKhamRepository repo;

    public LoaiHinhKhamServiceImpl(LoaiHinhKhamRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<LoaiHinhKham> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<LoaiHinhKham> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public LoaiHinhKham save(LoaiHinhKham entity) {
        return repo.save(entity);
    }

    @Override
    public void delete(LoaiHinhKham entity) {
        repo.deleteById(entity.getLoaiId());
    }

    public boolean existsByTenDichVu(String tenLoai) {
        return repo.existsByTenLoai(tenLoai);
    }
}