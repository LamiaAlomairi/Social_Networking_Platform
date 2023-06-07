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
    Long id;
    Integer content;
    String postedDate;
    Integer likesCount;
    Integer commentsCount;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User userd;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    Group socialGroup;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    Event event;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Comment> comments;

    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Like> likes;
}
