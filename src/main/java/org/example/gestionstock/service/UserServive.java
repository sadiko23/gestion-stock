package org.example.gestionstock.service;

import org.example.gestionstock.entity.Users;
import org.example.gestionstock.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServive {
    @Autowired
    private UserRepo userRepo;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public Users login(String username, String password) {

            Users user = userRepo.findByNom(username);
            if(passwordEncoder.matches(password, user.getPassword())) {
                return user;
            }
            return null;
    }

    public int nombre(){
        List<Users> user= (List<Users>) userRepo.findAll();
        return user.size();
    }
    public boolean addUser(Users user){
        Users u=userRepo.save(user);
        return u != null;
    }
    public List<Users> getUsers(){
        return (List<Users>) userRepo.findAll();
    }
}
