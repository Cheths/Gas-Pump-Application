package strategy;
import datastore.DataStore;
/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A1_a - For gas pump 1.
 * 
 * This class implements A1 interface by overriding the abstract method with a specific strategy for GasPump1.
 * @author cheth
 *
 */
public class A1_a implements A1{

	DataStore dataStore;
	public A1_a(DataStore ds) {
		dataStore = ds;
	}
	/*
	 * Set Regular and Super gas price from the temporary variables.
	 */
	public void storeData(DataStore dataStore) {
		dataStore.setRPriceF(dataStore.getTempRPriceF());
		dataStore.setSPriceF(dataStore.getTempSPriceF());
	}

	
}
