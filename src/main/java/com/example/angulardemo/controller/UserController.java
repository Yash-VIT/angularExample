package com.example.angulardemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.angulardemo.entity.User;
import com.example.angulardemo.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public Iterable<User> getUser(){
		return userService.getUser();
	}

	@PostMapping("/users")
	public boolean addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
}
