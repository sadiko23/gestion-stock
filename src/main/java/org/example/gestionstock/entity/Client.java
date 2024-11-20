package org.example.gestionstock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String address;
    private String email;
    private String fax;
    private String telephone;
    private double capital;
    private String rip;
    @OneToMany
    private List<DetailCommandeClient> commandes;
}
