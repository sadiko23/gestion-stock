package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class CommandeFournisseur implements Serializable {

    @Id
    private int id;
    private Date dateCommande;
    private Double total;
    private boolean valid;
    private String description;
    @OneToMany
    private List<DetailCommandeFournisseur> detail;
}

