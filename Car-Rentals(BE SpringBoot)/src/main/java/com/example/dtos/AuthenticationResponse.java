package com.example.dtos;

import com.example.enums.UserRole;

import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;

    private UserRole userRole;

    private Long userId;

}
