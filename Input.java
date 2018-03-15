import java.util.Scanner;


public class Input {
	
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		for(int i = args.length -1 ; i >= 0; i--)
			System.out.print(args[i] + ' ');
		System.out.println();
		
		System.out.print("Enter your first name: ");
		String fname = kb.next();
		System.out.print("Enter the rest of your name: ");
		kb.nextLine();
		String name = kb.nextLine();
		System.out.println("Hello " + fname + ' ' + name + "!");
		
		int a, b;
		System.out.print("Enter two numbers: ");
		a = kb.nextInt();
		b = kb.nextInt();
		System.out.println(a + " + " + b + " = " + (a + b) + ".");
		
		int x = 17, y = 12;
		double q = 14.3;
		System.out.println(x/y +q);
	}
}










