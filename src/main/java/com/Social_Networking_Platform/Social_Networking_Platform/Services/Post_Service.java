package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Post;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Post_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Post_Service {
    @Autowired
    Post_repository post_repository;
    public List<Post> getAllPosts() {

        return post_repository.findAll();
    }

    public Post getPostById(Long id) {

        return post_repository.findById(id).get();
    }
}
