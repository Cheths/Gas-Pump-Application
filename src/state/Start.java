package state;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the Start state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for Start state.
 * @author cheth
 *
 */
public class Start extends State{

	public Start() {
		insertBorder();
		System.out.println("Entering start state..");
		insertBorder();
	}
	
	/*
	 * Gas pump is activated by storing the data(prices of gas types) through OP class and sets the current state pointer to S0.
	 * @see state.State#activate(state.StateContext)
	 */
	public void activate(StateContext sm){
		sm.op.storeData();
		sm.setCurrent(new S0());
	}
}
