package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LoaiHinhKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiHinhKhamServiceImpl implements InterfaceService<DichVu> {

    private final LoaiHinhKhamRepository repo;

    public LoaiHinhKhamServiceImpl(LoaiHinhKhamRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<DichVu> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<DichVu> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public DichVu save(DichVu entity) {
        return repo.save(entity);
    }

    @Override
    public void delete(DichVu entity) {
        repo.deleteById(entity.getDichVuId());
    }
}