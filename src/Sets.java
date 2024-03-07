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
		for(int x = 0; x < list.size(); x++) {
			System.out.print(list.get(x) + ", ");
		}
	}

	public static void main(String[] args) {
		
		SetOperations so = new SetOperations();
		
		List<Integer> set = new ArrayList<>(
				Arrays.asList(2, 13, 17, 26, 27, 31, 32, 33, 34, 47)); 		//initializing list 
																			                            // n = 10

		List<Integer> setA = new ArrayList<>(
				Arrays.asList(13, 17, 27, 31, 33, 47)); // will contain all odd numbers 
		
		
		List<Integer> setB = new ArrayList<>(
				Arrays.asList(2, 13, 17, 31, 47)); // will contain all prime numbers
		
		
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
