package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.binding.User;
import com.tcs.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	
//Insert data
	
	public boolean saveUser(User user)
	{
		user = userRepo.save(user);
		return user.getId() > 0;
		
	}
	
	//Retrive data
	
	public List<User> getAllUsers()
	{
		return userRepo.findAll();
	}
	
}
