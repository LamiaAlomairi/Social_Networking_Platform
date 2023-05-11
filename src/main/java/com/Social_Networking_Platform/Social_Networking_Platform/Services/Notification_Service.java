package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Notification;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Notification_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Notification_Service {
    @Autowired
    Notification_Repository notification_repository;
    public List<Notification> getAllNotifications() {

        return notification_repository.findAll();
    }

    public Notification getNotificationById(Long id) {

        return notification_repository.findById(id).get();
    }
}
