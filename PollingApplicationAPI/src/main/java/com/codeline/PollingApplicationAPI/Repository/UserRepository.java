package com.codeline.PollingApplicationAPI.Repository;

import com.codeline.PollingApplicationAPI.Models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<UserModels, Long> {
}
