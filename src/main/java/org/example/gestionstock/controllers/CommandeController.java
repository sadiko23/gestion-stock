package org.example.gestionstock.controllers;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.example.gestionstock.entity.CommandeClient;
import org.example.gestionstock.entity.CommandeFournisseur;
import org.example.gestionstock.entity.DetailCommandeClient;
import org.example.gestionstock.entity.ProduitFinis;
import org.example.gestionstock.service.CommandeClientService;
import org.example.gestionstock.service.CommendeFournisseurService;
import org.example.gestionstock.service.DetailCommandeClientService;
import org.example.gestionstock.service.ProduiFiniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@RestController
@RequestMapping("commandes")

public class CommandeController {
    @Autowired
    private CommendeFournisseurService commandeFournisseurService;
    @Autowired
    private ProduiFiniService produiFiniService;
    @Autowired
    public DetailCommandeClientService detailCommandeClientService;
    @Autowired
    private CommandeClientService commandeClientService;


    @GetMapping("Fournisseur")
    @CrossOrigin(origins = "*")
    public List<CommandeFournisseur> commandesFournisseur(){
        List<CommandeFournisseur> commandeFournisseurList=commandeFournisseurService.getAllCommandeFournisseur();


        return commandeFournisseurList;


    }
    @GetMapping("/test")
    public String test(){
        ProduitFinis produitFinis=new ProduitFinis();

        produitFinis.setDescription("test");
        produitFinis.setPrix(100);
        produitFinis.setQuantite(2);
        produitFinis.setReferance("fvvfred");
        DetailCommandeClient detailCommandeClient=new DetailCommandeClient();

        produitFinis=produiFiniService.add(produitFinis);

        CommandeClient commandeClient=commandeClientService.findById(53);
        System.out.println(commandeClient.getDescription());


        detailCommandeClient.setProduits(produitFinis);
        detailCommandeClient.setQuantite(2);
        detailCommandeClient.setCommande(commandeClient);
        detailCommandeClientService.add(detailCommandeClient);




        return "hi";


    }
    @GetMapping("Client")
    @CrossOrigin("*")
    public List<CommandeClient> getCommandeFournisseur(){
        return commandeClientService.findAll();
    }


}
