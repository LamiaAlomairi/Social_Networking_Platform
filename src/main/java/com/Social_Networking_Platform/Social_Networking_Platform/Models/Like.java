package com.Social_Networking_Platform.Social_Networking_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "social_like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long like_id;
    String like_date;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    User userd;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "post_id")
    Post post;
}
