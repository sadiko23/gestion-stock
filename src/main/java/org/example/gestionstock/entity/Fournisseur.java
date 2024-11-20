package org.example.gestionstock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Fournisseur {
    @Id
    private int id;
    private String nom;
    private String address;
    private String email;
    private String fax;
    private String telephone;
    private double capital;
    private String rip;

}
