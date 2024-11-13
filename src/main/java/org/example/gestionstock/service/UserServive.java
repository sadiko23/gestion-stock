package org.example.gestionstock.service;

import org.example.gestionstock.entity.Users;
import org.example.gestionstock.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServive {
    @Autowired
    private UserRepo userRepo;

    public Users login(String username, String password) {
            userRepo.findByNomAndPassword(username,password);
            return userRepo.findByNomAndPassword(username,password);
    }

    public int nombre(){
        List<Users> user= (List<Users>) userRepo.findAll();
        return user.size();
    }
}
