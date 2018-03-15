import java.util.Scanner;

public class Summer {
	
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.print("Enter a number for me to sum to: ");
			num = kb.nextInt();
			total = 0;
			for (int i = 0; i < num; i++) {
				total += i;
			}
			if (num >= 0) {
				System.out.println("Your total is " + total + ".");
			}
			else {
				System.out.println("Later!");
			}
		}while (num >= 0);
	}
}