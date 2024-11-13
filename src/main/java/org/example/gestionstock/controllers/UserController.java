package org.example.gestionstock.controllers;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.example.gestionstock.entity.Users;
import org.example.gestionstock.service.UserServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;

@RestController
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class UserController
{
    @Autowired
    private UserServive userServive;
    @PostMapping("login")
    @CrossOrigin(origins = "*")
    public Users login(@RequestParam String username, @RequestParam String password){
        Users user = userServive.login(username, password);
        System.out.println(user.getNom());
        return user;


    }
    @GetMapping("nombre")
    @CrossOrigin(origins = "*")
    public int  nombre(){
        return userServive.nombre();
    }




}
