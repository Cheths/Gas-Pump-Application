package strategy;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A3_a - For gas pump 1.
 * 
 * This class implements A3 interface by overriding the abstract method with a generic strategy for both the GasPumps.
 * @author cheth
 *
 */
public class A3_a implements A3 {
	/*
	 * Displays “Payment Rejected” message
	 */
	public void rejectMessage() {
		System.out.println("Payment Rejected!\n");
	}
}
