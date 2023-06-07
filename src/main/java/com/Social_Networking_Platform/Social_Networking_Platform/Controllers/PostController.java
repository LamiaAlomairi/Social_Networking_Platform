package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Post;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "post")
public class PostController {
    //    http://localhost:8080/post/getAll
    @Autowired
    PostService postService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Post> getAllPosts() {

        return postService.getAllPosts();
    }
    @GetMapping(value = "getById")
    public Post getPostById(@RequestParam Long id) {

        return postService.getPostById(id);
    }
}
