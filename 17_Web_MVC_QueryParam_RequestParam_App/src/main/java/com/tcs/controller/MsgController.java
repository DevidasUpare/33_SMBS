package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MsgController {

	@GetMapping("/greet")
	public String greetMsg(@RequestParam("name") String name, Model model) {
		String msgTxt = "Good Morning, " + name;
		model.addAttribute("msg", msgTxt); // key ...value
		return "index";
	}
	
	@GetMapping("/enquiry")
	public String getInfo(@RequestParam("course") String course, 
			@RequestParam("trainer") String trainer, 
			Model model) 
	{
		System.out.println("Course :: "+ course);
		System.out.println("Trainer :: "+ trainer);
		
		model.addAttribute("msg", "Contact : +91-9011845406");
		return "index";
		
	}

}
