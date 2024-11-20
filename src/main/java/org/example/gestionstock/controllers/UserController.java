package org.example.gestionstock.controllers;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.example.gestionstock.entity.Users;
import org.example.gestionstock.service.UserServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;

@RestController
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class UserController
{
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserServive userServive;
    @PostMapping("login")
    @CrossOrigin(origins = "*")
    public Users login(@RequestParam String username, @RequestParam String password){
        Users user = userServive.login(username,password);
        if (user == null){
            return null;
        }else{
        return user;
        }

    }
    @GetMapping("nombre")
    @CrossOrigin(origins = "*")
    public int  nombre(){
        return userServive.nombre();
    }
    @GetMapping("addUser")
    @CrossOrigin("*")
    public boolean addUser(@RequestParam String email, @RequestParam String password, @RequestParam String nom, @RequestParam String role,@RequestParam String direction){
        Users user = new Users();
        user.setNom(nom);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole(role);
        user.setDirection(direction);
        return userServive.addUser(user);


    }


    @GetMapping("users")
    @CrossOrigin("*")
    public List<Users> getUsers(){
        return userServive.getUsers();
    }


}
