package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.BacSiRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BacSiServiceImpl implements InterfaceService<BacSi> {

    @Autowired
    private BacSiRepository bacSiRepository;

    @Override
    public List<BacSi> getAll() {
        return bacSiRepository.findAll();
    }

    @Override
    public Optional<BacSi> getById(Integer id) {
        return bacSiRepository.findById(id);
    }

    @Override
    public BacSi save(BacSi bacSi) {
        return bacSiRepository.save(bacSi);
    }

    @Override
    public void delete(BacSi id) {

    }

}