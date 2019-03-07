package com.shoppingcart.userservice.repository;

import com.shoppingcart.userservice.model.RoleName;
import com.shoppingcart.userservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    public boolean existsByName(RoleName roleName);
}
