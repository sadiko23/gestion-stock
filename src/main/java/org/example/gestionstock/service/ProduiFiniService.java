package org.example.gestionstock.service;

import org.example.gestionstock.entity.ProduitFinis;
import org.example.gestionstock.repo.ProduitFiniRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduiFiniService {
    @Autowired
    private ProduitFiniRepo produitFiniRepo;

    public boolean add(ProduitFinis produitFinis) {
        return produitFiniRepo.save(produitFinis)!=null;
    }
    public List<ProduitFinis> findAll() {
        return produitFiniRepo.findAll();
    }

}
