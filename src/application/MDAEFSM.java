package application;
import abstractfactory.AbstractFactory;
import state.StateContext;

/**
 * MDA ARCHITECTURE ELEMENT
 * Meta model for MDA Architecture.
 * 
 * This class represents platform independent logic for all its clients i.e.,GasPump1, GasPump2. 
 * Seperation of this functionality allows for reduced effort during maintenance and when new clients are added.
 * @author cheth
 *
 */
public class MDAEFSM {

	StateContext stateCtx;
	/*
	 * To initialize sc object by passing factory object
	 */
	public MDAEFSM(AbstractFactory factory) {
		stateCtx = new StateContext(factory);
	}
	/*
	 * Call activate() through sc of StateContext class
	 */
	public void activate(){
		stateCtx.activate();
	}
	/*
	 * Call start() through sc of StateContext class
	 */
	public void start(){
		stateCtx.start();
	}
	/*
	 * Call payType() through sc of StateContext class
	 */
	public void payType(int t){
		stateCtx.payType(t);
	}
	/*
	 * Call approved() through sc of StateContext class
	 */
	public void approved(){
		stateCtx.approved();
	}
	/*
	 * Call reject() through sc of StateContext class
	 */
	public void reject(){
		stateCtx.reject();
	}
	/*
	 * Call selectGas() through sc of StateContext class
	 */
	public void selectGas(int g){
		stateCtx.selectGas(g);
	}
	/*
	 * Call cancel() through sc of StateContext class
	 */
	public void cancel(){
		stateCtx.cancel();
	}
	/*
	 * Call startPump() through sc of StateContext class
	 */
	public void startPump(){
		stateCtx.startPump();
	}
	/*
	 * Call pump() through sc of StateContext class
	 */
	public void pump(){
		stateCtx.pump();
	}
	/*
	 * Call stopPump() through sc of StateContext class
	 */
	public void stopPump(){
		stateCtx.stopPump();
	}
	/*
	 * Call receipt() through sc of StateContext class
	 */
	public void receipt(){
		stateCtx.receipt();
	}
	/*
	 * Call noReceipt() through sc of StateContext class
	 */
	public void noReceipt(){
		stateCtx.noReceipt();
	}
}
