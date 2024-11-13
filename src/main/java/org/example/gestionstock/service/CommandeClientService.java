package org.example.gestionstock.service;

import org.example.gestionstock.entity.CommandeClient;
import org.example.gestionstock.repo.CommandeClientRrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeClientService {
    @Autowired
    private CommandeClientRrepo commandeClientRrepo;
    public CommandeClient add(CommandeClient commandeClient) {
        return commandeClientRrepo.save(commandeClient);

    };
    public CommandeClient findById(Integer id) {
        return  commandeClientRrepo.findById(id).get();
    }
    public List<CommandeClient> findAll() {
        return commandeClientRrepo.findAll();
    }
}
