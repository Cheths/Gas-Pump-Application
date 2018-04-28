package state;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S4 state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for S4 state.
 * @author cheth
 *
 */
public class S4 extends State{

	public S4() {
		insertBorder();
		System.out.println("Entering S4 state..");
		insertBorder();
	}
	/*
	 * Gas pump is started by initializing gas pump parameters and “Ready to pump” message is shown through OP class and current state pointer is set to S5.
	 * @see state.State#startPump(state.StateContext)
	 */
	public void startPump(StateContext sm){
		sm.op.setInitialValues();
		sm.op.readyMsg();
		sm.setCurrent(new S5());
	}
}
