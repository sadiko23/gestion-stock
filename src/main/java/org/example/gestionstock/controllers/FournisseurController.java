package org.example.gestionstock.controllers;

import org.example.gestionstock.entity.Fournisseur;
import org.example.gestionstock.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;
    @GetMapping("fournisseur")
    @CrossOrigin("*")
    public List<Fournisseur> getAllFournisseur() {
        return fournisseurService.findAll();
    }
}
