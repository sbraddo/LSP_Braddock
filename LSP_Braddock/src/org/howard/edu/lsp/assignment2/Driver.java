package org.howard.edu.lsp.assignment2;

public class Driver {
	public static void main() {
		CalculateCombinations comb = new CalculateCombinations();
		comb.compute(new int[]{5,5,15,10}, 15);// test case 1
		comb.compute(new int[]{1,2,3,4,5,6}, 6);// test case 2
		// More test cases	
		comb.compute(new int[]{}, 12);
		comb.compute(new int[]{1,2,3,4,5}, 15);
	}

}
