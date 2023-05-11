package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Messaging;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Messaging_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "messaging")
public class Messaging_Controller {
    //    http://localhost:8080/messaging/getAll
    @Autowired
    Messaging_Service messaging_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Messaging> getAllMessaging() {

        return messaging_service.getAllMessaging();
    }
    @GetMapping(value = "getById")
    public Messaging getMessagingById(@RequestParam Long id) {

        return messaging_service.getMessagingById(id);
    }
}
