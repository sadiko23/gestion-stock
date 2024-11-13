package org.example.gestionstock.service;

import org.example.gestionstock.entity.Client;
import org.example.gestionstock.entity.CommandeClient;
import org.example.gestionstock.entity.DetailCommandeClient;
import org.example.gestionstock.repo.ClientRepo;
import org.example.gestionstock.repo.CommandeClientRrepo;
import org.example.gestionstock.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private CommandeClientRrepo commandeClientRrepo;
    @Autowired
    private ClientRepo clientRepo;
    public float revenue(){
        List<CommandeClient> commandeClients = new ArrayList<CommandeClient>();
        float revenue = 0;
        commandeClients=commandeClientRrepo.findAll();
        List<DetailCommandeClient> detailCommandeClients=new ArrayList<DetailCommandeClient>();
        for(CommandeClient commandeClient:commandeClients){
            if(!commandeClient.getDetail().isEmpty()) {
                System.out.println(commandeClient.getDetail().toString());
                detailCommandeClients.addAll(commandeClient.getDetail());

            }
        }
        for(DetailCommandeClient detailCommandeClient:detailCommandeClients){
            if(detailCommandeClient.getProduits()!=null) {
                revenue += (float) (detailCommandeClient.getProduits().getPrix()*detailCommandeClient.getQuantite());
                System.out.println(detailCommandeClient.getProduits());
            }
        }
        return  revenue;
    }
    public List<Client> findAll(){
        return clientRepo.findAll();
    }

}
