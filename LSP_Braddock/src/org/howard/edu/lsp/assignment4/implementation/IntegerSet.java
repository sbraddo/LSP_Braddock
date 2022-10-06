/**
 * Sara Braddock
 * @author sarabraddock
 */

package org.howard.edu.lsp.assignment4.implementation;

// importing relevant packages 
import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	// build the default constructor 
	private List<Integer> set;
	public IntegerSet(){
		set = new ArrayList<Integer>();
	  }
	
	// clears the internal representation of the set 
	public void clear(){
	    set.clear();
	  }
	
	// returns the length of that set 
	public int length(){
	    return set.size();
	  }
	
	// helper function; returns the sorted set 
	public List<Integer> sortIntSet(){
		List<Integer> sortedSet;
		sortedSet = set;
		sortedSet.sort(null);
	    return sortedSet;
	  }
	
	//helper function; returns value at given index
	public int getVal(int idx) {
		return set.get(idx);
	}
	
	// returns true if the two sets are equal or false otherwise
	// sets are equal if they contain all the same values regardless of order
	public boolean equal (IntegerSet b){
	    if (set.size() == b.length()){
	    	List<Integer> tempSet;
	    	tempSet = set;
	    	IntegerSet tempB = b;
	    	tempB = b;
	    	tempSet.sort(null);
	    	tempB.sortIntSet();
	    	int count = 0;
	    	while (set.size() > count) {
	    		if (tempSet.get(count) != tempB.getVal(count)){
	    			return false;
	    		}
	    		count++;
	    	}
	    	return true;
		 }
	    return false;
	}
	
	//returns true if the given value is in the set 
	public boolean contains(int val) {
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == val) {
				return true;
			}
		}
		return false;
	}
	
	// returns the largest item in the set 
	public int largest() {
		int max = 0;
		int idx = 0;
		while (set.size() > idx) {
			if (set.get(idx) > max) {
				max = set.get(idx);
			}
			idx++;
		}
		return max;
	}
	
	// returns the smallest item in the list 
	public int smallest() {
		if (set.size() == 0) {
			throw new ArrayIndexOutOfBoundsException("IntegerSetException; empty Integer set");
		}
		else {
			int min = set.get(0); 
			int idx = 0;
			while (set.size() > idx) {
				if (set.get(idx) < min) {
					min = set.get(idx);
				}
				idx++;
			}
			return min;
		}
	}
	
	// adds item to integer set if it is not already in the set 
	public void add (int item) {
	boolean inList = false;
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == item) {
				inList = true;
			}
		}
		if (!inList) {
			set.add(item);
		}
	}
	
	// removes and item from the set if it appears
	public void remove(int item) {
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == item) {
				set.remove(i);
			}
		}
	}
	
	// union; combines two integer sets 
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			set.add(intSetb.getVal(i));
		}
	}
	
	// set intersection; set will contain the elements that appear in both sets 
	public void intersect(IntegerSet intSetb) {
		List<Integer> tempSet = new ArrayList<Integer>();
		for(int i = 0; i < intSetb.length(); i++) {
			for(int j = 0; j < set.size(); j ++) {
				if(set.get(j) == intSetb.getVal(i)) {
					tempSet.add(set.get(i));
				}
			}
		}
		set = tempSet;
	}
	
	// set difference; set will remove the elements that appear in intSetb
	public void difference(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			for (int j = 0; j < set.size(); j++) {
				if (set.get(j) == intSetb.getVal(i)) {
					set.remove(j);
				}
			}
		}
	}
	
	// returns true if set is empty
	public boolean isEmpty() {
		if (set.size() == 0) {
			return true;
		}
		return false; 
	}
	
	// return string representation of the set 
	public String toString() {
		String setString = set.toString();
		return setString; 
	}

}
