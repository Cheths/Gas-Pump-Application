package application;

import abstractfactory.AbstractFactory;
import abstractfactory.GasPump1CF;
import datastore.DataStore;

/**
 * Model Architecture Element
 * Input Processor for MDA Architecture
 * 
 * This class represents GasPump1 component Implementation which addresses all the needs of GasPump1 operations.
 * @author cheth
 *
 */
public class GasPump1 {
	MDAEFSM mdaEfsm;
	AbstractFactory factory;
	DataStore dataStore;
	/*
	 * Constructor to initialize abstract factory, datastore and mdaefsm objects
	 */
	public GasPump1() {
		factory = new GasPump1CF();
		mdaEfsm = new MDAEFSM(factory);
		dataStore = factory.getDataStore();
	}
	/*
	 * Function to activate the gas pump with initial parameters used Function to set gas cost
	 */
	public void activate(float a,float b){
		if(a>0 && b>0){
			dataStore.setTempRPriceF(a);
			dataStore.setTempSPriceF(b);
			mdaEfsm.activate();
		}
	}
	/*
	 * Function to start the gas pump component
	 */
	public void start(){
		mdaEfsm.start();
	}
	/*
	 * Function to make the payment for gas through credit card.
	 */
	public void payCredit(){
		mdaEfsm.payType(1);
	}
	/*
	 * Function to approve the credit card.
	 */
	public void approved(){
		mdaEfsm.approved();
	}
	/*
	 * Function to reject the credit card payment.
	 */
	public void reject(){
		mdaEfsm.reject();
	}
	/*
	 * Function to select Super gas type
	 */
	public void superGas(){
		mdaEfsm.selectGas(2);
	}
	/*
	 * Function to select Regular gas type
	 */
	public void regularGas(){
		mdaEfsm.selectGas(1);
	}
	/*
	 * Function to cancel the transaction
	 */
	public void cancel(){
		mdaEfsm.cancel();
	}
	/*
	 * Function to start pumping gas
	 */
	public void startPump(){
		mdaEfsm.startPump();
	}
	/*
	 * Function to dispose a gallon of gas
	 */
	public void pumpGallon(){
		mdaEfsm.pump();
	}
	/*
	 * Function to stop pump gas
	 */
	public void stopPump(){
		mdaEfsm.stopPump();
		mdaEfsm.receipt();
	}
	
}
