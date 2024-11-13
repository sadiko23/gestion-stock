package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class DetailCommandeFournisseur {
    @Id
    private int id;
    @ManyToOne
    private CommandeFournisseur commande;
    @ManyToOne
    private ProduitBase produits;

    private int quantite;


}
