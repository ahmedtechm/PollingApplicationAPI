package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Models.User;
import com.codeline.PollingApplicationAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("user/create")
    public void saveUser () {
        createUser();
    }
        public void createUser() {
        User user = new User();
        user.setUsername("ahmed");
        user.setPassword("12221");
        userService.saveUser(user);

    }
}
