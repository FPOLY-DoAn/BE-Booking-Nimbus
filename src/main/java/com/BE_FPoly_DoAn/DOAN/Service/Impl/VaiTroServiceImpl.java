package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.VaiTro;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaiTroServiceImpl implements InterfaceService<VaiTro> {

    @Override
    public List<VaiTro> getAll() {
        return List.of();
    }

    @Override
    public Optional<VaiTro> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public VaiTro save(VaiTro thanhToan) {
        return null;
    }

    @Override
    public void delete(VaiTro id) {

    }
}