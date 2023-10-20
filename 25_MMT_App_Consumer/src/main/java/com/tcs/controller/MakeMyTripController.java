package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.service.MakeMyTripService;
import com.yash.request.Passenger;
import com.yash.response.Ticket;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService service;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("passenger", new Passenger());
		
		return "index";
	}
	
	@GetMapping("/search")
	public String search(Model model)
	{
		model.addAttribute("ticket", new Ticket());
		
		return "search";
	}
	
	@PostMapping("/ticket")
	public String handleBookTicketBtn( Passenger passenger, Model model)
	{
		//System.out.println("testing line 32 in controller"+passenger);
		Ticket ticket = service.bookTicket(passenger);
		
		model.addAttribute("ticket", ticket);
		
		return "view-ticket";
	}
	
	@PostMapping("/search-ticket")
	public String searchTicket( @RequestParam("ticketNum") Integer ticketNum, Model model)
	{
		//System.out.println("testing line 32 in controller"+passenger);
		Ticket ticket = service.getTicket(ticketNum);
		model.addAttribute("ticket", ticket);
		
		return "search";
	}

	@GetMapping("/tickets")
	public String viewTickets(Model model)
	{
		List<Ticket> tickets = service.getTickets();
		model.addAttribute("tickets", tickets);
		return "data";
	}
}
