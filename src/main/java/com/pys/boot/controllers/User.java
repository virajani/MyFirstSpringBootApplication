package com.pys.boot.controllers;

import com.pys.boot.domain.UserDTO;
import com.pys.boot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers(){
       return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO Userdata){
        return userServices.saveUser(Userdata);

    }
}
