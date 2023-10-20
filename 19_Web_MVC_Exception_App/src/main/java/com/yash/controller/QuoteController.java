package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {
	
	@GetMapping("/quote")
	public String getQuote(Model model)
	{
		model.addAttribute("msg", "No shortcut avilable for success");
		
		String s=null;
		s.length();
		return "index";
	}

}
