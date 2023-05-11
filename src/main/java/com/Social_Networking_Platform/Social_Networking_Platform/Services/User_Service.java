package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.User;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_Service {
    @Autowired
    User_Repository user_repository;
    public List<User> getAllUsers() {

        return user_repository.findAll();
    }

    public User getUserById(Long id) {

        return user_repository.findById(id).get();
    }
}
