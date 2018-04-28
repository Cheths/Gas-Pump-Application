package abstractfactory;

import datastore.DataStore;
import datastore.DataStore1;
import strategy.*;

/**
 * ABSTRACT FACTORY PATTERN ELEMENT
 * Concrete Factory element for GasPump1.
 * 
 * This class represents the concrete factory class used to handle creation of objects relevant to GasPump1.
 * @author cheth
 *
 */
public class GasPump1CF extends AbstractFactory{

	DataStore dataStore;
	/*
	 * Initialize dataStore to point to DataStore1 class
	 */
	public GasPump1CF() {
		dataStore = new DataStore1();
	}
	/*
	 * Return a pointer to a new instance of A1_a(StoreData() specific to GasPump1)
	 */
	public DataStore getDataStore() {
		return dataStore;
	}
	/*
	 * Return a pointer to a new instance of A2_a(payMessage() specific to GasPump1)
	 */
	public A1 getA1() {
		return new A1_a(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A2_a(payMessage() specific to GasPump1)
	 */
	public A2 getA2() {
		return new A2_a();
	}
	/*
	 * Return a pointer to a new instance of A3_a(reject() method for GasPump1)
	 */
	public A3 getA3() {
		return new A3_a();
	}
	/*
	 * Return a pointer to a new instance of A4_a(cancel() method for GasPump1)
	 */
	public A4 getA4() {
		return new A4_a();
	}
	/*
	 * Return null since storeCash() method isn’t applicable for GasPump2)
	 */
	public A5 getA5() {
		return null;//return new A5_Float(dataStore);//Not used
	}
	/*
	 * Return a pointer to a new instance of A6_a(displayMenu() specific to GasPump1)
	 */
	public A6 getA6() {
		return new A6_a();
	}
	/*
	 * Return a pointer to a new instance of A7_Float(setPrice() float version specific to GasPump1)
	 */
	public A7 getA7() {
		return new A7_Float(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A8_a(setInitialValues() specific to GasPump1)
	 */
	public A8 getA8() {
		return new A8_a(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A9_a(readyMsg() method for GasPump1)
	 */
	public A9 getA9() {
		return new A9_a();
	}
	/*
	 * Return a pointer to a new instance of A10_a(pumpGasUnit() specific to GasPump1)
	 */
	public A10 getA10() {
		return new A10_a(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A11_a(gasPumpedMsg() specific to GasPump1)
	 */
	public A11 getA11() {
		return new A11_a(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A12_a(stopMsg() method for GasPump1)
	 */
	public A12 getA12() {
		return new A12_a();
	}
	/*
	 * Return a pointer to a new instance of A13_a(printReceipt() specific to GasPump1)
	 */
	public A13 getA13() {
		return new A13_a(dataStore);
	}
	/*
	 * Return a pointer to a new instance of A14_a(returnCash() specific to GasPump1)
	 */
	public A14 getA14() {
		return new A14_a(dataStore);
	}

}
