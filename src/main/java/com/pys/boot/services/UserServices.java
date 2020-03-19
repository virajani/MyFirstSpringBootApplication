package com.pys.boot.services;

import com.pys.boot.domain.UserDTO;

import java.util.List;

public interface UserServices {
    List<UserDTO> findAllUsers();

    String saveUser(UserDTO userdata);
}
