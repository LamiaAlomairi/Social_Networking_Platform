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
@Table(name = "userd")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long user_id;
    String user_name;
    String email;
    String address;
    String joined_date;

    @OneToMany(mappedBy = "userd")
    @JsonIgnore
    private List<Post> posts;

    @OneToMany(mappedBy = "userd")
    @JsonIgnore
    private List<Comment> comments;

    @OneToMany(mappedBy = "userd")
    @JsonIgnore
    private List<Like> likes;

    @OneToMany(mappedBy = "userd")
    @JsonIgnore
    private List<Follower> followers;

    @OneToMany(mappedBy = "userd")
    @JsonIgnore
    private List<Notification> notifications;

    @ManyToMany
    @JoinTable(name = "user_group", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "group_id"))
    private List<Group> social_groups;

    @ManyToMany
    @JoinTable(name = "user_event", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
    private List<Event> events;

    @ManyToMany
    @JoinTable(name = "user_messaging", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "messaging_id"))
    private List<Messaging> messagings;
}
