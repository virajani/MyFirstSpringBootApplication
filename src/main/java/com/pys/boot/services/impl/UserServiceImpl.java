package com.pys.boot.services.impl;

import com.pys.boot.services.UserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {
    @Override
    public String findAllUsers() {
        //database search
        //return  all users
        return "All Users";
    }
}
