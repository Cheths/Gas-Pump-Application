package strategy;
import datastore.*;

/**
 * STRATEGY PATTERN ELEMENT
 * Interface: A5 - Supports a strategy for storeCash().
 * 
 * This class represents the interface for various strategies of storeCash() operation. 
 * @author cheth
 *
 */
public interface A5 {
	
	public void storeCash(DataStore dataStore);
}
