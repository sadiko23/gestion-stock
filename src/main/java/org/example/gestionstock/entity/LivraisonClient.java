package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class LivraisonClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private Boolean etat;

    private String addressLivraisonClient;
    @OneToMany
    private List<ProduitFinis> produitFinis;
    @OneToMany
    private List<Client> Client;


}

