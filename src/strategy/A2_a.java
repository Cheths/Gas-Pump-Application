package strategy;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A2_a - For gas pump 1.
 * 
 * This class implements A2 interface by overriding the abstract method with a specific strategy for GasPump1.
 * @author cheth
 *
 */
public class A2_a implements A2{
	/*
	 * Displays “Pay Credit” message
	 */
	public void payMessage() {
		System.out.println("\nPayment mode: Credit Card\n");
	}
}
