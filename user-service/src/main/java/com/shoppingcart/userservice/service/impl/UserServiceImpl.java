package com.shoppingcart.userservice.service.impl;

import com.shoppingcart.userservice.dto.LoginRequest;
import com.shoppingcart.userservice.dto.LoginToken;
import com.shoppingcart.userservice.model.User;
import com.shoppingcart.userservice.repository.UserRepository;
import com.shoppingcart.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public LoginToken login(LoginRequest loginRequest) {
        return null;
    }
}
