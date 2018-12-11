package com.rest.restfulwebservices.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.restfulwebservices.model.Post;
import com.rest.restfulwebservices.respository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public Post save(Post post) {
		return postRepository.save(post);
	}
}
