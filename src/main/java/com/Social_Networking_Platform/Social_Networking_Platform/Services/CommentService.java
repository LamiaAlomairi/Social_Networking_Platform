package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Comment;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;
    public List<Comment> getAllComments() {

        return commentRepository.findAll();
    }

    public Comment getCommentById(Long id) {

        return commentRepository.findById(id).get();
    }
}
