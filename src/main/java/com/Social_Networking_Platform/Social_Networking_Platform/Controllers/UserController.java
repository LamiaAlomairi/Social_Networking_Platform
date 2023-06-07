package com.Social_Networking_Platform.Social_Networking_Platform.Controllers;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.User;
import com.Social_Networking_Platform.Social_Networking_Platform.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    //    http://localhost:8080/user/getAll
    @Autowired
    UserService userService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }
    @GetMapping(value = "getById")
    public User getUserById(@RequestParam Long id) {

        return userService.getUserById(id);
    }
}
