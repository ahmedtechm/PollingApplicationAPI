package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {
    @Autowired
    PollService pollService;

    @RequestMapping("poll/create")
    public void savePoll () {
        createPoll();
    }
}
