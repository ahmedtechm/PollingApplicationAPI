package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Models.Poll;
import com.codeline.PollingApplicationAPI.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {

    @Autowired
    PollRepository pollRepository;

    public void savePoll(Poll poll) {
        pollRepository.save(poll);
    }
    //===========================================================================
    public List<Poll> getPll() {
        return pollRepository.findAll();
    }
}

