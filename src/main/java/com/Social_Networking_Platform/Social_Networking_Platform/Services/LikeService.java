package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Like;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {
    @Autowired
    LikeRepository likeRepository;
    public List<Like> getAllLikes() {

        return likeRepository.findAll();
    }

    public Like getLikeById(Long id) {

        return likeRepository.findById(id).get();
    }
}
