package com.shoppingcart.userservice.repository;

import com.shoppingcart.userservice.model.Role;
import com.shoppingcart.userservice.model.RoleName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
    public boolean existsByName(RoleName roleName);
}
