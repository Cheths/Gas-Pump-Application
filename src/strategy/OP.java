package strategy;

import abstractfactory.AbstractFactory;
import datastore.DataStore;

/**
 * MDA ARCHITECTURE ELEMENT
 * Output Processor for MDA Architecture
 * 
 * This class represents the output processor for MDA and is the client of actions for various strategies. 
 * This contains multiple interfaces which are implemented by classes devising strategies.
 * @author Chethan
 *
 */
public class OP {
	
	private AbstractFactory abstractFactory;
	private DataStore dataStore;
	
	private A1 a1;
	private A2 a2;
	private A3 a3;
	private A4 a4;
	private A5 a5;
	private A6 a6;
	private A7 a7;
	private A8 a8;
	private A9 a9;
	private A10 a10;
	private A11 a11;
	private A12 a12;
	private A13 a13;
	private A14 a14;
	
	public OP(AbstractFactory factory) {
		abstractFactory = factory;
		dataStore = abstractFactory.getDataStore();
		
		a1 = abstractFactory.getA1();
		a2 = abstractFactory.getA2();
		a3 = abstractFactory.getA3();
		a4 = abstractFactory.getA4();
		a5 = abstractFactory.getA5();
		a6 = abstractFactory.getA6();
		a7 = abstractFactory.getA7();
		a8 = abstractFactory.getA8();
		a9 = abstractFactory.getA9();
		a10 = abstractFactory.getA10();
		a11 = abstractFactory.getA11();
		a12 = abstractFactory.getA12();
		a13 = abstractFactory.getA13();
		a14 = abstractFactory.getA14();
	}
	
	public void storeData(){
		a1.storeData(dataStore);
	}
	
	public void payMsg(){
		a2.payMessage();
	}
	
	public void storeCash(){
		a5.storeCash(dataStore);
	}
	
	public void displayMenu(){
		a6.displayMenu();
	}
	
	public void rejectMsg(){
		a3.rejectMessage();
	}
	
	public void setPrice(int g){
		a7.setPrice(g);
	}
	
	public void readyMsg(){
		a9.readyMsg();
	}
	
	public void setInitialValues(){
		a8.setInitialValues();
	}
	
	public void pumpGasUnit(){
		a10.pumpGasUnit();
	}
	
	public void gasPumpedMsg(){
		a11.gasPumpedMsg();
	}
	
	public void stopMsg(){
		a12.stopMsg();
	}
	
	public void printReceipt(){
		a13.printReceipt();
	}
	
	public void cancelMsg(){
		a4.cancelMessage();
	}
	
	public void returnCash(){
		a14.returnCash();
	}
}
