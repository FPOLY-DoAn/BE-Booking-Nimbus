package com.BE_FPoly_DoAn.DOAN.Fillter;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class LichKhamSpecification {

    public static Specification<LichKham> filterBy(LichKhamFilterDTO filter) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (filter.getNgayKham() != null) {
                predicates.add(cb.equal(root.get("ngayKham"), filter.getNgayKham()));
            }

            if (filter.getBacSiId() != null) {
                predicates.add(cb.equal(root.get("bacSi").get("bacSiId"), filter.getBacSiId()));
            }

            if (filter.getTrangThai() != null) {
                predicates.add(cb.equal(root.get("trangThai"), filter.getTrangThai()));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}