package com.shoppingcart.userservice.service;

import com.shoppingcart.userservice.dto.LoginRequest;
import com.shoppingcart.userservice.dto.LoginToken;
import com.shoppingcart.userservice.model.User;

public interface UserService {
    public User createUser(User user);
    public LoginToken login(LoginRequest loginRequest);
    public boolean existsByUsername(String username);
    public boolean existsByEmail(String email);
}
