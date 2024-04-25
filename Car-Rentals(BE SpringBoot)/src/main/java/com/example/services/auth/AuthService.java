package com.example.services.auth;

import com.example.dtos.SignupRequest;
import com.example.dtos.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);

}
