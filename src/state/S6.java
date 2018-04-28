package state;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S6 state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for S6 state.
 * @author cheth
 *
 */
public class S6 extends State{

	public S6() {
		insertBorder();
		System.out.println("Entering S6 state..");
		insertBorder();
	}
	
	/*
	 * Receipt is generated for the gas disposed and cash left is returned depending on the gas pump through OP class and current state pointer is set to S0.
	 * @see state.State#receipt(state.StateContext)
	 */
	public void receipt(StateContext sm){
		sm.op.printReceipt();
		sm.op.returnCash();
		sm.setCurrent(new S0());
	}
	
	/*
	 * Only cash left is returned for gas pump 2 through OP class and current state pointer is set to S0.
	 * @see state.State#noReceipt(state.StateContext)
	 */
	public void noReceipt(StateContext sm){
		sm.op.returnCash();
		sm.setCurrent(new S0());
	}
}
