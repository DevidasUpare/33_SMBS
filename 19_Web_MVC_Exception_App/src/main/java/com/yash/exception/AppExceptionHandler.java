package com.yash.exception;

import java.time.LocalDateTime;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value =Exception.class)
	public String handleAe(ArithmeticException ex, Model model)
	{
		System.out.println("exception-handler method executed....");
		
		model.addAttribute("exRsn", ex.getMessage());
		model.addAttribute("date", LocalDateTime.now());
		
		return "error";
}
}
