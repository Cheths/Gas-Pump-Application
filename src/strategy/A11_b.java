package strategy;

import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A11_b - For gas pump 2.
 * 
 * This class implements A11 interface by overriding the abstract method with a specific strategy for GasPump2.
 * @author cheth
 *
 */
public class A11_b implements A11{

	DataStore dataStore;
	public A11_b(DataStore ds) {
		dataStore = ds;
	}
	
	public void gasPumpedMsg() {
		System.out.println(dataStore.getLiter() +" liters disposed");
		System.out.println("");
	}
}
