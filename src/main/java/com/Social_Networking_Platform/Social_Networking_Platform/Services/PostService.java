package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Post;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public List<Post> getAllPosts() {

        return postRepository.findAll();
    }

    public Post getPostById(Long id) {

        return postRepository.findById(id).get();
    }
}
