package strategy;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A6_a - For gas pump 1.
 * 
 * This class implements A6 interface by overriding the abstract method with a specific strategy for GasPump1.
 * @author cheth
 *
 */
public class A6_a implements A6{
	
	public void displayMenu() {
		System.out.println("\nPlease select Gas type:\n6.Regular\t7.Super\n");
	}

}
