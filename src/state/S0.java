package state;

/*
 * STATE PATTERN ELEMENT
 * Concrete class for the S0 state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for S0 state.
 */
public class S0 extends State{
	
	public S0() {
		insertBorder();
		System.out.println("Entering S0 State..");
		insertBorder();
	}
	
	/*
	 * GasPump1: Pay Credit is displayed through OP class and sets the current state pointer to S1.
	 * GasPump2: Pay cash is displayed through OP class and sets the current state pointer to S1.
	 * @see state.State#start(state.StateContext)
	 */
	public void start(StateContext sm){
		sm.op.payMsg();
		sm.setCurrent(new S1());
	}
}
