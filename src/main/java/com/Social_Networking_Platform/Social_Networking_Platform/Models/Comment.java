package com.Social_Networking_Platform.Social_Networking_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String content;
    String commentDate;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User userd;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    Post post;
}
