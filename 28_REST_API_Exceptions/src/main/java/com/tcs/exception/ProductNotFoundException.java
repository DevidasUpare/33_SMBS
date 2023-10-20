package com.tcs.exception;

                                              //or Exception
public class ProductNotFoundException extends RuntimeException 
{

	public ProductNotFoundException()
	{
		
	}
	
	public ProductNotFoundException(String msg)
	{
		super(msg);
	}
}
