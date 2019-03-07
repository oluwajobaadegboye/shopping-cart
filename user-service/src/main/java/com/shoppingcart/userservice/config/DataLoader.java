package com.shoppingcart.userservice.config;

import com.shoppingcart.userservice.model.Role;
import com.shoppingcart.userservice.model.RoleName;
import com.shoppingcart.userservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private RoleRepository roleRepository;

    @Autowired
    public DataLoader(RoleRepository repository) {
        this.roleRepository = repository;
    }

    public void run(ApplicationArguments args) {
        loadDefaultRoles();
    }

    private void loadDefaultRoles(){
        if(!roleRepository.existsByName(RoleName.ROLE_USER)){
            roleRepository.save(new Role(RoleName.ROLE_USER));
        }
        if(!roleRepository.existsByName(RoleName.ROLE_ADMIN)){
            roleRepository.save(new Role(RoleName.ROLE_ADMIN));
        }
    }
}
