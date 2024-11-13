package org.example.gestionstock.controllers;

import org.example.gestionstock.entity.Client;
import org.example.gestionstock.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ClientController {
    @Autowired

    public ClientService clientService;

    @GetMapping("revenue")
    @CrossOrigin("*")
    public float revenue(){
        return  clientService.revenue();
    }
    @GetMapping("Clients")
    public List<Client> getClients(){
        return  clientService.findAll();
    }

}
