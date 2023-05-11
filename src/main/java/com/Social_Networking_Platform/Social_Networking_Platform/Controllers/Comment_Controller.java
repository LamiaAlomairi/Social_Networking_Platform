package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Comment;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Comment_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "comment")
public class Comment_Controller {
    //    http://localhost:8080/comment/getAll
    @Autowired
    Comment_Service comment_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Comment> getAllComments() {

        return comment_service.getAllComments();
    }
    @GetMapping(value = "getById")
    public Comment getCommentById(@RequestParam Long id) {

        return comment_service.getCommentById(id);
    }
}
