package com.tcs.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tcs.binding.Activity;

@RestController
public class MyActivityRestController {
	
//	@GetMapping("/")
//	public String invokedBoredApi()
//	{
//		String url ="http://www.boredapi.com/api/activity";
//		
//		RestTemplate rt = new RestTemplate();
//		
//		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);
//		
//		String body = forEntity.getBody();
//		
//		return body;
//	}
	
	@GetMapping("/")
	public String invokedBoredApi()
	{
		String url ="http://www.boredapi.com/api/activity";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Activity> forEntity = rt.getForEntity(url, Activity.class);
		
	Activity body = forEntity.getBody();
	
	String activity = body.getActivity();
		
		return activity;
	}

}
