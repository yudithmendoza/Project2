package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * methods to represent all set operations
 * union, intersect, complement, difference, and symmetric difference
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
		
		//make an array of booleans that goes from 0-(max integer from original set)
		int max = Collections.max(set);		
		boolean[] comp = new boolean[max+1];
		
		//set all indices from set A true
		for(int elem : setA) {
			comp[elem] = true;
		}
		
		//checks which values are false and if they are also in the original set
		List<Integer> result = new ArrayList<>();
        	for (int i = 0; i < comp.length; i++) {
            	if (!comp[i] && set.contains(i)) {
                result.add(i);
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

		//will collect max value from both sets
		int max = Math.max(Collections.max(setA), Collections.max(setB));
        	boolean[] union = new boolean[max+1];

        	// Mark elements first set
        	for (int elem : setA) {
            	union[elem] = true;
        	}
        	//from second set
        	for (int elem : setB) {
            	union[elem] = true;
        	}

        	// Collect indices where value is true
        	List<Integer> result = new ArrayList<>();
        	for (int i = 0; i < union.length; i++) {
            	if (union[i]) {
                result.add(i);
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
	public List<Integer> intersect(List<Integer> setA, List<Integer>setB) {
		//TODO
		return null;
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
		//TODO
		return null;
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
		//TODO
		return null;
	}
	
	/**
	 * adds sets A and B (only for multisets)
	 * @param setA
	 * @param setB
	 * @return
	 */
	public List<Integer> add(List<Integer> setA, List<Integer> setB) {
		//TODO
		return null;
	}
	
}
