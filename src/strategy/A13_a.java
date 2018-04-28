package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A13_a - For gas pump 1.
 * 
 * This class implements A13 interface by overriding the abstract method with a specific strategy for GasPump1.
 * @author cheth
 *
 */
public class A13_a implements A13 {
	
	DataStore dataStore;
	public A13_a(DataStore ds){
		dataStore = ds;
	}
	
	public void printReceipt() {
		System.out.println("\n############Receipt############\n");
		System.out.println("Total cost - "+dataStore.getTotalF());
	}
}
