package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@GetMapping("/login")
	public String login(HttpServletRequest req, Model model)
	{
		String name = req.getParameter("name");
		System.out.println("Name :: "+ name);
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		model.addAttribute("msg", "User logged in (session created)");
		return "index";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpServletRequest req, Model model)
	{
		
		HttpSession session=req.getSession();
		String name =(String)session.getAttribute("name");
		
		System.out.println("Name :: "+ name);
		model.addAttribute("msg", name+", Welcome to our Website");
		return "index";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model)
	{
		
		HttpSession session=req.getSession();
		session.invalidate();
		
		model.addAttribute("msg", "User logged out Successfully");
		return "index";
}
}
	
	
//
//	@GetMapping("/login")
//	public String login(HttpServletRequest req, Model model)
//	{
//		HttpSession session=req.getSession();
//		session.setAttribute("name", name);
//		model.addAttribute("msg","User logged in (session created)");
//		
//		return "index";
//	}
//	@GetMapping("/dashboard")
//	public String dashboard(HttpServletRequest req, Model model)
//	
//	{
//		
//		
//		return "index";
//	}
//	}