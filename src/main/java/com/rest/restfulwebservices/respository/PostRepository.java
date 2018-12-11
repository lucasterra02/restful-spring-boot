package com.rest.restfulwebservices.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.restfulwebservices.model.Post;

public interface PostRepository  extends JpaRepository<Post, Integer>  {

}
