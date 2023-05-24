package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Models.Users;
import com.codeline.PollingApplicationAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("users/create")
    public void saveUser () {
        createUser();
    }

    @RequestMapping("users/get")
    public List<Users> getUsers (){
        return UserService.getUsers();
    }
        public void createUser() {
        Users users = new Users();
        users.setUsername("ahmed");
        users.setPassword("12221");
        users.setCreatedDate(new Date());
        users.setIsActive(true);
        userService.saveUser(users);


    }
}
