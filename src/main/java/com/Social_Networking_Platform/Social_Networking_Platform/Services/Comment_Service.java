package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Comment;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Comment_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Comment_Service {
    @Autowired
    Comment_Repository comment_repository;
    public List<Comment> getAllComments() {

        return comment_repository.findAll();
    }

    public Comment getCommentById(Long id) {

        return comment_repository.findById(id).get();
    }
}
