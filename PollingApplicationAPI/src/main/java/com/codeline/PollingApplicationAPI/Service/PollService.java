package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    @Autowired
    PollRepository pollRepository;
}
