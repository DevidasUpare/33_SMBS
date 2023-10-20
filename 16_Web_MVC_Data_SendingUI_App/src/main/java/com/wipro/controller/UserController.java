package com.wipro.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.binding.User;

@Controller 
public class UserController {
	
	//List of object data to UI page
	@GetMapping("/users")
	public String getUsers(Model model)
	{
		User u1=new User(101,"Ashok","ashok@gmail.com");
		User u2=new User(102,"Raju","raju@gmail.com");
		User u3=new User(103,"Rani","rani@gmail.com");
		
		List<User> usersList = Arrays.asList(u1,u2,u3);
		model.addAttribute("usersData", usersList);
		return "view-users";
		
	}
	//Sending Object Data To UI page
	@GetMapping("/user")
	public String getUserData(Model model)
	{
		User userObj=new User(101,"Devdas","devidasupare1@gmail.com");
		
		model.addAttribute("user", userObj);
		return "user-data";
	}
	
	//second way to send data from controller to UI
	@GetMapping("/email")
	public String getUserEmail(Model model)
	{
		model.addAttribute("data", "devidasupare@gmail.com");
		
		return "index";
	}
	
	//First way to send data from controller to UI
	@GetMapping("/name")  //url pattern
	public ModelAndView getUserName()
	{
		ModelAndView mav=new ModelAndView();
		
		//set data to model
		mav.addObject("data", "Ashok");
		
		//set view name
		mav.setViewName("index");
		
		return mav;
	}

}
