package Assignment3_Q2;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluation e=new Evaluation();
		 Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n===== MENU =====");
	            System.out.println("1. Evaluate Postfix Expression");
	            System.out.println("2. Evaluate Prefix Expression");
	            System.out.println("3. Exit");
	            System.out.print("Enter Your Choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Postfix Expression (use space): ");
	                    String postfix = sc.nextLine();
	                    System.out.println("Result = " + e.evaluatePostfix(postfix));
	                    break;

	                case 2:
	                    System.out.print("Enter Prefix Expression (use space): ");
	                    String prefix = sc.nextLine();
	                    System.out.println("Result = " + e.evaluatePrefix(prefix));
	                    break;

	                case 3:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        } while (choice != 3);

	        sc.close();

	}

}
