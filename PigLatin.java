import java.util.Scanner;


public class PigLatin {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		String name, amenay = "";
		System.out.print("Enter your first name: ");
		name = kb.next();
		if (name.length() > 0){
			if (name.length() > 1) {
				amenay += name.substring(1,2).toUpperCase();
				amenay += name.substring(2);
				amenay += name.substring(0,1).toLowerCase();
			}
			else {
				amenay = name;
			}
			amenay += "ay";
		}
		System.out.println("Hello, " + amenay);	
	}
}