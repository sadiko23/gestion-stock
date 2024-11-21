package org.example.gestionstock.controllers;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.example.gestionstock.entity.Users;
import org.example.gestionstock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class UserController
{
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;
    @PostMapping("login")
    @CrossOrigin(origins = "*")
    public Users login(@RequestParam String username, @RequestParam String password){
        Users user = userService.login(username,password);
        if (user == null){
            return null;
        }else{
        return user;
        }

    }
    @GetMapping("nombre")
    @CrossOrigin(origins = "*")
    public int  nombre(){
        return userService.nombre();
    }
    @PostMapping("addUser")
    @CrossOrigin("*")
    public boolean addUser(@RequestBody Users  user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userService.addUser(user);


    }


    @GetMapping("users")
    @CrossOrigin("*")
    public List<Users> getUsers(){
        return userService.getUsers();
    }

    @DeleteMapping("deleteUser")
    @CrossOrigin("*")
    public void deleteUser(@RequestBody Map id){
        int idval=(int)id.get("id");

        userService.delete(idval);
        System.out.println("eliminando el user : "+idval);
        return;
    }


}
