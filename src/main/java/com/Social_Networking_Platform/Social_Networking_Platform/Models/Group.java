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
@Table(name = "socialGroup")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nameOfGroup;
    String createdDate;
    Integer membersCount;

    @ManyToMany(mappedBy = "socialGroups")
    @JsonIgnore
    private List<User> userds;

    @OneToMany(mappedBy = "socialGroup")
    @JsonIgnore
    private List<Post> posts;
}
