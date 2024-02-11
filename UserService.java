package com.mydata.service;

import com.mydata.model.User;

public interface UserService {

	public User RegisterUSer(User user);
	
	
	 public boolean isValidUser(User user);
	 
}
