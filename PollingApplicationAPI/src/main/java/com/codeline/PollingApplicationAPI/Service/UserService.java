package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
}
