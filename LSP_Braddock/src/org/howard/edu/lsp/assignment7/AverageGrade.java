/**
 * @author sarabraddock
 */

package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;


public class AverageGrade implements AverageStrategy {
	
	public int compute(ArrayList<Integer> grades) throws EmptyListException{
		if (grades.size() == 0) {
			throw new EmptyListException("List is empty!");
		}
		else {
			int sum = 0;
			for (int i = 0; i < grades.size(); i++) {
				sum = sum + grades.get(i);
			}
			
			int avg = sum / (grades.size());
			return avg;
		}
	}

}
