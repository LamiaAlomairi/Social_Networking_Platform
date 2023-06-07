package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Like;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "like")
public class LikeController {
    //    http://localhost:8080/like/getAll
    @Autowired
    LikeService likeService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Like> getAllLikes() {

        return likeService.getAllLikes();
    }
    @GetMapping(value = "getById")
    public Like getLikeById(@RequestParam Long id) {

        return likeService.getLikeById(id);
    }
}
