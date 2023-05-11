package com.Social_Networking_Platform.Social_Networking_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

}
