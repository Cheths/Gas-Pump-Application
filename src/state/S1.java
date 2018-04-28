package state;
/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S1 state. StateContext will interface with this state.
 * 
 * This class represents the concrete class for S1 state.
 * @author cheth
 *
 */
public class S1 extends State{
	public S1() {
		insertBorder();
		System.out.println("Entering S1 State..");
		insertBorder();
	}
	
	/*
	 * GasPump1: T argument has a value of 1 which suggests credit payment and sets the current state pointer to S2.
	 * GasPump2: T argument has a value of 2 which suggests cash payment stores the cash and display menu through OP class and sets the current state pointer to S3.
	 * @see state.State#payType(int, state.StateContext)
	 */
	public void payType(int t,StateContext sm){
		if(t == 1){
			sm.setCurrent(new S2());
		} else if (t == 2){
			sm.op.storeCash();
			sm.op.displayMenu();
			sm.setCurrent(new S3());
		}
	}
}
