package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.LichPhongKhamRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.LichPhongKham;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LichPhongKhamServiceImpl implements InterfaceService<LichPhongKham> {

    @Autowired
    private LichPhongKhamRepository lichPhongKhamRepository;

    @Override
    public List<LichPhongKham> getAll() {
        return lichPhongKhamRepository.findAll();
    }

    @Override
    public Optional<LichPhongKham> getById(Integer id) {
        return lichPhongKhamRepository.findById(id);
    }

    @Override
    public LichPhongKham save(LichPhongKham lichPhongKham) {
        return lichPhongKhamRepository.save(lichPhongKham);
    }

    @Override
    public void delete(LichPhongKham id) {

    }


}