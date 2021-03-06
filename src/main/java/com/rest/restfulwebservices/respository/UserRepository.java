package com.rest.restfulwebservices.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.restfulwebservices.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
