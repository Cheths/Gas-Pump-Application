package application;
import java.util.Scanner;

/**
 * APPLICATION DRIVER ELEMENT
 * User Interface for using GasPump application.
 * 
 * This class is the trigger point when the jar is executed.
 * This class manages the user interface, interprets the choices to invoke desired events and actions. 
 * @author cheth
 *
 */
public class ApplicationDriver {

	public static void main(String args[]){
		System.out.println("\n###########################");
		System.out.println("Welcome To Gas Pump System!");
		System.out.println("###########################");
		String choice = "";
		
		while(!choice.equals("Q")){
			
			System.out.println("1.Gas pump-1\t2.Gas Pump-2\tQ.Exit\nMake Your Choice: ");
			Scanner input = new Scanner(System.in);
			choice = input.next();
			
			switch(choice){
				case "1": System.out.println("\n****************Gas Pump 1****************");
							printBorder();
							System.out.println("Menu options are shown once after choosing gas system. Please note down the choices.");
							System.out.println("0.Activate\n1.Start\t2.Pay Credit\t3.Reject\t4.Cancel\t5.Approved\n6.Super\t7.Regular\t"
									+ "8.Start Pump\t9.Pump Gallon\t10.Stop Pump\nQ.Exit Driver");
							printBorder();
							gasPump1Driver();
							break;
				case "2": System.out.println("****************Gas Pump 2****************");
							printBorder();
							System.out.println("Menu options are shown once after choosing gas system. Please note down the choices.");
							System.out.println("0.Activate\n1.Start\t2.Pay Cash\t3.Cancel\t4.Premium\t5.Regular\n6.Super\t7.Start Pump\t"
									+ "8.Pump Liter\t9.Stop\t10.Receipt\t11.No Receipt\nQ.Exit Driver");
							printBorder();
							gasPump2Driver();
							break;
				case "Q":System.out.println("Thank you.Please Visit Again!!");
							break;
				default: System.out.println("Invalid choice");
							break;
			}
		}
	}
	
	public static void gasPump1Driver(){
		String choice = "";
		GasPump1 gp1 = new GasPump1();
		
		while(!choice.equals("Q")){
			System.out.print("Please make a choice? ");
			
			Scanner input = new Scanner(System.in);
			choice = input.next();
			
			switch(choice){
				case "0": System.out.println("Executing Activate(float a, float b)");
							System.out.print("Enter numerical value for a: ");
							float a = input.nextFloat();
							System.out.print("Enter numerical value for b: ");
							float b = input.nextFloat();
							gp1.activate(a, b);
							break;
				case "1": System.out.println("\nExecuting Start()..\n");
						  	gp1.start();
						    break;
				case "2": System.out.println("\nExecuting PayCredit()..\n");
							gp1.payCredit();
						    break;
				case "3": System.out.println("\nExecuting Reject()..\n");
							gp1.reject();
							break;
				case "4": System.out.println("\nExecuting Cancel()..\n");
							gp1.cancel();
				  			break;
				case "5": System.out.println("\nExecuting Approved()..\n");
							gp1.approved();
				  			break;
				case "6": System.out.println("\nExecuting Super()..\n");
							gp1.superGas();
				  			break;
				case "7": System.out.println("\nExecuting Regular()..\n");
							gp1.regularGas();
				  			break;
				case "8": System.out.println("\nExecuting StartPump()..\n");
							gp1.startPump();
				  			break;
				case "9": System.out.println("\nExecuting PumpGallon()..\n");
							gp1.pumpGallon();
				  			break;
				case "10": System.out.println("\nExecuting StopPump()..\n");
							gp1.stopPump();
				  			break;
				case "Q": System.out.println("\nExiting driver..\n");
						  break;
				default: System.out.println("\nInvalid choice\n");
						break;
			}
		}
//		input.close();
		gp1 = null;
	}
	
	
	public static void gasPump2Driver(){
		String choice = "";
		GasPump2 gp2 = new GasPump2();
		
		while(!choice.equals("Q")){
			System.out.print("Please make a choice? ");
			
			Scanner input = new Scanner(System.in);
			choice = input.next();
			
			switch(choice){
				case "0": System.out.println("Executing Activate(int a, int b,int c)");
							System.out.print("Enter numerical value for a: ");
							int a = input.nextInt();
							System.out.print("Enter numerical value for b: ");
							int b = input.nextInt();
							System.out.print("Enter a numerical value for c: ");
							int c = input.nextInt();
							gp2.activate(a, b, c);
							break;
				case "1": printBorder();
							System.out.println("\nExecuting Start()..\n");
							gp2.start();
						    break;
				case "2": printBorder();
							System.out.println("\nExecuting PayCash()..\n");
							System.out.print("Enter cash amount: ");
							float cash = input.nextFloat();
							gp2.payCash(cash);
						    break;
				case "3": System.out.println("\nExecuting Cancel()..\n");
							gp2.cancel();
							break;
				case "4": System.out.println("\nExecuting Premium()..\n");
							gp2.premiumGas();
				  			break;
				case "5": System.out.println("\nExecuting Regular()..\n");
							gp2.regularGas();
				  			break;
				case "6": System.out.println("\nExecuting Super()..\n");
							gp2.superGas();
				  			break;
				case "7": System.out.println("\nExecuting StartPump()..\n");
							gp2.startPump();
				  			break;
				case "8": System.out.println("\nExecuting PumpLiter()..\n");
							gp2.pumpLiter();
				  			break;
				case "9": System.out.println("\nExecuting Stop()..\n");
							gp2.stop();
				  			break;
				case "10": System.out.println("\nExecuting Receipt()..\n");
							gp2.receipt();
				  			break;
				case "11": System.out.println("\nExecuting NoReceipt()..\n");
							gp2.noReceipt();
				  			break;
				case "Q": System.out.println("\nExiting driver..\n");
						  break;
				default: System.out.println("\nInvalid choice\n");
						break;
			}
		}
//		input.close();
		gp2 = null;
	}
	
	public static void printBorder(){
		System.out.println("======================================================================================");
	}
}
