package project2;

import java.util.ArrayList;
import java.util.List;
/**
 * methods to represent multiset operations
 * union, add, and difference
 */
public class MSOperations {
	/**
	 * the multiplicity of an element is equal to the maximum of the 
	 * multiplicity of an element in A and B
	 * @param setA
	 * @param setB
	 * @return union of two multisets
	 */
	public List<Integer> union(List<Integer> setA, List<Integer>setB) {
		
		List<Integer> copy = new ArrayList<>(setB); //copy second set so no real alterations are made to set B
		List<Integer> result = new ArrayList<>();
	
		for(int x = 0; x < setA.size(); x++) {
			if(copy.contains(setA.get(x))) {
				copy.remove(setA.get(x));						    //remove from second set if element is already in set A
			}													
			result.add(setA.get(x));							    //otherwise add element from set A to new list
		}
		
		result.addAll(copy);									      //add remaining elements of set B
		return result;									
	}
	
	/**
	 * adds sets A and B (does not care for multiplicity)
	 * @param setA
	 * @param setB
	 * @return
	 */
	public List<Integer> add(List<Integer> setA, List<Integer> setB) {
		List<Integer> result = new ArrayList<>();
		
		for(int elem: setA) {
			result.add(elem);			//add all elements from set A
		}
		for(int elem: setB) {
			result.add(elem);			//add all elements from set B
		}
		return result;
	}
	
	/**
	 * The difference of two multisets A and B, is a multiset such that the multiplicity of an
	 * element is equal to the multiplicity of the element in A minus the multiplicity of the
	 * element in B if the difference is +ve, and is equal to 0 if the difference is 0 or negative
	 * 
	 * @param setA
	 * @param setB
	 * @return
	 */
	public List<Integer> difference(List<Integer> setA, List<Integer> setB) {
		
		List<Integer> copy = new ArrayList<>(setB); 		//copy second set so no real alterations are made
		List<Integer> result = new ArrayList<>();
		
		for(int x = 0; x < setA.size(); x++) {
			if(copy.contains(setA.get(x))) {				      //if element is in both sets, nothing gets added
				copy.remove(setA.get(x));					          //element is removed from copy, so element is not checked for in set A again
			}										
			else {
				result.add(setA.get(x));					          //otherwise element from set A is added to new list						
			}
		}
		return result;
	}
}
