package com.tcs.beans;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinApp {
	public static void main(String[] args) {
		
		Person p1 = new Person("Raju", 21);
		Person p2 = new Person("Chetan", 23);
		Person p3 = new Person("Anil", 67);
		Person p4 = new Person("Gita", 14);
		Person p5 = new Person("Suchitra", 26);
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Person> ageLowerLimit = (p) -> p.getAge() >= 21;
		
		Predicate<Person> ageUpperLimit = (p) -> p.getAge() <= 64;
		
		for( Person p: persons) {
			Predicate<Person> predicate = ageLowerLimit.and(ageUpperLimit);
			
			boolean isEligibleForMarriage = predicate.test(p);
			
			if(isEligibleForMarriage) {
				System.out.println(p.getName());
			}
		}
		
	}

}
