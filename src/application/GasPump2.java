package application;

import abstractfactory.AbstractFactory;
import abstractfactory.GasPump2CF;
import datastore.DataStore;

/**
 * Model Architecture Element
 * Input Processor for MDA Architecture
 * 
 * This class represents GasPump2 component Implementation which addresses all the needs of GasPump2 operations.
 * @author cheth
 *
 */
public class GasPump2 {

	MDAEFSM mdaEfsm;
	AbstractFactory factory;
	DataStore dataStore;
	/*
	 * Constructor to initialize abstract factory, datastore and mdaefsm objects.
	 */
	public GasPump2() {
		factory = new GasPump2CF();
		mdaEfsm = new MDAEFSM(factory);
		dataStore = factory.getDataStore();
	}
	/*
	 * Function to activate the gas pump with initial parameters used Function to set gas cost
	 */
	public void activate(int a,int b, int c){
		if(a>0 && b>0 && c>0){
			dataStore.setTempRPriceI(a);
			dataStore.setTempPPriceI(b);
			dataStore.setTempSPriceI(c);
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
	 * Function to make the payment for gas through cash where parameter represents cash entered.
	 */
	public void payCash(float c){
		if(c>0){
			dataStore.setTempCash(c);
			mdaEfsm.payType(2);
		}
	}
	/*
	 * Function to select Super gas type
	 */
	public void superGas(){
		mdaEfsm.selectGas(2);
	}
	/*
	 * Function to select Premium gas type
	 */
	public void premiumGas(){
		mdaEfsm.selectGas(3);
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
	 * Function to dispose a liter of gas
	 */
	public void pumpLiter(){
		float currentGasCost = (dataStore.getLiter() + 1)*dataStore.getPriceI();
		if(dataStore.getCash() < currentGasCost){
			mdaEfsm.stopPump();
		} else {
			mdaEfsm.pump();
		}
	}
	/*
	 * Function to stop pump gas
	 */
	public void stop(){
		mdaEfsm.stopPump();
	}
	/*
	 * Function to request a receipt
	 */
	public void receipt(){
		mdaEfsm.receipt();
	}
	/*
	 * Function to not provide a receipt
	 */
	public void noReceipt(){
		mdaEfsm.noReceipt();
	}
}
