package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetailCommandeClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private CommandeClient commande;
    @ManyToOne
    private ProduitFinis produits;

    private int quantite;


}
