package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Follower;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Follower_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "follower")
public class Follower_Controller {
    //    http://localhost:8080/follower/getAll
    @Autowired
    Follower_Service follower_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Follower> getAllFollowers() {

        return follower_service.getAllFollowers();
    }
    @GetMapping(value = "getById")
    public Follower getFollowerById(@RequestParam Long id) {

        return follower_service.getFollowerById(id);
    }
}
