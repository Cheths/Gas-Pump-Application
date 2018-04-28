package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A7_Float(Float version) - For gas pump 1.
 * 
 * This class implements A7 interface by overriding the abstract method with a specific strategy(float version) for GasPump1.
 * @author cheth
 *
 */
public class A7_Float implements A7{

	DataStore dataStore;
	public A7_Float(DataStore ds){
		dataStore = ds;
	}
	
	public void setPrice(int g){
		if(g == 1){
			dataStore.setPriceF(dataStore.getRPriceF());
		}else if(g == 2){
			dataStore.setPriceF(dataStore.getSPriceF());
		}
	}
}
