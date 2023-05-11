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
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long event_id;
    String name;
    String description;
    String start_date;
    String end_date;
    String location;

    @ManyToMany(mappedBy = "events")
    @JsonIgnore
    private List<User> userds;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Post> posts;
}
