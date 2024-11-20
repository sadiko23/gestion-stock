package org.example.gestionstock.repo;

import org.example.gestionstock.entity.ProduitBase;
import org.example.gestionstock.entity.ProduitFinis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitBaseRepo extends JpaRepository<ProduitBase,Integer> {
}
