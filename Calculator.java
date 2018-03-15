

import java.util.Scanner;


public class Calculator {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		double a, b, total;
		int choice;
		
		do {
			System.out.print("Enter an operation\n"
							+ "1) Addition\n"
							+ "2) Subtraction\n"
							+ "3) Multiplication\n"
							+ "4) Division\n"
							+ "5) Exit\n"
							+ ": ");
			choice = kb.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.print("Enter two values to add: ");
				a = kb.nextDouble();
				b = kb.nextDouble();
				total = a + b;
				System.out.println(a + " + " + b + " = " + total + ".\n");
				break;
			case 2:
				System.out.print("Enter two values to subtract: ");
				a = kb.nextDouble();
				b = kb.nextDouble();
				total = a - b;
				System.out.println(a + " -" + b + " = " + total + ".\n");
				break;
			case 3:
				System.out.print("Enter two values to multiply: ");
				a = kb.nextDouble();
				b = kb.nextDouble();
				total = a * b;
				System.out.println(a + " * " + b + " = " + total + ".\n");
				break;
			case 4:
				System.out.print("Enter two values to divide: ");
				a = kb.nextDouble();
				b = kb.nextDouble();
				total = a / b;
				System.out.println(a + " / " + b + " = " + total + ".\n");
				break;
			case 5:
				System.out.println("Shutting off.");
				break;
			default:
				System.out.println("Please choose from the options below.\n");
			}
			
		}while(choice != 5);
	}
}