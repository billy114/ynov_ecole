package com.inov.ecole.implems;

import com.inov.ecole.models.Promo;
import com.inov.ecole.repositories.PromoRepo;
import com.inov.ecole.services.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromoImplem implements PromoService {
    @Autowired
    PromoRepo promoRepo;

    @Override
    public Promo createService(Promo promo) {
        return promoRepo.save(promo);
    }

    @Override
    public List<Promo> getAllPromotions() {
        return promoRepo.findAll();
    }
}
