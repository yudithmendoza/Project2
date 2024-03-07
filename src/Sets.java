package project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sets {
	
	/**
	 * prints elements in list followed by a space and comma
	 * @param list
	 */
	public static void print(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		if (it.hasNext()) {
		    System.out.print(it.next());
		}
		while (it.hasNext()) {
		    System.out.print(", " + it.next());
		}

	public static void main(String[] args) {
		
		SetOperations so = new SetOperations();
		
		List<Integer> set = new ArrayList<>(
				Arrays.asList(2, 3, 4, 6, 7, 9, 10, 11, 15, 17)); //initializing list 
										// n = 10

		List<Integer> setA = new ArrayList<>(
				Arrays.asList(3, 7, 9, 11, 15, 17)); // will contain all odd numbers 
		
		
		List<Integer> setB = new ArrayList<>(
				Arrays.asList(2, 3, 7, 11, 17)); // will contain all prime numbers
		
		
		System.out.println("Original set: ");
		print(set);
		
		System.out.println("\nSet A: ");
		print(setA);
		
		System.out.println("\nSet B: ");
		print(setB);
		
		List<Integer> setUnion = so.union(setA, setB);
		
		System.out.println("\nAfter union: ");
		print(setUnion);	
	}	
}