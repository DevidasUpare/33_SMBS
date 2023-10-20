package com.tcs.service;

import java.util.List;

import com.yash.request.Passenger;
import com.yash.response.Ticket;

import reactor.core.publisher.Mono;

public interface MakeMyTripService {
	
	public Mono<Ticket> bookTicket(Passenger passenger);
	
	public Mono<Ticket[]> getTickets();
	
	public Mono<Ticket> getTicket(Integer ticketNum);

}
