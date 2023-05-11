package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Like;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Like_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Like_Service {
    @Autowired
    Like_Repository like_repository;
    public List<Like> getAllLikes() {

        return like_repository.findAll();
    }

    public Like getLikeById(Long id) {

        return like_repository.findById(id).get();
    }
}
