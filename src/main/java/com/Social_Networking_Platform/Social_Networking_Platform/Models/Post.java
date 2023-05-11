package com.Social_Networking_Platform.Social_Networking_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long post_id;
    Integer content;
    String posted_date;
    Integer likes_count;
    Integer comments_count;
    
}
