package project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
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
	}
	/**
	 * prints HashSet
	 * @param list
	 */
	public static void printHS(HashSet<Integer> list) {
		Iterator<Integer> it = list.iterator();
		if (it.hasNext()) {
		    System.out.print(it.next());
		}
		while (it.hasNext()) {
		    System.out.print(", " + it.next());
		}
	}

	public static void main(String[] args) {
		
		SetOperations so = new SetOperations();
		MSOperations ms = new MSOperations();
		
		List<Integer> set = new ArrayList<>(
				Arrays.asList(2, 3, 4, 6, 7, 9, 10, 11, 15, 17)); //initializing list 
																		

		List<Integer> setA = new ArrayList<>(
				Arrays.asList(3, 7, 9, 11, 15, 17)); // will contain all odd numbers 
		
		
		List<Integer> setB = new ArrayList<>(
				Arrays.asList(2, 3, 7, 11, 17)); // will contain all prime numbers
		
		
		System.out.print("Sets:\nSet: ");
		print(set);
		
		System.out.print("\n\nSet A: ");
		print(setA);
		
		System.out.print("\n\nSet B: ");
		print(setB);
		
		System.out.println("\n\nOperations:\n"
				+ "----------------------------------------------");
		
		System.out.print("Not A: ");
		List<Integer> notA = so.complement(set, setA);
		print(notA);
		
		
		System.out.print("\nA ∪ B: ");
		List<Integer> setUnion = so.union(setA, setB);
		print(setUnion);	
		
		System.out.print("\nA ∩ B: ");
		HashSet<Integer> setIntersect = so.intersect(setA, setB);
		printHS(setIntersect);
		
		
		System.out.print("\nA - B: ");
		List<Integer> subAFromB = so.difference(setA, setB);
		print(subAFromB);
		
		System.out.print("\nA ⊕ B: ");
		List<Integer> symDifference = so.symmetricDifference(setA, setB);
		print(symDifference);
		
		//Multisets and their operations
		//able to reuse Intersect A ∩ B from sets operations
		//union and difference had to be rewrote 
		
		System.out.println("\n\n\nMultisets:");
		
		List<Integer> set2 = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5)); 
		
		List<Integer> setC = new ArrayList<>(
				Arrays.asList(1, 2, 2, 2, 3, 3, 3, 4, 4, 4));  
		
		List<Integer> setD = new ArrayList<>(
				Arrays.asList(1, 2, 2, 2, 3, 5, 5, 5)); 
		
		System.out.print("Set: ");
		print(set2);
		
		System.out.print("\n\nSet C: ");
		print(setC);
		
		System.out.print("\n\nSet D: ");
		print(setD);
		
		System.out.println("\n\nOperations:\n"
				+ "----------------------------------------------");
		
		System.out.print("C ∪ D: ");
		List<Integer> msUnion = ms.union(setC, setD);
		print(msUnion);
		
		System.out.print("\nC ∩ D: ");
		HashSet<Integer> msIntersect = so.intersect(setC, setD);
		printHS(msIntersect);
		
		System.out.print("\nC + D: ");
		List<Integer> msAdd = ms.add(setC, setD);
		print(msAdd);
		
		System.out.print("\nC - D: ");
		List<Integer> msDifference = ms.difference(setC, setD);
		print(msDifference);
	}	
}
