package com.tcs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApproachOne {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Nil", "nil@gmail.com");
		Person p2 = new Person(102, "Nitin", "nitin@gmail.com");
		Person p3 = new Person(103, "Mukesh", "mukesh@gmail.com");
		Person p4 = new Person(104, "Vaibhav", "vaibhav@gmail.com");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		System.out.println("================Objects Before Sorting================");
		for (Person p : persons) {
			System.out.println(p);
		}
		//Sorting logic
		Collections.sort(persons, new PersonComparator());

		System.out.println("================Objects After Sorting================");
		for (Person p : persons) {
			System.out.println(p);
		}

	}

}

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getPname().compareTo(o2.getPname());

	}
}