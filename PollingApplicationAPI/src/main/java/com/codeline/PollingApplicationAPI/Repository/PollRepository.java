package com.codeline.PollingApplicationAPI.Repository;

import com.codeline.PollingApplicationAPI.Models.PollModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<PollModels, Long> {
}
