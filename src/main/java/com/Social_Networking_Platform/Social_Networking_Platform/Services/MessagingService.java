package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Messaging;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.MessagingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagingService {
    @Autowired
    MessagingRepository messagingRepository;
    public List<Messaging> getAllMessaging() {

        return messagingRepository.findAll();
    }

    public Messaging getMessagingById(Long id) {

        return messagingRepository.findById(id).get();
    }
}
