package abstractfactory;

import datastore.DataStore;
import strategy.*;

/*
 * ABSTRACT FACTORY PATTERN ELEMENT
 * Builds needed DataStore and Strategy element(Actions) based on GasPump1 or GasPump2.
 * 
 * This class represents the abstract class for the factory method and  is used to group all the concrete factories for GasPump1 and GasPump2.
 */
public abstract class AbstractFactory {
	/* Below are abstract methods*/
	public abstract DataStore getDataStore();
	public abstract A1 getA1();
	public abstract A2 getA2();
	public abstract A3 getA3();
	public abstract A4 getA4();
	public abstract A5 getA5();
	public abstract A6 getA6();
	public abstract A7 getA7();
	public abstract A8 getA8();
	public abstract A9 getA9();
	public abstract A10 getA10();
	public abstract A11 getA11();
	public abstract A12 getA12();
	public abstract A13 getA13();
	public abstract A14 getA14();
}
