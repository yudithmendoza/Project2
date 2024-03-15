package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * methods to represent all set operations
 * union, intersect, complement, difference, and symmetric difference of sets
 * 
 */
public class SetOperations {
	/**
	 * complement of set A
	 * removing elements of set A from original set
	 * 
	 * @param set
	 * @param setA
	 * @return complement of set A
	 */
	public List<Integer> complement(List<Integer> set, List<Integer> setA) {
		
		int size = set.size();
		boolean[] check = new boolean[size];
		
		List<Integer> result = new ArrayList<>();	
		
		for(int x = 0; x < size; x++) {
			if(setA.contains(set.get(x))){
				check[x] = true;		//if set A has the element at x, check[x] gets marked as true
			}
		}
		
		for(int x = 0; x < size; x++) {
			if(!check[x]) {
				result.add(set.get(x));		//add any items from boolean array that are false 
			}
		}
        return result;
	}
	
	/**
	 * creates a union of two sets
	 * returns elements that are in set1 or set2, or both
	 * @param set1
	 * @param set2
	 * @return union 
	 */
	public List<Integer> union(List<Integer> setA, List<Integer>setB) {
		
		int max = Math.max(Collections.max(setA), Collections.max(setB));	//will collect max value from both sets
		boolean[] union = new boolean[max+1];
		
		for (int elem : setA) {
			union[elem] = true;		// Mark elements from first set
		 }
		  
		for (int elem : setB) {
			union[elem] = true;		//from second set
		}

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < union.length; i++) {
			if (union[i]) {
				result.add(i);		// Collect indices where value is true
		    }
		}
		
		return result;
	}
		
	
	/**
	 * intersection of both sets
	 * returns elements that are elements in both A and B
	 * 
	 * @param setA
	 * @param setB
	 * @return the intersection of both sets
	 */
	public HashSet<Integer> intersect(List<Integer> setA, List<Integer>setB) {
		
		int size = setA.size();
		boolean[] check = new boolean[size];
		
		HashSet<Integer> result = new HashSet<>();		//created a hashset so we can use this approach for multi-sets
		
		for(int x = 0; x < size; x++) {
			if(setB.contains(setA.get(x))){			//checks index as true if element is also in set B
				check[x] = true;
			}
		}
		
		for(int x = 0; x < size; x++) {
			if(check[x]) {
				result.add(setA.get(x));		//adds element from set A if its index is marked true in boolean array
			}
		}
		return result;
	}
	
	/**
	 * difference of two sets A and B
	 * returns elements that are in setA, but not in setB
	 * 
	 * @param setA
	 * @param setB
	 * @return difference of setA and setB
	 */
	public List<Integer> difference(List<Integer> setA, List<Integer> setB) {
		
		int size = setA.size();
		boolean[] check = new boolean[size];
		
		for(int x = 0; x < size; x++) {
			if(setB.contains(setA.get(x))) {
				check[x] = true;			//mark indices in boolean array as true if corresponding index element from set A is also in set B
			}
		}
		
		List<Integer> result = new ArrayList<>();	
		 
		for(int x = 0; x < size; x++) {
			if(!check[x]) {
				result.add(setA.get(x));		//adds element from set A if its index is marked false in boolean array
			}
		}
		return result;
	}
	
	/**
	 * symmetric difference of sets A and B
	 * return elements that are a member of exactly one of A and B, but not both
	 * 
	 * @param setA
	 * @param setB
	 * @return
	 */
	public List<Integer> symmetricDifference(List<Integer> setA, List<Integer> setB) {
	
		List<Integer> result = new ArrayList<>();
		
		result = (union(difference(setA, setB), difference(setB, setA)));  //(A-B) ∪ (B-A)
		return result;
	}
}
