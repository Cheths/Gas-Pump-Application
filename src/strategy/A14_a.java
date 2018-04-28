package strategy;

import datastore.DataStore;
import datastore.DataStore2;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A14_a - For gas pump 1.
 * 
 * This class implements A14 interface by overriding the abstract method with a generic strategy for both the GasPumps.
 * @author cheth
 *
 */
public class A14_a implements A14 {

	DataStore dataStore;
	public A14_a(DataStore ds) {
		dataStore = ds;
	}
	
	public void returnCash() {
		if(dataStore instanceof DataStore2){
			float cashLeft = dataStore.getCash() -dataStore.getTotalI();
			System.out.println("\nReturn cash - "+cashLeft);
		}
	}
}
