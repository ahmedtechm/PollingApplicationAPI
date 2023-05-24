package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Repository.PollCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollCreationService {

    @Autowired
    PollCreationRepository pollCreationRepository;
}
