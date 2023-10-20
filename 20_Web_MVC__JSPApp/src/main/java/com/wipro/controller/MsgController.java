package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model)
	{
		model.addAttribute("msg", "Welcome to ashok it.....");
		return "index";
	}

	@GetMapping("/greet")
	public String getGreetMsg(Model model)
	{
		model.addAttribute("msg", "Good Morning.....");
		return "index";
	}
}
