package com.tcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.constants.AppConstants;
import com.tcs.model.Order;

@RestController
public class OrderRestController {
	
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order)
	{
		kafkaTemplate.send(AppConstants.TOPIC, order);
		
		return "Order Palced";
	}

}
