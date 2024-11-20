package org.example.gestionstock.service;

import org.example.gestionstock.entity.ProduitBase;
import org.example.gestionstock.entity.ProduitFinis;
import org.example.gestionstock.repo.ProduitBaseRepo;
import org.example.gestionstock.repo.ProduitFiniRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduiBaseService {
    @Autowired
    private ProduitBaseRepo produitBaseRepo;

    public boolean add(ProduitBase produitBase) {
        return produitBaseRepo.save(produitBase)!=null;

    }
    public List<ProduitBase> findAll() {
        return produitBaseRepo.findAll();
    }

}
