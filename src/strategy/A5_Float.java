package strategy;


import datastore.*;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A5_Float - For gas pump 1.
 * 
 * This class implements A5 interface by overriding the abstract method with a generic strategy for both the GasPumps.
 * @author cheth
 *
 */
public class A5_Float implements A5{

	DataStore dataStore;
	public A5_Float(DataStore ds) {
		dataStore = ds; 
	}
	
	public void storeCash(DataStore dataStore) {
		dataStore.setCash(dataStore.getTempCash());
	}

}
