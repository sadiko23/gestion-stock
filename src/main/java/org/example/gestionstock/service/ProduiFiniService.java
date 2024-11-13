package org.example.gestionstock.service;

import org.example.gestionstock.entity.ProduitFinis;
import org.example.gestionstock.repo.ProduitFiniRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduiFiniService {
    @Autowired
    private ProduitFiniRepo produitFiniRepo;

    public ProduitFinis add(ProduitFinis produitFinis) {
        return produitFiniRepo.save(produitFinis);
    }
}
