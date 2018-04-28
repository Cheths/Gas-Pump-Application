package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A8_a - For gas pump 1.
 * 
 * This class implements A8 interface by overriding the abstract method with a specific strategy for GasPump1.
 * @author cheth
 *
 */
public class A8_a implements A8{
	
	DataStore dataStore;
	public A8_a(DataStore ds) {
		dataStore = ds;
	}
	
	public void setInitialValues() {
		dataStore.setGallon(0);
		dataStore.setTotalF(0);
	}
	
}
