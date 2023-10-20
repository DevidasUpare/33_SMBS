package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v2")
public class DemoController {


	
	
	@GetMapping("/login")
	public String test2(Model model)
	{
		//model.addAttribute("msg", "This is test2 () method");
		//logic goes here
		//if credentials are valid then redirect request to dashboard
		//if credentials are invalid then return login page
		
		boolean isCredentialsValid=true;
		if(isCredentialsValid) {
			
		
		return "redirect:/dashboard?id=101";    //forward:/dashboard?id=101
	}
		else {
			return "index";
		}
	}
}

