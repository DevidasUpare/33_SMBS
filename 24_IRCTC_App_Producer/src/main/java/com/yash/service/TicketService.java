package com.yash.service;

import java.util.List;

import com.yash.entity.Ticket;
import com.yash.request.Passenger;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicket(Integer ticketNum);
	
	public List<Ticket> getAllTickets();

}
