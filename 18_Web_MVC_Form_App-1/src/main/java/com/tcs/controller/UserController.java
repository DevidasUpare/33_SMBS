package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.binding.User;
import com.tcs.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	//To load the empty form
	
	@GetMapping("/")
	public String loadForm(Model model)
	{
		model.addAttribute("user", new User());
		return "index";
	}
	
	//To handle form submission
	
	@PostMapping("/user")
	public String handleSubmitBtn(User user, Model model)
	{
		System.out.println(user);
		boolean saveUser = service.saveUser(user);
		if(saveUser) {
			model.addAttribute("msg", "User Data saved successfully....!!!");
		}
		//TODO: Store form data into Database ...Task
		
		return "index";
	}
	@GetMapping("/users")
	public String viewUsers(Model model) {
		List<User> allUsers = service.getAllUsers();
		model.addAttribute("users", allUsers);
		return "view-users";
	}

}
