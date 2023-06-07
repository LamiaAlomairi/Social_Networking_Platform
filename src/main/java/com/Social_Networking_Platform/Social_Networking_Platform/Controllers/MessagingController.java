package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Messaging;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "messaging")
public class MessagingController {
    //    http://localhost:8080/messaging/getAll
    @Autowired
    MessagingService messagingService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Messaging> getAllMessaging() {

        return messagingService.getAllMessaging();
    }
    @GetMapping(value = "getById")
    public Messaging getMessagingById(@RequestParam Long id) {

        return messagingService.getMessagingById(id);
    }
}
