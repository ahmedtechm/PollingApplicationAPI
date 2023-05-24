package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
}
