package com.inov.ecole.repositories;

import com.inov.ecole.models.Promo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromoRepo extends JpaRepository<Promo, Long> {
    Promo save(Promo promo);
    List<Promo> findAll();
}
