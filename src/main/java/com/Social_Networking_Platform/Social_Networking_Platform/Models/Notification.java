package com.Social_Networking_Platform.Social_Networking_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String text;
    String dateSent;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User userd;
}
