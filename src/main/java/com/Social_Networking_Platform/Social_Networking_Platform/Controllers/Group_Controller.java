package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Group;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Group_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "group")
public class Group_Controller {
    //    http://localhost:8080/group/getAll
    @Autowired
    Group_Service group_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Group> getAllGroups() {

        return group_service.getAllGroups();
    }
    @GetMapping(value = "getById")
    public Group getGroupById(@RequestParam Long id) {

        return group_service.getGroupById(id);
    }
}
