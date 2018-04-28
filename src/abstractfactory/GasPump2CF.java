package abstractfactory;

import datastore.DataStore;
import datastore.DataStore2;
import strategy.*;

/**
 * ABSTRACT FACTORY PATTERN ELEMENT
 * Concrete Factory element for GasPump2.
 * 
 * This class represents the concrete factory class used to handle creation of objects relevant to GasPump2.
 * @author cheth
 *
 */
public class GasPump2CF extends AbstractFactory{

	DataStore dataStore;
	/*
	 * Initialize dataStore to point to DataStore2 class
	 */
	public GasPump2CF() {
		dataStore = new DataStore2();
	}
	/*
	 * Return the dataStore pointer
	 */
	public DataStore getDataStore() {
		return dataStore;
	}
	/*
	 * Return a pointer to a new instance of A1_b(StoreData() specific to GasPump2)
	 */
	public A1 getA1() {
		return new A1_b(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A2_b(payMessage() specific to GasPump2)
	 */
	public A2 getA2() {
		return new A2_b();
	}
	/*
	 * Return a pointer to a new instance of A3_b(reject() method for GasPump2)
	 */
	public A3 getA3() {
		return null;//new A3_a();
	}
	/*
	 * Return a pointer to a new instance of A4_b(cancel() method for GasPump2)
	 */
	public A4 getA4() {
		return new A4_a();
	}
	/*
	 * Return a pointer to a new instance of A5_Float(storeCash() method - float version for GasPump1)
	 */
	public A5 getA5() {
		return new A5_Float(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A6_b(displayMenu() specific to GasPump2)
	 */
	public A6 getA6() {
		return new A6_b();
	}
	/*
	 * Return a pointer to a new instance of A7_Int(setPrice() integer version specific to GasPump2)
	 */
	public A7 getA7() {
		return new A7_Int(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A8_b(setInitialValues() specific to GasPump2)
	 */
	public A8 getA8() {
		return new A8_b(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A9_b(readyMsg() method for GasPump2)
	 */
	public A9 getA9() {
		return new A9_a();
	}

	/*
	 * Return a pointer to a new instance of A10_b(pumpGasUnit() specific to GasPump2)
	 */	
	public A10 getA10() {
		return new A10_b(dataStore);
	}

	/*
	 * Return a pointer to a new instance of A11_b(gasPumpedMsg() specific to GasPump2)
	 */
	public A11 getA11() {
		return new A11_b(dataStore);
	}

	/*
	 * Return a pointer to a new instance of A12_b(stopMsg() method for GasPump2)
	 */
	public A12 getA12() {
		return new A12_a();
	}

	/*
	 * Return a pointer to a new instance of A13_b(printReceipt() specific to GasPump2)
	 */
	public A13 getA13() {
		return new A13_b(dataStore);
	}

	/*
	 * Return a pointer to a new instance of A14_b(returnCash() specific to GasPump2)
	 */
	public A14 getA14() {
		return new A14_a(dataStore);
	}

}
