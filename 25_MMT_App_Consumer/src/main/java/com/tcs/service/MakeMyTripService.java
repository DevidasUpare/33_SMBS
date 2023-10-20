package com.tcs.service;

import java.util.List;

import com.yash.request.Passenger;
import com.yash.response.Ticket;

public interface MakeMyTripService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public List<Ticket> getTickets();
	
	public Ticket getTicket(Integer ticketNum);

}
