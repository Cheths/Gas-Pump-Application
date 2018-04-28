package strategy;
import datastore.DataStore;

/**
 * 
 * STRATEGY PATTERN ELEMENT
 * Interface: A1 - Supports two strategies for storeData.
 * 
 * This class represents the interface for various strategies of storeData() operation. 
 * @author cheth
 *
 */
public interface A1 {
	
	public void storeData(DataStore dataStore);
}
