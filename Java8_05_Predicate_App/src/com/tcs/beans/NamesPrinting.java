package com.tcs.beans;

import java.util.function.Predicate;

public class NamesPrinting {
	public static void main(String[] args) {
		
		String[] names = { "Kajal", "Samantha", "Anushka", "Trisha", "Anupama", "Nayanthara", "Aishwariya"};
		
		Predicate<String> predicate = (name) -> name.startsWith("A"); 
		
		//System.out.println(predicate.test("Anushka"));
		
		for (String name: names)
		{
			if(predicate.test(name))
			{
				System.out.println(name);
				
			}
		}
	
	}

}
