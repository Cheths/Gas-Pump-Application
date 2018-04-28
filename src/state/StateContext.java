package state;

import abstractfactory.AbstractFactory;
import strategy.OP;

/**
 * STATE PATTERN ELEMENT
 * It is the context class for the State Pattern with which MDA interfaces.
 * 
 * This class represents the context class which manages the states by a 
 * currState pointer as a reference to forward calls to specific state classes.
 * 
 * @author cheth
 *
 */
public class StateContext {

	private State currState;
	public OP op;
	
	/*
	 * Constructor to initialize op object and point currState to Start state.
	 */
	public StateContext(AbstractFactory factory) {
		op = new OP(factory);
		currState = new Start();
	}
	
	/*
	 * Change current state according to the state passed as argument
	 */
	public void setCurrent(State s){
		currState = s;
	}
	
	/*
	 * Call activate() of current state pointing to.
	 */
	public void activate(){
		currState.activate(this);
	}
	
	/*
	 * Function to call start() of current state pointing to.
	 */
	public void start(){
		currState.start(this);
	}
	
	/*
	 * Call payType() of current state pointing to.
	 */
	public void payType(int t){
		currState.payType(t,this);
	}
	
	/*
	 * Call approved() of current state pointing to.
	 */
	public void approved(){
		currState.approved(this);
	}
	
	/*
	 * Call reject() of current state pointing to
	 */
	public void reject(){
		currState.reject(this);
	}
	
	/*
	 * Call selectGas() of current state pointing to
	 */
	public void selectGas(int g){
		currState.selectGas(g,this);
	}
	
	/*
	 * Call cancel() of current state pointing to
	 */
	public void cancel(){
		currState.cancel(this);
	}
	
	/*
	 * Call startPump() of current state pointing to
	 */
	public void startPump(){
		currState.startPump(this);
	}
	
	/*
	 * Call pump () of current state pointing to.
	 */
	public void pump(){
		currState.pump(this);
	}
	
	/*
	 * Call stopPump() of current state pointing to.
	 */
	public void stopPump(){
		currState.stopPump(this);
	}
	
	/*
	 * Call receipt() of current state pointing to.
	 */
	public void receipt(){
		currState.receipt(this);
	}
	
	/*
	 * Call noReceipt() of current state pointing to.
	 */
	public void noReceipt(){
		currState.noReceipt(this);
	}
}
