package com.rest.restfulwebservices.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.restfulwebservices.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
