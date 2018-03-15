import java.util.Scanner;

public class Fraction {
	private int numerator, denominator = 1;
	
	public void setFraction(int num, int den) {
		if (den != 0) {
			numerator = num;
			denominator = den;
		}
	}
	//Not in the assignment, but useful and safe
	public int getNumerator() {return numerator;}
	public int getDenominator() {return denominator;}
	
	public double toDouble() {
		return (double)numerator/denominator;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
}

class FractionTester {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a, b;
		Fraction f = new Fraction();
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your numerator and denominator: ");
			a = kb.nextInt();
			b = kb.nextInt();
			
			f.setFraction(a, b);
			System.out.println("Fraction: " + f.toString() + ", decimal: " + f.toDouble());
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	