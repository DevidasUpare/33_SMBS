package com.tcs.rest;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.exception.ExInfo;

@RestController
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		int i=10/0;
		return "Welcome to Ashok IT";
	}
	//Controller Based Exception Handling(Specific to one Controller)
//	@ExceptionHandler(value=Exception.class)
//	public ResponseEntity<ExInfo> handleEx(Exception e)
//	{
//		ExInfo info=new ExInfo("EX001", e.getMessage(), LocalDate.now());
//		
//		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	

}
