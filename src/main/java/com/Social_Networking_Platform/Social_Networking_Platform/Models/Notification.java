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
    Long notification_id;
    String text;
    String date_sent;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    User userd;
}
