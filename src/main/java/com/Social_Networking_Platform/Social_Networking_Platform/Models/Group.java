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
@Table(name = "social_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long group_id;
    String name_of_group;
    String created_date;
    Integer members_count;

    @ManyToMany(mappedBy = "social_groups")
    @JsonIgnore
    private List<User> userds;

    @OneToMany(mappedBy = "social_group")
    @JsonIgnore
    private List<Post> posts;
}
