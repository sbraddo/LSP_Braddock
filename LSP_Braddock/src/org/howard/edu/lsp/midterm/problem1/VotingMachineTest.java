/**
 * @author sarabraddock
 */

package org.howard.edu.lsp.midterm.problem1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


class VotingMachineTest {
	/**
	 * testing Sum method 
	 */
	@Test
	void testSum() {
		VotingMachine testVM = new VotingMachine();
		testVM.addCandidate("First");
		testVM.addCandidate("Second");
		testVM.addCandidate("Third");
		testVM.castVotes("First", 20);
		testVM.castVotes("Second", 15);
		testVM.castVotes("Third", 10);
		assertEquals(45, testVM.sum());
	}
	
	/**
	 * testing getVotes method 
	 */
	@Test
	void testGetVotes() {
		VotingMachine testVM = new VotingMachine();
		testVM.addCandidate("First");
		testVM.addCandidate("Second");
		testVM.castVotes("First", 20);
		assertEquals(20, testVM.getVotes("First"));
		assertEquals(0, testVM.getVotes("Second"));
	}

}
