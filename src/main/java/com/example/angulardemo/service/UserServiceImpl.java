package com.example.angulardemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.angulardemo.entity.User;
import com.example.angulardemo.entity.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	public Iterable<User> getUser(){
		return userRepository.findAll();
	}
	
	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
	}
	
}
