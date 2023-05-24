package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Models.Users;
import com.codeline.PollingApplicationAPI.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void saveUser(Users users){
        userRepository.save(users);
    }
    public List<Users> getUsers() {
        return userRepository.findAll();
    }

}
