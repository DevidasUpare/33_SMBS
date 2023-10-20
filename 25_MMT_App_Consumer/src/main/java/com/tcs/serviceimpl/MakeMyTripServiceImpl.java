package com.tcs.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.service.MakeMyTripService;
import com.yash.request.Passenger;
import com.yash.response.Ticket;
@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		String apiUrl="http://localhost:8080/ticket";
		
		RestTemplate rt=new RestTemplate();
		   //System.out.print("testing line 22 interface impl "+passenger.getName());
		//sending post Request(apiUrl, reqBodyData, responseBodyType)
		ResponseEntity<Ticket> responseEntity = 
				rt.postForEntity(apiUrl, passenger, Ticket.class);
		
		Ticket responseBody = responseEntity.getBody();
		
		return responseBody;
	}

	@Override
	public List<Ticket> getTickets() {
		
		String apiUrl="http://localhost:8080/tickets";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);
		
		Ticket[] body = forEntity.getBody();
		List<Ticket> tickets = Arrays.asList(body);
		
		return tickets;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {
	
		String apiUrl="http://localhost:8080/ticket/{ticketNum}";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Ticket> forEntity = rt.getForEntity(apiUrl, Ticket.class, ticketNum);
		
		Ticket body = forEntity.getBody();
		
		return body;
	}

}
