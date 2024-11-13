package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class ProduitFinis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description;
    private int quantite;
    private double prix;
    private String referance;
    private  String category;
    @OneToMany
    private List<DetailCommandeClient> detailCommande;

}
