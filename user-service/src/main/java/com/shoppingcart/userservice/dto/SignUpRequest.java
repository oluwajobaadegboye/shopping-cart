package com.shoppingcart.userservice.dto;

import com.shoppingcart.userservice.model.Role;
import com.shoppingcart.userservice.model.RoleName;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty; 
import javax.validation.constraints.Size;
import java.util.List;

public class SignUpRequest {

    @NotEmpty
    private String name;

    @NotEmpty
    private String username;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(max = 100)
    private String password;
    @NotEmpty
    private List<RoleName> roles;

    public SignUpRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleName> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleName> roles) {
        this.roles = roles;
    }
}
