package strategy;
import datastore.DataStore;
/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A1_b - For gas pump 2.
 * 
 * This class implements A1 interface by overriding the abstract method with a specific strategy for GasPump2.
 * @author cheth
 *
 */
public class A1_b implements A1{

	DataStore dataStore;
	public A1_b(DataStore ds) {
		dataStore = ds;
	}

	/*
	 * Set Regular and Super gas price from the temporary variables.
	 */
	public void storeData(DataStore dataStore) {
		dataStore.setRPriceI(dataStore.getTempRPriceI());
		dataStore.setSPriceI(dataStore.getTempSPriceI());
		dataStore.setPPriceI(dataStore.getTempPPriceI());
	}

	
}
