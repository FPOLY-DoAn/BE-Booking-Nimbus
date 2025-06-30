package com.BE_FPoly_DoAn.DOAN.Service.Impl.LeTan;

import com.BE_FPoly_DoAn.DOAN.Dao.LichLamViecLeTanRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecLeTan;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LichLamViecLeTanServiceImpl implements InterfaceService<LichLamViecLeTan> {

    private final LichLamViecLeTanRepository repository;

    public LichLamViecLeTanServiceImpl(LichLamViecLeTanRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<LichLamViecLeTan> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<LichLamViecLeTan> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public LichLamViecLeTan save(LichLamViecLeTan entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(LichLamViecLeTan entity) {
        repository.delete(entity);
    }
}