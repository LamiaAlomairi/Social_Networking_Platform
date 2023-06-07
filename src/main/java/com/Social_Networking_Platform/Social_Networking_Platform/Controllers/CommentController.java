package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Comment;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "comment")
public class CommentController {
    //    http://localhost:8080/comment/getAll
    @Autowired
    CommentService commentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Comment> getAllComments() {

        return commentService.getAllComments();
    }
    @GetMapping(value = "getById")
    public Comment getCommentById(@RequestParam Long id) {

        return commentService.getCommentById(id);
    }
}
