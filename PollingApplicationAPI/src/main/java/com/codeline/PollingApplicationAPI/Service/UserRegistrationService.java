package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
    @Autowired
    UserRegistrationRepository userRepository;
}
