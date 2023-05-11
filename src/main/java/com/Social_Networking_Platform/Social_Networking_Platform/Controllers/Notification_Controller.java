package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Notification;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Notification_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "notification")
public class Notification_Controller {
    //    http://localhost:8080/notification/getAll
    @Autowired
    Notification_Service notification_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Notification> getAllNotifications() {

        return notification_service.getAllNotifications();
    }
    @GetMapping(value = "getById")
    public Notification getNotificationById(@RequestParam Long id) {

        return notification_service.getNotificationById(id);
    }
}
