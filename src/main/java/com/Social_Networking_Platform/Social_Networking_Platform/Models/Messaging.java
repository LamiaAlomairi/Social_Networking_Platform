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
@Table(name = "messaging")
public class Messaging {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long messaging_id;
    String content;
    String sent_date;

    @ManyToMany(mappedBy = "messagings")
    @JsonIgnore
    private List<User> userds;
}
