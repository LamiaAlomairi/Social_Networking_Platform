package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Follower;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.FollowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowerService {
    @Autowired
    FollowerRepository followerRepository;
    public List<Follower> getAllFollowers() {

        return followerRepository.findAll();
    }

    public Follower getFollowerById(Long id) {

        return followerRepository.findById(id).get();
    }
}
