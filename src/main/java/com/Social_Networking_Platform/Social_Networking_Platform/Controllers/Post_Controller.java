package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Post;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Post_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "post")
public class Post_Controller {
    //    http://localhost:8080/post/getAll
    @Autowired
    Post_Service post_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Post> getAllPosts() {

        return post_service.getAllPosts();
    }
    @GetMapping(value = "getById")
    public Post getPostById(@RequestParam Long id) {

        return post_service.getPostById(id);
    }
}
