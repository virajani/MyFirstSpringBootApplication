package com.pys.boot.services.impl;

import com.pys.boot.domain.UserDTO;
import com.pys.boot.repositories.UserRepository;
import com.pys.boot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAllUsers() {
        List <UserDTO> allusers = userRepository.findAll();
        return allusers;
    }

    @Override
    public String saveUser(UserDTO userdata){
        userRepository.save(userdata);
        return "Data Saved";
    }
}
