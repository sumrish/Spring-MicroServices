package com.example.user.Controller;

import com.example.user.Models.User;
import com.example.user.Service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping(path = "/getUser/")
    public User getUser(@RequestParam int id)
    {
        if(id < 1) {
            User user = new User();
            user.username = "ID Is Missing or Incorrect";
            return user;
        }else {
            User user = userService.getUser(id);
            userService.insertUser(user);
            return user;
        }
    }

    @GetMapping(path = "/updateUser/")
    public List<User>  updateUser(@RequestParam String website, @RequestParam String phone , @RequestParam int id)
    {
        if(id < 1 || website == null || phone == null) {
            List<User> userlist = new ArrayList<>();
            User user = new User();
            user.username = "Incorrect or Missing parameters";
            userlist.add(user);
            return userlist;
        }else {
            userService.updateUser(website , phone , id);
            List<User> user = userService.findUser( id);
            return user;
        }
    }



}
