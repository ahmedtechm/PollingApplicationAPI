package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Models.Poll;
import com.codeline.PollingApplicationAPI.RequestObjects.GetPollRequest;
import com.codeline.PollingApplicationAPI.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PollController {
    @Autowired
    PollService pollService;
    //===================================================================

    @RequestMapping("poll/create")
    public void savePoll (@RequestBody GetPollRequest getPollRequest) {
        createPoll(getPollRequest);
    }
    //====================================================================
    @RequestMapping("poll/get")
    public List<Poll> getPoll () {
        return pollService.getPll();
    }
    //====================================================================



    public void createPoll(GetPollRequest getPollRequest) {

        Poll poll = new Poll();
        poll.setQuestion(getPollRequest.getQuestion());
        poll.setCreatedDate(new Date());
        poll.setIsActive(true);
        pollService.savePoll(poll);
    }
}
