package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Group;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "group")
public class GroupController {
    //    http://localhost:8080/group/getAll
    @Autowired
    GroupService groupService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Group> getAllGroups() {

        return groupService.getAllGroups();
    }
    @GetMapping(value = "getById")
    public Group getGroupById(@RequestParam Long id) {

        return groupService.getGroupById(id);
    }
}
