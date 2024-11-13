package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class LivraisonFournisseur  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Boolean etat;

    private String addressLivraisonFournisseur;
    @OneToMany
    private List<ProduitBase> produitBase;
    @OneToMany
    private List<Fournisseur> fournisseur;


}

