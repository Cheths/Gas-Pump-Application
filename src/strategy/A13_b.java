package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A13_b - For gas pump 2.
 * 
 * This class implements A13 interface by overriding the abstract method with a specific strategy for GasPump2.
 * @author cheth
 *
 */
public class A13_b implements A13 {
	
	DataStore dataStore;
	public A13_b(DataStore ds){
		dataStore = ds;
	}
	
	public void printReceipt() {
		System.out.println("\n############Receipt############\n");
		System.out.println("Liters Pumped - "+dataStore.getLiter()+"ltrs");
		System.out.println("Total cost - "+dataStore.getTotalI());
	}
}
