package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Models.Poll;
import com.codeline.PollingApplicationAPI.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PollController {
    @Autowired
    PollService pollService;

    @RequestMapping("poll/create")
    public void savePoll () {
        createPoll();
    }

    public void createPoll() {

        Poll poll = new Poll();
        poll.setQuestion("");
        poll.setCreatedDate(new Date());
        poll.setIsActive(true);
        pollService.savePoll(poll);
    }
}
