package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Models.Poll;
import com.codeline.PollingApplicationAPI.RequestObjects.GetPollRequest;
import com.codeline.PollingApplicationAPI.ResponseObjects.GetPollResponse;
import com.codeline.PollingApplicationAPI.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    //Path Variable
    @RequestMapping ("poll/get/{pollId}")
    public GetPollResponse createPoll (@PathVariable Long pollId){
        return pollService.getPollResponseById(pollId);
    }
    //====================================================================
    //Delete Poll
    @RequestMapping("poll/delete/{Id}")
    public void deletePoll (@PathVariable Long Id) {
        pollService.deletePollById(Id);
    }
    //====================================================================
    public void createPoll(GetPollRequest getPollRequest) {

        Poll poll = new Poll();
        poll.setQuestion(getPollRequest.getQuestion());
        poll.setChoices(getPollRequest.getChoices());
        poll.setCreatedDate(new Date());
        poll.setIsActive(true);
        pollService.savePoll(poll);
    }
}
