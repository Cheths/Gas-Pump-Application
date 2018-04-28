package state;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S3 state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for S3 state.
 * @author cheth
 *
 */
public class S3 extends State{
	
	public S3() {
		insertBorder();
		System.out.println("Entering S3 state..");
		insertBorder();
	}
	/*
	 * Transaction Cancelled message is shown through OP class and current state pointer is sets the to S0.
	 * @see state.State#cancel(state.StateContext)
	 */
	public void cancel(StateContext sm){
		sm.op.cancelMsg();
		sm.op.returnCash();
		sm.setCurrent(new S0());
	}
	/*
	 * Gas price is stored based on the gas type selected and current state pointers is set to S4.
	 * @see state.State#selectGas(int, state.StateContext)
	 */
	public void selectGas(int g,StateContext sm){
		sm.op.setPrice(g);
		sm.setCurrent(new S4());
	}
}
