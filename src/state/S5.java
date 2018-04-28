package state;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S5 state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for S5 state.
 * @author cheth
 *
 */
public class S5 extends State{

	public S5() {
		insertBorder();
		System.out.println("Entering S5 state..");
		insertBorder();
	}
	
	/*
	 * A liter or gallon is pumped and gas units pumped is shown through OP class.
	 * @see state.State#pump(state.StateContext)
	 */
	public void pump(StateContext sm){
		sm.op.pumpGasUnit();
		sm.op.gasPumpedMsg();
	}
	/*
	 * Gas pump is stopped message is displayed and current state pointer is pointing to S6.
	 * @see state.State#stopPump(state.StateContext)
	 */
	public void stopPump(StateContext sm){
		sm.op.stopMsg();
		sm.setCurrent(new S6());
	}
}
