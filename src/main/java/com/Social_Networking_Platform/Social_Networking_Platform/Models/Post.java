package com.Social_Networking_Platform.Social_Networking_Platform.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    User userd;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "group_id")
    Group social_group;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id")
    Event event;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Comment> comments;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Like> likes;
}
