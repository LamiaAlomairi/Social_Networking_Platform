package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Follower;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Follower_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Follower_Service {
    @Autowired
    Follower_Repository follower_repository;
    public List<Follower> getAllFollowers() {

        return follower_repository.findAll();
    }

    public Follower getFollowerById(Long id) {

        return follower_repository.findById(id).get();
    }
}
