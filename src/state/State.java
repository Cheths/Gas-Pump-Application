package state;
/**
 * STATE PATTERN ELEMENT
 * It is the abstract class for all the states. StateContext interfaces with this state.
 * 
 * This class represents the abstract class for States. 
 * Child state classes give the concrete implementation for all the functions in the current class.
 * @author cheth
 *
 */
public abstract class State {

	public void activate(StateContext sm){}
	public void start(StateContext sm){}
	public void payType(int t,StateContext sm){}
	public void approved(StateContext sm){}
	public void reject(StateContext sm){}
	public void selectGas(int g,StateContext sm){}
	public void cancel(StateContext sm){}
	public void startPump(StateContext sm){}
	public void pump(StateContext sm){}
	public void stopPump(StateContext sm){}
	public void receipt(StateContext sm){}
	public void noReceipt(StateContext sm){}
	
	public void insertBorder(){
		System.out.println("---------------------");
	}
}
