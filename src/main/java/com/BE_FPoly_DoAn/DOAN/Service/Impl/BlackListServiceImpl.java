package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.BlacklistRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.BlackList;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class BlackListServiceImpl implements InterfaceService<com.BE_FPoly_DoAn.DOAN.Entity.BlackList> {
    private final BlacklistRepository blacklistRepository;

    public BlackListServiceImpl(BlacklistRepository blacklistRepository) {
        this.blacklistRepository = blacklistRepository;
    }

    @Override
    public List<BlackList> getAll() {
        return List.of();
    }

    @Override
    public Optional<BlackList> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public BlackList save(BlackList thanhToan) {
        return null;
    }

    public void save(String token, long millisLeft) {
        LocalDateTime expiredAt = LocalDateTime.now().plus(Duration.ofMillis(millisLeft));
        BlackList b = new BlackList();
        b.setTokenBlackList(token);
        b.setExpiredAt(expiredAt);
        blacklistRepository.save(b);
    }

    public boolean isBlacklisted(String token) {
        return blacklistRepository.existsByTokenBlackList(token);
    }


    @Override
    public void delete(BlackList id) {

    }
}
