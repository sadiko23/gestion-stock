package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class CommandeClient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date dateCommande;
    private Double total;
    private boolean valid;
    private String description;
    @OneToMany
        private List<DetailCommandeClient> detail;

}

