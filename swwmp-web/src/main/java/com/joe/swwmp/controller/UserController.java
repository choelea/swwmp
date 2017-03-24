package com.joe.swwmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joe.swwmp.domain.User;
import com.joe.swwmp.domain.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value="/user/{username}")
	public User getUser(@PathVariable String username){
		User user = userRepo.findByUsername(username);
		return user;
	}
}
