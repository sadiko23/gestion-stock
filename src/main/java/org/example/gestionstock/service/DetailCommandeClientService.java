package org.example.gestionstock.service;

import org.example.gestionstock.entity.DetailCommandeClient;
import org.example.gestionstock.repo.DetailCommandClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailCommandeClientService {
    @Autowired
    private DetailCommandClientRepo detailCommandClientRepo;

    public DetailCommandeClient  add(DetailCommandeClient detailCommandeClient){
        return detailCommandClientRepo.save(detailCommandeClient);
    }
}
