package com.example.services.auth;

import com.example.dtos.SignupRequest;
import com.example.dtos.UserDto;
import com.example.entities.Users;
import com.example.enums.UserRole;
import com.example.repositories.UserRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @PostConstruct
    public void createAdminAccount(){
        Users adminAccount = userRepository.findByUserRole(UserRole.ADMIN);
        if (adminAccount == null){
            Users newAdminAccount = new Users();
            newAdminAccount.setName("Admin");
            newAdminAccount.setUserRole(UserRole.ADMIN);
            newAdminAccount.setEmail("admin@test.com");
            newAdminAccount.setPassword(new BCryptPasswordEncoder().encode("admin"));
            userRepository.save(newAdminAccount);
        }
    }

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        Users user = new Users();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setUserRole(UserRole.CUSTOMER);
        Users createdCustomer = userRepository.save(user);
        UserDto cretaedUserDto = new UserDto();
        cretaedUserDto.setId(createdCustomer.getId());
        cretaedUserDto.setName(createdCustomer.getName());
        cretaedUserDto.setEmail(createdCustomer.getEmail());
        cretaedUserDto.setUserRole(createdCustomer.getUserRole());
        return cretaedUserDto;
    }

    @Override
    public boolean hasCustomerWithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }

}
