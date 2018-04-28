package strategy;
/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A2_b - For gas pump 2.
 * 
 * This class implements A2 interface by overriding the abstract method with a specific strategy for GasPump2.
 * @author cheth
 *
 */
public class A2_b implements A2{
	/*
	 * Displays “Pay Cash” message.
	 */
	public void payMessage() {
		System.out.println("\nPayment mode: Cash\n");
	}
}
