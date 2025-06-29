package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "BlackListt")
public class BlackList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "token_blacklist", columnDefinition = "NVARCHAR(MAX)")
    private String tokenBlackList;


    @Column(name = "expired_at")
    private LocalDateTime expiredAt;
}
