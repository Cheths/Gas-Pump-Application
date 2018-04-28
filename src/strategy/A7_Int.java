package strategy;
import datastore.DataStore;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A7_Int(Integer Version) - For gas pump 2.
 * 
 * This class implements A7 interface by overriding the abstract method with a specific strategy(integer version) for GasPump2.
 * @author cheth
 *
 */
public class A7_Int implements A7{

	DataStore dataStore;
	public A7_Int(DataStore ds){
		dataStore = ds;
	}
	
	public void setPrice(int g){
		if(g == 1){
			dataStore.setPriceI(dataStore.getRPriceI());
		}else if(g == 2){
			dataStore.setPriceI(dataStore.getSPriceI());
		}else if(g == 3){
			dataStore.setPriceI(dataStore.getPPriceI());
		}
	}
}
