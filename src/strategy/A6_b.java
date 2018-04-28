package strategy;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A6_b - For gas pump 2.
 * 
 * This class implements A6 interface by overriding the abstract method with a specific strategy for GasPump2.
 * @author cheth
 *
 */
public class A6_b implements A6{
	
	public void displayMenu() {
		System.out.println("\nPlease select Gas type:\n4.Premium\t5.Regular\t6.Super\n");
	}

}
