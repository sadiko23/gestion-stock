package org.example.gestionstock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class ProduitBase {
    @Id
    private int id;
    private String description;
    private int quantite;
    private double prix;
    private String referance;
    private  String category;
    @OneToMany(fetch = FetchType.LAZY)
    private List<DetailCommandeFournisseur> detailCommande;

}
