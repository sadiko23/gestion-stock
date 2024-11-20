package org.example.gestionstock.service;

import org.example.gestionstock.entity.Fournisseur;
import org.example.gestionstock.repo.FournisseurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private  FournisseurRepo fournisseurRepo;

    public List<Fournisseur> findAll() {
        return fournisseurRepo.findAll();
    }
}
