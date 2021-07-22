package com.example.angulardemo.service;

import com.example.angulardemo.entity.User;

public interface UserService {

	public Iterable<User> getUser();
	public boolean addUser(User user);
	
}
