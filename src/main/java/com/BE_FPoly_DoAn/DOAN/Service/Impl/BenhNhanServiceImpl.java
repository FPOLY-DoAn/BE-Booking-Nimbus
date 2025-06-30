package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.BenhNhanRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BenhNhan;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenhNhanServiceImpl implements InterfaceService<BenhNhan> {

    private final BenhNhanRepository benhNhanRepository;

    public BenhNhanServiceImpl(BenhNhanRepository benhNhanRepository) {
        this.benhNhanRepository = benhNhanRepository;
    }

    @Override
    public List<BenhNhan> getAll() {
        return benhNhanRepository.findAll();
    }

    @Override
    public Optional<BenhNhan> getById(Integer id) {
        System.out.println("id "+ id);

        return benhNhanRepository.findById(id);
    }

    @Override
    public BenhNhan save(BenhNhan BenhNhan) {
        return benhNhanRepository.save(BenhNhan);
    }

    @Override
    public void delete(BenhNhan id) {

    }


    public BenhNhan update(BenhNhan benhNhan) {
        return benhNhanRepository.save(benhNhan);
    }


}