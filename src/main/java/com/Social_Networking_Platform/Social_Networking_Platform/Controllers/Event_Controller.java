package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Event;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Event_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "event")
public class Event_Controller {
    //    http://localhost:8080/event/getAll
    @Autowired
    Event_Service event_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Event> getAllEvents() {

        return event_service.getAllEvents();
    }
    @GetMapping(value = "getById")
    public Event getEventById(@RequestParam Long id) {

        return event_service.getEventById(id);
    }
}
