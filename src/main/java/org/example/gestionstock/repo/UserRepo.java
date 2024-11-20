package org.example.gestionstock.repo;

import org.example.gestionstock.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
    public Users findByNomAndPassword(String nom, String password);

    Users findByNom(String username);
}
