package org.howard.edu.lsp.midterm.problem1;
import java.util.ArrayList;

public class VotingMachine {
	// YOU must decide upon an appropriate data representation to associate a name with respective votes.  Create whatever you like.
		ArrayList<String> candidates = new ArrayList<String>();
		ArrayList<Integer> votes = new ArrayList<Integer>();
		
		/** 
		 * adds a new candidate to the VotingMachine 
		 * @param name
		 */
		public void addCandidate(String name) {
			// Add a candidate to the list, initialize number of votes to 0
			candidates.add(name);
			votes.add(0);
		} 
		/**
		 * casts votes to given candidate, throws exception if the candidate is not found
		 * @param name
		 * @param vote
		 */
		public void castVotes(String name, int vote) {
			// Cast votes to the candidate with the given name
			int idxOfCandidate = candidates.indexOf(name);
			int updatedVotes = vote + votes.get(idxOfCandidate);
			votes.set(idxOfCandidate, updatedVotes);
		}
		/**
		 * returns the total votes a given candidate received
		 * @param names
		 * @return int numVotes
		 */
		public int getVotes(String names)  {
			// Return the number of votes for a given candidate.  Throws
			// UnknownCandidateException if name not present.  Make this a 
			// checked exception.
			if (candidates.indexOf(names) == -1) {
				throw new ArrayIndexOutOfBoundsException("UnknownCandidateException; candidate not found");
			}
			int idxOfCandidate = candidates.indexOf(names);
			int numVotes = votes.get(idxOfCandidate);
			return numVotes;
			
		}
		/**
		 * returns the total number of votes cast
		 * @return int VoteSum
		 */
		public int sum() {
			// Return the total number of votes for all candidates.	
			int voteSum = 0;
			for (int i = 0; i < votes.size(); i++) {
				voteSum = voteSum + votes.get(i);
			}
			return voteSum;
		}

}
