package state;
/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S2 state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for S2 state.
 * @author cheth
 *
 */
public class S2 extends State{
	
	public S2() {
		insertBorder();
		System.out.println("Entering S2 State..");
		insertBorder();
	}
	
	/*
	 * GasPump1: Payment approved message is shown through OP class and sets the current state pointer to S3.
	 * @see state.State#approved(state.StateContext)
	 */
	public void approved(StateContext sm){
		sm.op.displayMenu();
		sm.setCurrent(new S3());
	}
	
	/*
	 * GasPump1: Payment rejected message is shown through OP class and sets the current state pointer to S0.
	 * @see state.State#reject(state.StateContext)
	 */
	public void reject(StateContext sm){
		sm.op.rejectMsg();
		sm.setCurrent(new S0());
	}
}
