package com.pys.boot.repositories;


import com.pys.boot.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO, Integer> {

    //getAllUsers
    //findById
    //Delete
    //Update
    //Custom Query

}
