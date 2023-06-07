package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Follower;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.FollowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "follower")
public class FollowerController {
    //    http://localhost:8080/follower/getAll
    @Autowired
    FollowerService followerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Follower> getAllFollowers() {

        return followerService.getAllFollowers();
    }
    @GetMapping(value = "getById")
    public Follower getFollowerById(@RequestParam Long id) {

        return followerService.getFollowerById(id);
    }
}
