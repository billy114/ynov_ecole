package com.inov.ecole.controllers;

import com.inov.ecole.models.Promo;
import com.inov.ecole.services.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("promo")
public class PormoController {
    @Autowired
    PromoService promoService;

    @PostMapping
    public ResponseEntity<Promo> createPromo (@RequestBody Promo promo){
        return new ResponseEntity<>(
                promoService.createService(promo),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<Promo>> getAll (){
        return new ResponseEntity<>(
                promoService.getAllPromotions(),
                HttpStatus.OK
        );
    }
}
