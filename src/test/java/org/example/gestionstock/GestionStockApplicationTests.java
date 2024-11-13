package org.example.gestionstock;

import org.assertj.core.api.Assert;
import org.example.gestionstock.entity.CommandeClient;
import org.example.gestionstock.entity.CommandeFournisseur;
import org.example.gestionstock.entity.DetailCommandeClient;
import org.example.gestionstock.entity.ProduitFinis;
import org.example.gestionstock.service.CommendeFournisseurService;
import org.example.gestionstock.service.DetailCommandeClientService;
import org.example.gestionstock.service.ProduiFiniService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class GestionStockApplicationTests {
    @Autowired
    private CommendeFournisseurService commendeFournisseurService;
    @Autowired
    private ProduiFiniService produiFiniService;

    @Autowired
    private DetailCommandeClientService detailCommandeClientService;


    @Test
    void contextLoads() {

        List<CommandeFournisseur> commandeFournisseurList=commendeFournisseurService.getAllCommandeFournisseur();
        String test="0  tes";
        for (CommandeFournisseur commandeFournisseur:commandeFournisseurList) {
            String res=commandeFournisseur.getId()+"  "+commandeFournisseur.getDescription();

            Assertions.assertEquals(test,res);
        }

    }



}
