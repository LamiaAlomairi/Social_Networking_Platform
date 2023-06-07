package com.Social_Networking_Platform.Social_Networking_Platform.Repositories;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
