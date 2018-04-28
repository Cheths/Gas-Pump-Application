package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A8_b - For gas pump 2.
 * 
 * This class implements A8 interface by overriding the abstract method with a specific strategy for GasPump2.
 * @author cheth
 *
 */
public class A8_b implements A8{
	
	DataStore dataStore;
	public A8_b(DataStore ds) {
		dataStore = ds;
	}
	
	public void setInitialValues() {
		dataStore.setLiter(0);
		dataStore.setTotalI(0);
	}
	
}
