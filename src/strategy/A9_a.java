package strategy;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A9_a - For gas pump 1.
 * 
 * This class implements A9 interface by overriding the abstract method with a generic strategy for both the GasPumps.
 * @author cheth
 *
 */
public class A9_a implements A9{

	public void readyMsg() {
		System.out.println("\nReady to pump gas!\n");
	}
}
