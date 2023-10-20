package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/test1")
	public String test1(Model model)
	{
		model.addAttribute("msg", "This is test1 () method");
		return "index";
	}
	
	
	@GetMapping("/test2")
	public String test2(Model model)
	{
		model.addAttribute("msg", "This is test2 () method");
		return "index";
	}
}

