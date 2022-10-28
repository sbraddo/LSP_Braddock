package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here I will test the IntegerSet class");
		System.out.println("");
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		//testing .toString, .smallest(), .largest(), and .isEmpty()
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Smallest value in Set1 is: "  + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		System.out.println("Set1 is empty is: " + set1.isEmpty());
		
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		
		//testing .length()
		System.out.println("The length of Set1 is: " + set1.length());
		System.out.println("The length of Set2 is: " + set2.length());
		
		//testing .equals()
		System.out.println("Set1 and Set2 are equal is: " + set1.equal(set2));
		
		//testing .add()
		set2.add(4);
		set2.add(6);
		System.out.println("After adding new values to set2, the value of set 2 is: " + set2.toString());
		
		//testing contains()
		System.out.println("Set1 contains the value 1: " + set1.contains(1));
		
		//testing .remove()
		set2.remove(6);
		System.out.println("The value of set2 after removing 6 is: " + set2.toString());
		
		//testing .union()
		System.out.println("");
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.union(set2); //union of set1 and set2
		
		//result of union of set1 and set2 
		System.out.println("Result of union of set1 and set2: " + set1.toString());
		System.out.println("");
		
		//testing .clear() and .isEmpty()
		set1.clear();
		System.out.println("The value of set1 after being cleared is: " + set1.toString());
		System.out.println("Set1 is empty is: " + set1.isEmpty());
		//System.out.println("Largest? " + set1.largest());
//		System.out.println("Largest? " + set1.smallest());
		
		//testing .intersection()
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.clear();
		set2.add(4);
		set2.add(5);
		
		set1.intersect(set2);
		System.out.println("Result of intersect of set1 and set2: " + set1.toString()); // expected output []
		
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.clear();
		set2.add(1);
		set2.add(2);
		
		set1.intersect(set2);
		System.out.println("Result of intersect of set1 and set2: " + set1.toString()); // expected output [1,2]
		System.out.println("");
		
		//testing .difference() 
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.clear();
		set2.add(3);
		set2.add(4);
		
		set1.difference(set2);
		System.out.println("Result of difference of set1 and set2: " + set1.toString()); // expected output [1,2]
		
		
		
	}

}
