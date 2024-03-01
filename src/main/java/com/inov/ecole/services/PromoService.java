package com.inov.ecole.services;

import com.inov.ecole.models.Promo;

import java.util.List;

public interface PromoService {
    Promo createService (Promo promo);
    List<Promo> getAllPromotions();
}
