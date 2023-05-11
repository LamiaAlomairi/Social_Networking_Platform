package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Event;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Event_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Event_Service {
    @Autowired
    Event_Repository event_repository;
    public List<Event> getAllEvents() {

        return event_repository.findAll();
    }

    public Event getEventById(Long id) {

        return event_repository.findById(id).get();
    }
}
