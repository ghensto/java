import java.util.Scanner;

public class Fractionv2 {
	private int numerator, denominator = 1;
	
	public Fractionv2() {}
	
	public Fractionv2(int num) {
		numerator = num;
		denominator = 1;
	}
	
	public Fractionv2(int num, int den) {
		if (den != 0) {
			numerator = num;
			denominator = den;
		}
	}
	
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
		Fractionv2 f = new Fractionv2();
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your numerator and denominator: ");
			a = kb.nextInt();
			b = kb.nextInt();
			
			f = new Fractionv2(a, b);
			System.out.println("Fraction: " + f.toString() + ", decimal: " + f.toDouble());
			System.out.println("Fraction value cubed: " + Math.pow(f.toDouble(), 3));
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	