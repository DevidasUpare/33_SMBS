package com.yash.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/welcome")
	public String welcomeMsg(Model model)
	{
		model.addAttribute("msg", "Welcome to Ashok IT...!!!");
		int i =10/0;
		return "index";
		
	}
	
	//Local Exception handling
	@ExceptionHandler(value =Exception.class)
	public String handleAe(ArithmeticException ex, Model model)
	{
		System.out.println("exception-handler method executed....");
		
		model.addAttribute("exRsn", ex.getMessage());
		model.addAttribute("date", LocalDateTime.now());
		
		return "error";
	}

}
