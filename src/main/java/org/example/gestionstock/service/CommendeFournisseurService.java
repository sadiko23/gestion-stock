package org.example.gestionstock.service;

import org.example.gestionstock.entity.CommandeFournisseur;
import org.example.gestionstock.repo.CommandeFournisseuRrepo;
import org.example.gestionstock.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommendeFournisseurService  {
    @Autowired
    private CommandeFournisseuRrepo commandeFournisseuRrepo;
    public List<CommandeFournisseur> getAllCommandeFournisseur() {
        return commandeFournisseuRrepo.findAll();
    }

}
