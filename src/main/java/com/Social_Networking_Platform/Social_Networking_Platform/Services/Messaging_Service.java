package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Messaging;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Messaging_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Messaging_Service {
    @Autowired
    Messaging_Repository messaging_repository;
    public List<Messaging> getAllMessaging() {

        return messaging_repository.findAll();
    }

    public Messaging getMessagingById(Long id) {

        return messaging_repository.findById(id).get();
    }
}
