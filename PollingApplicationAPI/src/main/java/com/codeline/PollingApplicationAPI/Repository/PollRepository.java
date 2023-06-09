package com.codeline.PollingApplicationAPI.Repository;

import com.codeline.PollingApplicationAPI.Models.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
}
