package org.example.gestionstock.controllers;

import org.example.gestionstock.entity.ProduitBase;
import org.example.gestionstock.entity.ProduitFinis;
import org.example.gestionstock.service.ProduiBaseService;
import org.example.gestionstock.service.ProduiFiniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitController {
    @Autowired
    private ProduiFiniService produiFiniService;
    @Autowired
    private ProduiBaseService produiBaseService;
    @GetMapping("produitFinit")
    @CrossOrigin("*")
    public List<ProduitFinis> getProduitFinis(){
        return produiFiniService.findAll();
    }


    @GetMapping("produitBase")
    @CrossOrigin("*")
    public List<ProduitBase> getProduitBase(){
        return produiBaseService.findAll();
    }

    @PostMapping("addProduitFinit")
    @CrossOrigin("*")
    public boolean setProduitFini( @RequestBody ProduitFinis produiFini) {
        System.out.println(produiFini.getCategory());
        return produiFiniService.add(produiFini);
    }
}
