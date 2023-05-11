package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Like;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.Like_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "like")
public class Like_Controller {
    //    http://localhost:8080/like/getAll
    @Autowired
    Like_Service like_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Like> getAllLikes() {

        return like_service.getAllLikes();
    }
    @GetMapping(value = "getById")
    public Like getLikeById(@RequestParam Long id) {

        return like_service.getLikeById(id);
    }
}
