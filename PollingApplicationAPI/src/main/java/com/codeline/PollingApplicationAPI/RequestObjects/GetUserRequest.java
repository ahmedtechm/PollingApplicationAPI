package com.codeline.PollingApplicationAPI.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetUserRequest {

    String username;
    String password;
}
