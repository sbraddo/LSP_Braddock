package org.howard.edu.lsp.assignment2;

import java.util.Arrays;

/**
 * Sara Braddock - LSP Fall 2022
 * Assignment 2
 * @author sarabraddock
 *
 */

public class CalculateCombinations {
	public void compute(int[] input, int sum) {
		//edges cases for empty arrays and sum = 0 
		int [] results = {};
		if (input.length == 0 || sum == 0) {
			System.out.print(Arrays.toString(results));
		}
		int temp = 0;
		//test which combinations add up to target sum 
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j ++) {
				//check that current number is less than target 
					if (input[j] < sum && input[i] < sum) {
						temp = input[j] + input[i];
						if (temp == sum) {
							int[] opt = new int[2];
				            opt[0] = input[i];
				            opt[1] = input[j];
				            System.out.print(Arrays.toString(input) + "\n");
						}
					}
					for (int k = 0; k < input.length; k++) {
						temp = input[i] + input[j] + input[k];
						if (temp == sum) {
							int [] t = new int [3];
							t[0] = input[i];
							t[1] = input[j];
							t[2] = input[k];
							System.out.print(Arrays.toString(t) + "\n");
						}
					}
			}
		}
   	}

}
