package strategy;

/**
 * STRATEGY PATTERN ELEMENT
 * Concrete Strategy A1_a - For gas pump 1.
 * 
 * @author cheth
 *
 */
public class A4_a implements A4 {

	public void cancelMessage() {
		System.out.println("\nTransaction cancelled\n");
	}
}
