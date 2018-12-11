package com.rest.restfulwebservices.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.restfulwebservices.model.User;
import com.rest.restfulwebservices.respository.UserRepository;
import com.rest.restfulwebservices.user.exception.UserNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User user) {

		return userRepository.save(user);
	}

	public Optional<User> findOne(int id) {
		Optional<User> user = userRepository.findById(id);

		if (!user.isPresent()) {
			throw new UserNotFoundException("id-" + id);
		}
		return user;
	}

	public void deleteById(int id) {
		userRepository.deleteById(id);
	}
}
