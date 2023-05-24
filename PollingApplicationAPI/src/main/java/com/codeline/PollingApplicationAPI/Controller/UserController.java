package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Models.Users;
import com.codeline.PollingApplicationAPI.RequestObjects.GetUserRequest;
import com.codeline.PollingApplicationAPI.ResponseObjects.GetUserResponse;
import com.codeline.PollingApplicationAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("users/create")
    public void saveUser (@RequestBody GetUserRequest getUserRequest) {
        createUser(getUserRequest);
    }

    @RequestMapping("users/get")
    public List<Users> getUsers (){
        return userService.getUsers();
    }

    //Path Variable
    @RequestMapping("users/get/{userId}")
    public GetUserResponse createUsers(@PathVariable Long userId) {
        return userService.getUserResponseById(userId);
    }

    //Delete Employee
    @RequestMapping("users/delete/{Id}")
    public void deleteUsers (@PathVariable Long Id) {
        userService.deleteUserById(Id);
    }
        public void createUser(GetUserRequest getUserRequest) {
        Users users = new Users();
        users.setUsername(getUserRequest.getUsername());
        users.setPassword(getUserRequest.getPassword());
        users.setCreatedDate(new Date());
        users.setIsActive(true);
        userService.saveUser(users);


    }
}
