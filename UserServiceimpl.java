package com.mydata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.UserRepository;
import com.mydata.model.User;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User RegisterUSer(User user) {
		return userRepository.save(user);
	}

	@Override
	public boolean isValidUser(User user) {
		
		String username=user.getUsername();
		
		String password=user.getPassword();
		
		User Existinguser=userRepository.findByUsername(username);
		
		return Existinguser != null && Existinguser.getPassword().equals(password);
	}

	
	}

	
	


