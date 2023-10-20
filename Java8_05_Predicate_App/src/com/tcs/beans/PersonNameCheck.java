package com.tcs.beans;

import java.util.function.Predicate;

public class PersonNameCheck {
	
	public static void main(String[] args) {
		
		Predicate<String> predicate = (name) -> name.length() >=7;
		System.out.println(predicate.test("Devidas"));
	}

}
