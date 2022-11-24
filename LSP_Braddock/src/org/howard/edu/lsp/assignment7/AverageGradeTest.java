package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;
//import org.howard.edu.lsp.assignment7.AverageGrade;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AverageGradeTest {
	/**
	 * Testing compute in  AverageGrade.java; this should return the average of the given scores 
	 * @throws EmptyListException
	 */
	@Test
	public void testAverageGrade() throws EmptyListException {
		ArrayList <Integer> testGrades = new  ArrayList<Integer>();
		testGrades.add(100);
		testGrades.add(95);
		testGrades.add(90);
		testGrades.add(85);
		testGrades.add(80);
		AverageGrade testAvgGrade = new AverageGrade();
		assertEquals(90, testAvgGrade.compute(testGrades));
	}
	
	/**
	 * Testing compute in  HighAverageGrade.java; this should return the average after dropping the two lowest scores 
	 * @throws EmptyListException
	 */
	@Test
	public void testHighAverageGrade () throws EmptyListException {
		ArrayList <Integer> testGrades = new  ArrayList<Integer>();
		testGrades.add(100);
		testGrades.add(95);
		testGrades.add(90);
		testGrades.add(85);
		testGrades.add(80);
		HighAverageGrade testHighAvgGrade = new HighAverageGrade();
		assertEquals(95, testHighAvgGrade.compute(testGrades));
	}
	
	/**
	 * Testing the lowestScores method in HigherAverageGrade.java
	 */
	@Test
	public void testLowestScoores (){
		ArrayList <Integer> testGrades = new  ArrayList<Integer>();
		ArrayList <Integer> expGrades = new  ArrayList<Integer>();
		testGrades.add(100);
		testGrades.add(95);
		testGrades.add(90);
		testGrades.add(85);
		testGrades.add(80);
		expGrades.add(100);
		expGrades.add(95);
		expGrades.add(90);
		HighAverageGrade testHighAvgGrade = new HighAverageGrade();
		assertEquals(expGrades, testHighAvgGrade.lowestScores(testGrades));
	}

}
