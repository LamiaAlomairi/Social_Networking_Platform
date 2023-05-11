package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Group;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.Group_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Group_Service {
    @Autowired
    Group_Repository group_repository;
    public List<Group> getAllGroups() {

        return group_repository.findAll();
    }

    public Group getGroupById(Long id) {

        return group_repository.findById(id).get();
    }
}
