package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A10_b - For gas pump 2.
 * 
 * This class implements A10 interface by overriding the abstract method with a specific strategy for GasPump2.
 * @author cheth
 *
 */
public class A10_b implements A10{

	DataStore dataStore;
	public A10_b(DataStore ds){
		dataStore = ds;
	}
	
	public void pumpGasUnit() {
		//For liters
		int liters = dataStore.getLiter();
		liters++;
		int total = dataStore.getPriceI() * liters;
		dataStore.setLiter(liters);
		dataStore.setTotalI(total);
	}
}
