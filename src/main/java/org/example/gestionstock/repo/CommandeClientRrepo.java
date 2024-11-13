package org.example.gestionstock.repo;

import org.example.gestionstock.entity.CommandeClient;
import org.example.gestionstock.entity.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeClientRrepo extends JpaRepository<CommandeClient, Integer> {
    public CommandeClient findById(int clientId);

}
