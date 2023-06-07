package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Event;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;
    public List<Event> getAllEvents() {

        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {

        return eventRepository.findById(id).get();
    }
}
