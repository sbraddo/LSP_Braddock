/**
 * @author sarabraddock
 */
package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;
	
	public Person(String nameP,  String sSN, int ageP) {
		// initialize private variables
		name = nameP;
		age = ageP;
		socialSecurityNumber = sSN;
	}
	
	public String toString() {
		String ageString = Integer.toString(age);
		String personString = name + ", " + ageString  + ", " + socialSecurityNumber;
		return personString; 
	}
	
	public String getSSN() {
		return socialSecurityNumber;
	}
	
	public boolean equals(Person testPerson) {
		boolean isEqual;
		if (socialSecurityNumber.equals(testPerson.getSSN())) {
			System.out.println("These are the same");
			isEqual = true;
		}
		else {
			System.out.println("Not the same!"); 
			isEqual = false;
		}
		return isEqual;
	}


}
