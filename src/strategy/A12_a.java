package strategy;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A12_a - For gas pump 1.
 * 
 * This class implements A12 interface by overriding the abstract method with a generic strategy for both the GasPumps.
 * @author cheth
 *
 */
public class A12_a implements A12{

	public void stopMsg() {
		System.out.println("Gas Pump Stopped..\n");
	}
}
