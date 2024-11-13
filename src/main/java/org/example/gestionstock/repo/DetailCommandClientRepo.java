package org.example.gestionstock.repo;

import org.example.gestionstock.entity.DetailCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCommandClientRepo extends JpaRepository<DetailCommandeClient,Integer> {
}
