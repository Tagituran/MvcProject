package com.finartz.springmvc.service;

import java.util.List;

import com.finartz.springmvc.entity.User;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(User theUser);

	public User getUser(int theId);

	public void deleteUser(int theId);
	
}
