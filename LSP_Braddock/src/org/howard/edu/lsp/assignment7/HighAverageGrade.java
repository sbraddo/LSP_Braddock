/**
 * @author sarabraddock
 */

package org.howard.edu.lsp.assignment7;
import java.util.ArrayList;

public class HighAverageGrade implements AverageStrategy {
	/**
	 * Helper function to return the list without the two lowest scores
	 */
	public ArrayList <Integer> lowestScores (ArrayList<Integer> grades){
		for (int j = 0; j < 2; j++) {
			int min = grades.get(0);
			for (int i = 0; i < grades.size(); i++) {
				if (grades.get(i) < min) {
					min = grades.get(i);
				}
			}
			grades.remove(grades.indexOf(min));
		}
		return grades;
	}
	
	public int compute(ArrayList<Integer> grades) throws EmptyListException{
		if (grades.size() == 0) {
			throw new EmptyListException("List is Empty");
		}
		else {
			grades = lowestScores(grades);
			int sum = 0;
			for (int i = 0; i < grades.size(); i++) {
				sum = sum + grades.get(i);
			}
			
			int avg = sum / (grades.size());
			return avg;
		}
		
	}

}
