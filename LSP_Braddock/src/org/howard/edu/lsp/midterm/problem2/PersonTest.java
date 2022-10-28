/**
 * @author sarabraddock
 */

package org.howard.edu.lsp.midterm.problem2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

class PersonTest {

	@Test
	void testToString() {
		Person tester = new Person("Sara","222-22-222",20);
		assertEquals("Sara, 20, 222-22-222", tester.toString());
	}
	
	@Test
	void testEquals() {
		Person tester = new Person("Sara","222-22-222",20);
		Person tester2 = new Person("Cooper", "666-66-666", 56);
		Person tester3 = new Person("Day", "666-66-666", 30);
		assertEquals(false, tester.equals(tester2));
		assertEquals(true, tester2.equals(tester3));
	}

}
