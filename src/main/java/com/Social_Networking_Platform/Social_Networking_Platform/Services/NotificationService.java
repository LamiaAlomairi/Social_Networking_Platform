package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Notification;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;
    public List<Notification> getAllNotifications() {

        return notificationRepository.findAll();
    }

    public Notification getNotificationById(Long id) {

        return notificationRepository.findById(id).get();
    }
}
