package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Models.Users;
import com.codeline.PollingApplicationAPI.Repository.UserRepository;
import com.codeline.PollingApplicationAPI.ResponseObjects.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public GetUserResponse getUserResponseById(Long usersId) {
        Optional<Users> optionalUsers = userRepository.findById(usersId);
        if (!optionalUsers.isEmpty()) {
            Users users = optionalUsers.get();
            GetUserResponse userResponse = new GetUserResponse(users.getUsername(), users.getPassword());
            return userResponse;
        }
        return null;
    }

}
