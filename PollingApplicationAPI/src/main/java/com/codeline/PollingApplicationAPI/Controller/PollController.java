package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {
    @Autowired
    PollService pollService;
}
