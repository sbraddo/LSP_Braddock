/*Sara Braddock
* @author sarabraddock
*/

package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class IntegerSetTest {

	@Test
	public void testConstructor() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		assertEquals("[]", testSet.toString());
	}
	
	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		assertEquals("[1, 2, 3]", testSet.toString());
	}
	
	@Test
	public void testToString() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		assertEquals("[1, 2, 3]", testSet.toString());
	}
	
	@Test
	public void testIsEmpty() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		assertEquals(false, testSet.isEmpty());
		testSet.clear();
		assertEquals(true, testSet.isEmpty());
	}
	
	@Test
	public void testSmallest() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		assertEquals(1, testSet.smallest());
	}
	
	@Test
	public void testLargest() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		assertEquals(3, testSet.largest());
	}
	
	@Test
	public void testClear() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.clear();
		assertEquals("[]", testSet.toString());
	}
	
	@Test
	public void testLength() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		assertEquals(3, testSet.length());
	}
	
	@Test
	public void testEquals() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		IntegerSet testSet2 = testSet;
		assertEquals(true, testSet.equal(testSet2));
	}
	
	@Test
	public void testContains() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		assertEquals(true, testSet.contains(2));
	}
	
	@Test
	public void testRemove() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.remove(2);
		assertEquals(false, testSet.contains(2));
	}
	
	@Test
	public void testUnion() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(4);
		testSet2.add(5);
		testSet.union(testSet2);
		assertEquals("[1, 2, 3, 4, 5]", testSet.toString());
	}
	
	@Test
	public void testIntersect() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(1);
		testSet2.add(2);
		testSet.intersect(testSet2);
		assertEquals("[1, 2]", testSet.toString());
	}
	
	@Test
	public void testDifference() {
//		fail("Not yet implemented");
		IntegerSet testSet = new IntegerSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(3);
		testSet2.add(4);
		testSet.difference(testSet2);
		assertEquals("[1, 2]", testSet.toString());
	}
	
}
