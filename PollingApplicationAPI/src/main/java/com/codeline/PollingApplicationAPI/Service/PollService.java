package com.codeline.PollingApplicationAPI.Service;

import com.codeline.PollingApplicationAPI.Models.Poll;
import com.codeline.PollingApplicationAPI.Repository.PollRepository;
import com.codeline.PollingApplicationAPI.ResponseObjects.GetPollResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    //===========================================================================
    public GetPollResponse getPollResponseById(Long pollId) {
        Optional<Poll> optionalPoll = pollRepository.findById(pollId);
        if (!optionalPoll.isEmpty()) {
            Poll poll = optionalPoll.get();
            GetPollResponse pollResponse = new GetPollResponse(poll.getQuestion(), poll.getChoices());
            return pollResponse;
        }
        return null;
    }
    //===========================================================================
    //Delete Poll
    public void deletePollById(Long pollId) {
        pollRepository.deleteById(pollId);
    }
}

