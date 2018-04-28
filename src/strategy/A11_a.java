package strategy;

import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A11_a - For gas pump 1.
 * 
 * This class implements A11 interface by overriding the abstract method with a specific strategy for GasPump1.
 * @author cheth
 *
 */
public class A11_a implements A11{

	DataStore dataStore;
	public A11_a(DataStore ds) {
		dataStore = ds;
	}
	
	public void gasPumpedMsg() {
		System.out.println(dataStore.getGallon()+" gallons disposed");
		System.out.println("");
	}
}
