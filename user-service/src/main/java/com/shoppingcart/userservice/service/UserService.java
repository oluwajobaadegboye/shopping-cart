package com.shoppingcart.userservice.service;

import com.shoppingcart.userservice.config.LoginToken;
import com.shoppingcart.userservice.dto.LoginRequest;
import com.shoppingcart.userservice.model.User;

public interface UserService {
    public User createUser(User user);
    public LoginToken login(LoginRequest loginRequest);
}
