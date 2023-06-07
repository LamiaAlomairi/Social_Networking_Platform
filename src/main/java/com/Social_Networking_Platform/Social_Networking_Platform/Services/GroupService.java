package com.Social_Networking_Platform.Social_Networking_Platform.Services;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Group;
import com.Social_Networking_Platform.Social_Networking_Platform.Repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;
    public List<Group> getAllGroups() {

        return groupRepository.findAll();
    }

    public Group getGroupById(Long id) {

        return groupRepository.findById(id).get();
    }
}
