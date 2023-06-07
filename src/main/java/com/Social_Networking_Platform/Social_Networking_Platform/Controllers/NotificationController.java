package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Notification;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "notification")
public class NotificationController {
    //    http://localhost:8080/notification/getAll
    @Autowired
    NotificationService notificationService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Notification> getAllNotifications() {

        return notificationService.getAllNotifications();
    }
    @GetMapping(value = "getById")
    public Notification getNotificationById(@RequestParam Long id) {

        return notificationService.getNotificationById(id);
    }
}
