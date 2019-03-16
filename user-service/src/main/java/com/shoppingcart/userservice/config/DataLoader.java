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
        saveDefaultRoles();
    }

    private void saveDefaultRoles(){
        saveRole(RoleName.ROLE_USER);
        saveRole(RoleName.ROLE_ADMIN);
    }

    private void saveRole(RoleName roleName){
        if(!roleRepository.existsByName(roleName)){
            roleRepository.save(new Role(roleName));
        }
    }
}
