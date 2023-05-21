package com.codeline.PollingApplicationAPI.Repository;

import com.codeline.PollingApplicationAPI.Models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserModels, Long> {
}
