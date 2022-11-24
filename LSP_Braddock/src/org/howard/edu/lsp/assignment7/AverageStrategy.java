/**
 * @author sarabraddock
 */

package org.howard.edu.lsp.assignment7;
import java.util.ArrayList;

public interface AverageStrategy {
	public int compute(ArrayList<Integer> grades) throws EmptyListException;
}
