package in.ashokit.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(21);
		al.add(32);
		al.add(5);
		al.add(8);
		
		System.out.println("Elements Before Sorting :: "+ al);
		
		//Approach -1 (Implementing Comparator Interface)
		//Collections.sort(al, new ElementsSortingComparator());
		
		//Approach -2 (Anonymous Implementation for Comparator)
		/*Collections.sort(al, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;
			
			}
		});*/
		
		//Approach -3 (Using Lambdas)
		Collections.sort(al, (o1, o2) -> {
			return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;
		});
		
		System.out.println("Elements After Sorting :: " + al);
		
	}

}

class ElementsSortingComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		/*if (o1 > o2) {
			return 1;
		}
		else if (o1 < o2) {
			return -1;
		}
		else {
		return 0;
		}*/
		
		return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;
	}
}
