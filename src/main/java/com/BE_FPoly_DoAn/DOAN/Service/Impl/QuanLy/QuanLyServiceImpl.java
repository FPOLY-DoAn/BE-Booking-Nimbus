package com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy;

import com.BE_FPoly_DoAn.DOAN.Dao.QuanLyRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.QuanLy;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuanLyServiceImpl implements InterfaceService<QuanLy> {

    private final QuanLyRepository quanLyRepository;

    public QuanLyServiceImpl(QuanLyRepository quanLyRepository) {
        this.quanLyRepository = quanLyRepository;
    }

    @Override
    public List<QuanLy> getAll() {
        return quanLyRepository.findAll();
    }

    @Override
    public Optional<QuanLy> getById(Integer id) {
        return quanLyRepository.findById(id);
    }

    @Override
    public QuanLy save(QuanLy quanLy) {
        return quanLyRepository.save(quanLy);
    }

    @Override
    public void delete(QuanLy quanLy) {
        quanLyRepository.delete(quanLy);
    }
}