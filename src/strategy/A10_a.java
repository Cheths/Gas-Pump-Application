package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A10_a - For gas pump 1.
 * 
 * This class implements A10 interface by overriding the abstract method with a specific strategy for GasPump1.
 * @author cheth
 *
 */
public class A10_a implements A10{

	DataStore dataStore;
	public A10_a(DataStore ds){
		dataStore = ds;
	}
	
	public void pumpGasUnit() {
		//For gallons
		int gallon = dataStore.getGallon();
		gallon++;
		float total = dataStore.getPriceF() * gallon;
		dataStore.setGallon(gallon);
		dataStore.setTotalF(total);
	}
}
